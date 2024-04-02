-- 7.	Liste os salários truncados dos funcionários do departamento 80, em ordem decrescente de salário.
SELECT TRUNC(SALARY, 2) FROM EMPLOYEES WHERE DEPARTMENT_ID = 80 ORDER BY SALARY DESC;