-- 1.	Liste os sal�rios dos funcion�rios do departamento 30, arredondados para duas casas decimais, em ordem decrescente de sal�rio.
SELECT ROUND(SALARY, 2) FROM EMPLOYEES WHERE DEPARTMENT_ID = 30 ORDER BY SALARY DESC;