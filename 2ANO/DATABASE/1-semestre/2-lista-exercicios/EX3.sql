-- 3.	Mostre as datas de contratação dos funcionários do departamento 20 no formato 'DD/MM/YYYY', em ordem cronológica.
SELECT TO_CHAR(HIRE_DATE, 'DD/MM/YYYY') FROM EMPLOYEES WHERE department_id = 20;