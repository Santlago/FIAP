-- 10.	Liste os sobrenomes em mai�sculas dos funcion�rios do departamento 50, agrupados por sobrenome e em ordem crescente de sal�rio-m�nimo.
SELECT MIN(SALARY) AS SALARIO_MINIMO, UPPER(LAST_NAME) AS SOBRENOME FROM EMPLOYEES WHERE department_id = 50 GROUP BY LAST_NAME ORDER BY SALARIO_MINIMO ASC;