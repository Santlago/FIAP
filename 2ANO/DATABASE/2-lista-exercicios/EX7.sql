-- 7.	Liste os sal�rios truncados dos funcion�rios do departamento 80, em ordem decrescente de sal�rio.
SELECT TRUNC(SALARY, 2) FROM EMPLOYEES WHERE DEPARTMENT_ID = 80 ORDER BY SALARY DESC;