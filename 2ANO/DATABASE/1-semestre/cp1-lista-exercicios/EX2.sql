SET SERVEROUTPUT ON;

DECLARE
    V_ESTADO VARCHAR2(100) := 'SP'; 
    V_QUANT_COMPRAS NUMBER := 0;
    V_SOMA_COMPRAS NUMBER := 0;
BEGIN
    -- Loop through each client record
    FOR cliente IN (SELECT * FROM TABELA_DE_CLIENTES WHERE ESTADO = V_ESTADO) LOOP
        -- Increment the count of purchases
        V_QUANT_COMPRAS := V_QUANT_COMPRAS + 1;
        
        -- Accumulate the sum of purchases
        V_SOMA_COMPRAS := V_SOMA_COMPRAS + cliente.VOLUME_DE_COMPRA;
    END LOOP;

    dbms_output.PUT_LINE('Média do volume de compras dos clientes que moram no estado de ' || V_ESTADO || ': ' || V_SOMA_COMPRAS / V_QUANT_COMPRAS);
END;