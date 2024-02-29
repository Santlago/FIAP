SET SERVEROUTPUT ON;
DECLARE
    SEXO VARCHAR2(1); -- Define the variable without assigning a value
BEGIN
    SEXO := '&SEXO'; -- Assign a value to the variable using substitution
    IF UPPER(SEXO) = 'M' THEN
        DBMS_OUTPUT.PUT_LINE('O SEXO INFORMADO É MASCULINO');
    ELSIF UPPER(SEXO) = 'F' THEN
        DBMS_OUTPUT.PUT_LINE('O SEXO INFORMADO É FEMININO');
    ELSE
        DBMS_OUTPUT.PUT_LINE('O SEXO INFORMADO É OUTROS');
    END IF;
END;