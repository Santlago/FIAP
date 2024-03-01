-- DESCRIBE FIAP_PRODUTOS_DE_VENDAS;

-- SELECT DISTINCT DEALSIZE FROM FIAP_PRODUTOS_DE_VENDAS;
SET SERVEROUTPUT ON;
BEGIN
    FOR X IN (SELECT DISTINCT DEALSIZE, CUSTOMERNAME FROM FIAP_PRODUTOS_DE_VENDAS) LOOP
        IF X.DEALSIZE = 'Small' THEN
            DBMS_OUTPUT.PUT_LINE(X.CUSTOMERNAME ||' - PEQUENO PORTE');
        ELSIF X.DEALSIZE = 'Medium' THEN
            DBMS_OUTPUT.PUT_LINE(X.CUSTOMERNAME ||' - M�DIO PORTE');
        ELSIF X.DEALSIZE = 'Large' THEN
            DBMS_OUTPUT.PUT_LINE(X.CUSTOMERNAME ||' - GRANDE PORTE');
        END IF;
    END LOOP;
END;