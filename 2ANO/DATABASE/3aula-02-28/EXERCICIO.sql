SET SERVEROUTPUT ON;
DECLARE
    SEXO VARCHAR2(1); -- Define the variable without assigning a value
BEGIN
    SEXO := '&SEXO'; -- Assign a value to the variable using substitution
    IF UPPER(SEXO) = 'M' THEN
        DBMS_OUTPUT.PUT_LINE('O SEXO INFORMADO � MASCULINO');
    ELSIF UPPER(SEXO) = 'F' THEN
        DBMS_OUTPUT.PUT_LINE('O SEXO INFORMADO � FEMININO');
    ELSE
        DBMS_OUTPUT.PUT_LINE('O SEXO INFORMADO � OUTROS');
    END IF;
END;