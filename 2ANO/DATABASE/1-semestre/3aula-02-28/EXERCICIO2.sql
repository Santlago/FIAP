SET SERVEROUTPUT ON;
DECLARE
    VALOR_CARRO NUMBER := &VALOR_CARRO;
    VALOR_ENTRADA NUMBER := VALOR_CARRO * 0.2;
    VALOR_FINANCIAMENTO NUMBER := VALOR_CARRO - VALOR_ENTRADA;
    NUMERO_PARCELAS NUMBER := &NUMERO_PARCELAS;
BEGIN
    IF NUMERO_PARCELAS = 6 THEN
        DBMS_OUTPUT.PUT_LINE('VALOR DA ENTRADA: ' || VALOR_ENTRADA || ' VALOR  DAS PARCELAS: ' || ROUND((VALOR_FINANCIAMENTO * 1.1) / 6, 2));
    ELSIF NUMERO_PARCELAS = 12 THEN
        DBMS_OUTPUT.PUT_LINE('VALOR DA ENTRADA: ' || VALOR_ENTRADA || ' VALOR DAS PARCELAS: ' || ROUND((VALOR_FINANCIAMENTO * 1.15) / 12, 2));
    ELSIF NUMERO_PARCELAS = 18 THEN
        DBMS_OUTPUT.PUT_LINE('VALOR DA ENTRADA: ' || VALOR_ENTRADA || ' VALOR DAS PARCELAS: ' || ROUND((VALOR_FINANCIAMENTO * 1.20) / 18, 2));
    ELSE
        DBMS_OUTPUT.PUT_LINE('ESCOLHA PARCELAS ENTRE DE 6, 12 OU 18');
    END IF;
END;