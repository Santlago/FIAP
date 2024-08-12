SET SERVEROUTPUT ON;

DECLARE
    V_EMBALAGEM VARCHAR2(100) := 'PET'; -- Adjust the length according to your needs
    V_TOTAL_PRODUTOS NUMBER := 0;
BEGIN
    SELECT COUNT(*) INTO V_TOTAL_PRODUTOS
    FROM TABELA_DE_PRODUTOS
    WHERE EMBALAGEM = V_EMBALAGEM;

    dbms_output.PUT_LINE('Total de produtos com a embalagem ' || V_EMBALAGEM || ': ' || V_TOTAL_PRODUTOS);
END;