-- 1.	Escreva uma função em PL/SQL chamada "CalcularTotalPedido" que recebe o código de um pedido 
-- como parâmetro e retorna o valor total do pedido, calculado somando os valores dos itens do pedido.

-- Criando a Função
CREATE OR REPLACE FUNCTION CalcularTotalPedido(p_cod_pedido IN NUMBER)
RETURN NUMBER
IS
    v_total_pedido NUMBER(12,2);
BEGIN
    -- Inicializar o total do pedido
    v_total_pedido := 0;

    -- Calcular o total do pedido somando os valores dos itens
    FOR item IN (SELECT VAL_UNITARIO_ITEM, QTD_ITEM FROM item_pedido WHERE COD_PEDIDO = p_cod_pedido)
    LOOP
        IF item.VAL_UNITARIO_ITEM IS NOT NULL AND item.QTD_ITEM IS NOT NULL THEN
            v_total_pedido := v_total_pedido + (item.VAL_UNITARIO_ITEM * item.QTD_ITEM);
        ELSE
            -- Lançar exceção caso algum valor esteja ausente
            RAISE_APPLICATION_ERROR(-20001, 'Valor unitário ou quantidade do item não podem ser nulos.');
        END IF;
    END LOOP;

    RETURN v_total_pedido;
EXCEPTION
    WHEN OTHERS THEN
        -- Capturar e registrar qualquer exceção não tratada
        DBMS_OUTPUT.PUT_LINE('Ocorreu um erro: ' || SQLERRM);
        RETURN NULL;
END;


SET SERVEROUTPUT ON;

-- Testando a Função
DECLARE
    v_cod_pedido NUMBER := 5003; -- Substitua pelo código do pedido que deseja testar
    v_total_pedido NUMBER;
BEGIN
    -- Chamar a função CalcularTotalPedido e armazenar o resultado
    v_total_pedido := CalcularTotalPedido(v_cod_pedido);

    -- Verificar se o resultado é nulo (indica erro) ou exibir o valor total do pedido
    IF v_total_pedido IS NOT NULL THEN
        DBMS_OUTPUT.PUT_LINE('O valor total do pedido ' || v_cod_pedido || ' é: ' || v_total_pedido);
    ELSE
        DBMS_OUTPUT.PUT_LINE('Erro ao calcular o valor total do pedido ' || v_cod_pedido);
    END IF;
END;





-- 2.	Desenvolva uma função em PL/SQL denominada "BuscarQuantidadeProdutoEmEstoque" que aceita o código de um produto 
-- e o código de um estoque como argumentos e retorna à quantidade disponível desse produto no estoque especificado.

-- Criando a Função
CREATE OR REPLACE FUNCTION BuscarQuantidadeProdutoEmEstoque(
    p_cod_produto IN NUMBER,
    p_cod_estoque IN NUMBER
)
RETURN NUMBER
IS
    v_quantidade NUMBER;
BEGIN
    -- Inicializar a quantidade como 0
    v_quantidade := 0;

    -- Buscar a quantidade do produto no estoque
    SELECT QTD_PRODUTO
    INTO v_quantidade
    FROM estoque_produto
    WHERE COD_PRODUTO = p_cod_produto
    AND COD_ESTOQUE = p_cod_estoque;

    -- Retornar a quantidade encontrada
    RETURN v_quantidade;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        -- Tratar exceção quando não houver dados encontrados
        DBMS_OUTPUT.PUT_LINE('Produto não encontrado no estoque.');
        RETURN NULL;
    WHEN OTHERS THEN
        -- Capturar e registrar qualquer outra exceção não tratada
        DBMS_OUTPUT.PUT_LINE('Ocorreu um erro: ' || SQLERRM);
        RETURN NULL;
END;


-- Testando a Função
DECLARE
    v_cod_produto NUMBER := 1001; -- Substitua pelo código do produto que deseja testar
    v_cod_estoque NUMBER := 3001; -- Substitua pelo código do estoque que deseja testar
    v_quantidade NUMBER;
BEGIN
    -- Chamar a função BuscarQuantidadeProdutoEmEstoque e armazenar o resultado
    v_quantidade := BuscarQuantidadeProdutoEmEstoque(v_cod_produto, v_cod_estoque);

    -- Verificar se o resultado é nulo (indica erro) ou exibir a quantidade do produto no estoque
    IF v_quantidade IS NOT NULL THEN
        DBMS_OUTPUT.PUT_LINE('A quantidade do produto ' || v_cod_produto || ' no estoque ' || v_cod_estoque || ' é: ' || v_quantidade);
    ELSE
        DBMS_OUTPUT.PUT_LINE('Erro ao buscar a quantidade do produto no estoque.');
    END IF;
END;


-- 3.	Crie uma função em PL/SQL chamada "CalcularValorDescontoPedido" que recebe o código de um pedido como 
-- entrada e retorna o valor total do desconto aplicado no pedido, somando os descontos de todos os itens do pedido.


-- Criando a Função
CREATE OR REPLACE FUNCTION CalcularValorDescontoPedido(p_cod_pedido IN NUMBER)
RETURN NUMBER
IS
    v_total_desconto NUMBER(12,2);
BEGIN
    -- Inicializar o total do desconto
    v_total_desconto := 0;

    -- Calcular o total do desconto somando os descontos dos itens
    FOR item IN (SELECT VAL_DESCONTO_ITEM FROM item_pedido WHERE COD_PEDIDO = p_cod_pedido)
    LOOP
        IF item.VAL_DESCONTO_ITEM IS NOT NULL THEN
            v_total_desconto := v_total_desconto + item.VAL_DESCONTO_ITEM;
        ELSE
            -- Lançar exceção caso o desconto do item seja nulo
            RAISE_APPLICATION_ERROR(-20001, 'O desconto do item não pode ser nulo.');
        END IF;
    END LOOP;

    RETURN v_total_desconto;
EXCEPTION
    WHEN OTHERS THEN
        -- Capturar e registrar qualquer exceção não tratada
        DBMS_OUTPUT.PUT_LINE('Ocorreu um erro: ' || SQLERRM);
        RETURN NULL;
END;


-- Testando a Função
DECLARE
    v_cod_pedido NUMBER := 5002; -- Substitua pelo código do pedido que deseja testar
    v_valor_desconto NUMBER;
BEGIN
    -- Chamar a função CalcularValorDescontoPedido e armazenar o resultado
    v_valor_desconto := CalcularValorDescontoPedido(v_cod_pedido);

    -- Verificar se o resultado é nulo (indica erro) ou exibir o valor total do desconto do pedido
    IF v_valor_desconto IS NOT NULL THEN
        DBMS_OUTPUT.PUT_LINE('O valor total do desconto do pedido ' || v_cod_pedido || ' é: ' || v_valor_desconto);
    ELSE
        DBMS_OUTPUT.PUT_LINE('Erro ao calcular o valor total do desconto do pedido ' || v_cod_pedido);
    END IF;
END;


-- 4.	Escreva um procedimento em PL/SQL denominado "ListarPedidosCliente" que recebe o código de um cliente como 
-- parâmetro e lista todos os pedidos associados a esse cliente, incluindo detalhes como o número do pedido, a data do pedido e o valor total.

-- Criando o Procedimento
CREATE OR REPLACE PROCEDURE ListarPedidosCliente(p_cod_cliente IN NUMBER)
IS
BEGIN
    -- Listar os pedidos do cliente
    FOR pedido IN (SELECT COD_PEDIDO, DAT_PEDIDO, VAL_TOTAL_PEDIDO FROM pedido WHERE COD_CLIENTE = p_cod_cliente)
    LOOP
        DBMS_OUTPUT.PUT_LINE('Número do Pedido: ' || pedido.COD_PEDIDO);
        DBMS_OUTPUT.PUT_LINE('Data do Pedido: ' || TO_CHAR(pedido.DAT_PEDIDO, 'DD/MM/YYYY'));
        DBMS_OUTPUT.PUT_LINE('Valor Total do Pedido: ' || pedido.VAL_TOTAL_PEDIDO);
        DBMS_OUTPUT.PUT_LINE('------------------------');
    END LOOP;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        -- Tratar exceção quando não houver pedidos para o cliente especificado
        DBMS_OUTPUT.PUT_LINE('Não foram encontrados pedidos para o cliente.');
    WHEN OTHERS THEN
        -- Capturar e registrar qualquer outra exceção não tratada
        DBMS_OUTPUT.PUT_LINE('Ocorreu um erro: ' || SQLERRM);
END;


-- Testando o Procedimento 
DECLARE
    v_cod_cliente NUMBER := 2004; -- Substitua pelo código do cliente que deseja testar
BEGIN
    -- Chamar o procedimento ListarPedidosCliente com o código do cliente
    ListarPedidosCliente(v_cod_cliente);
END;



-- 5.	Desenvolva um procedimento em PL/SQL chamado "ListarItensPedido" que aceita o código de um pedido como entrada 
-- e lista todos os itens incluídos nesse pedido, fornecendo informações como o código do item, o nome do produto e a quantidade.

-- Criando o Procedimento
CREATE OR REPLACE PROCEDURE ListarItensPedido(p_cod_pedido IN NUMBER)
IS
BEGIN
    -- Listar os itens do pedido
    FOR item IN (SELECT ip.COD_ITEM_PEDIDO, p.NOM_PRODUTO, ip.QTD_ITEM
                  FROM item_pedido ip
                  INNER JOIN produto p ON ip.COD_PRODUTO = p.COD_PRODUTO
                  WHERE ip.COD_PEDIDO = p_cod_pedido)
    LOOP
        DBMS_OUTPUT.PUT_LINE('Código do Item: ' || item.COD_ITEM_PEDIDO);
        DBMS_OUTPUT.PUT_LINE('Nome do Produto: ' || item.NOM_PRODUTO);
        DBMS_OUTPUT.PUT_LINE('Quantidade: ' || item.QTD_ITEM);
        DBMS_OUTPUT.PUT_LINE('------------------------');
    END LOOP;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        -- Tratar exceção quando não houver itens para o pedido especificado
        DBMS_OUTPUT.PUT_LINE('Não foram encontrados itens para o pedido.');
    WHEN OTHERS THEN
        -- Capturar e registrar qualquer outra exceção não tratada
        DBMS_OUTPUT.PUT_LINE('Ocorreu um erro: ' || SQLERRM);
END;


-- Testando o Procedimento
DECLARE
    v_cod_pedido NUMBER := 5004; 
BEGIN
    -- Chamar o procedimento ListarItensPedido com o código do pedido
    ListarItensPedido(v_cod_pedido);
END;


-- 6.	Crie um procedimento em PL/SQL denominado "ListarMovimentosEstoqueProduto" que recebe o código de um produto como 
-- argumento e lista todos os movimentos de estoque associados a esse produto, incluindo detalhes como a data do movimento e o tipo de movimento.

-- Criando o Procedimento
CREATE OR REPLACE PROCEDURE ListarMovimentosEstoqueProduto(p_cod_produto IN NUMBER)
IS
BEGIN
    -- Listar os movimentos de estoque do produto
    FOR movimento IN (SELECT m.DAT_MOVIMENTO_ESTOQUE, tm.DES_TIPO_MOVIMENTO_ESTOQUE
                      FROM movimento_estoque m
                      INNER JOIN tipo_movimento_estoque tm ON m.COD_TIPO_MOVIMENTO_ESTOQUE = tm.COD_TIPO_MOVIMENTO_ESTOQUE
                      WHERE m.COD_PRODUTO = p_cod_produto)
    LOOP
        DBMS_OUTPUT.PUT_LINE('Data do Movimento: ' || movimento.DAT_MOVIMENTO_ESTOQUE);
        DBMS_OUTPUT.PUT_LINE('Tipo de Movimento: ' || movimento.DES_TIPO_MOVIMENTO_ESTOQUE);
        DBMS_OUTPUT.PUT_LINE('------------------------');
    END LOOP;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        -- Tratar exceção quando não houver movimentos de estoque para o produto especificado
        DBMS_OUTPUT.PUT_LINE('Não foram encontrados movimentos de estoque para o produto.');
    WHEN OTHERS THEN
        -- Capturar e registrar qualquer outra exceção não tratada
        DBMS_OUTPUT.PUT_LINE('Ocorreu um erro: ' || SQLERRM);
END;


-- Testando o Procedimento
DECLARE
    v_cod_produto NUMBER := 1002; 
BEGIN
    -- Chamar o procedimento ListarMovimentosEstoqueProduto com o código do produto
    ListarMovimentosEstoqueProduto(v_cod_produto);
END;











