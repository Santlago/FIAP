-- 2.	Liste os sobrenomes dos funcion�rios do departamento 50 sem espa�os em branco, em ordem alfab�tica.
SELECT TRIM(LAST_NAME) FROM EMPLOYEES WHERE department_id = 50 ORDER BY LAST_NAME ASC;