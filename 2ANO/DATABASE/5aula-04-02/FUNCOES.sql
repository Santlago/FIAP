SELECT TO_NUMBER('123.45') AS NUMEO_CONVERTIDO FROM DUAL;
SELECT TO_CHAR(123.45) AS STRING_CONVERTIDA FROM DUAL;
SELECT TO_NUMBER('123.45', '999.99') AS NUMERO_CONVERTIDO FROM DUAL;
SELECT TO_CHAR(12345.67, '999,999.99') AS NUMERO_FORMATADO FROM DUAL;

SELECT SUM(SALARY) AS TOTAL_SALARIOS FROM EMPLOYEES;
SELECT AVG(SALARY) AS MEDIA_SALAIOS FROM EMPLOYEES;
SELECT MAX(SALARY) AS MAIOR_SALARIO FROM EMPLOYEES;
SELECT MIN(SALARY) AS MENOR_SALARIO FROM EMPLOYEES;

SELECT SUBSTR(LAST_NAME, 1, 3) AS TRES_PRIMEIRAS_LETRAS FROM EMPLOYEES;
SELECT INSTR(EMAIL, '@') AS POSICAO_ARROBA FROM EMPLOYEES;
SELECT LENGHT(FIRST_NAME) AS TAMANHO_PRIMEIO_NOME FROM EMPLOYEES;

SELECT LTRIM(JOB_TITLE) AS JOB_TITLE_SEM_ESPACO_ESQUERDO FROM JOBS;
SELECT RTRIM(JOB_TITLE) AS JOB_TITLE_SEM_ESPACO_DIREITO FROM JOBS;
SELECT TRIM(JOB_TITLE) AS JOB_TITLE_SEM_ESPACO FROM JOBS;
SELECT LPAD(JOB_TITLE) AS JOB_TITLE_SEM_ESPACO_ESQUERDO FROM JOBS;
SELECT RPAD(JOB_TITLE) AS JOB_TITLE_SEM_ESPACO_ESQUERDO FROM JOBS;

SELECT EXTRACT(YEAR FROM HIRE_DATE) AS ANO_CONTRATACAO FROM EMPLOYEES;
SELECT EXTRACT(MONTH FROM HIRE_DATE) AS ANO_CONTRATACAO FROM EMPLOYEES;
SELECT EXTRACT(DAY FROM HIRE_DATE) AS ANO_CONTRATACAO FROM EMPLOYEES;