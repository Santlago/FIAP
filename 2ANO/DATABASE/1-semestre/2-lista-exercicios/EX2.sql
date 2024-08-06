-- 2.	Liste os sobrenomes dos funcionários do departamento 50 sem espaços em branco, em ordem alfabética.
SELECT TRIM(LAST_NAME) FROM EMPLOYEES WHERE department_id = 50 ORDER BY LAST_NAME ASC;