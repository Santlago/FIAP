-- 3.	Mostre as datas de contrata��o dos funcion�rios do departamento 20 no formato 'DD/MM/YYYY', em ordem cronol�gica.
SELECT TO_CHAR(HIRE_DATE, 'DD/MM/YYYY') FROM EMPLOYEES WHERE department_id = 20;