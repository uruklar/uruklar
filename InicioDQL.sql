/* Calcula el salario medio de los empleados del departamento 20 de la tabla EMPLEADOS. */
SELECT AVG(SALARIO) AS Media_Salario
FROM EMPLEADOS
WHERE DEPT_NO =20;
/* Cuenta cuántos registros la tabla EMPLEADOS. */
SELECT COUNT(*) AS Total_Registros
FROM EMPLEADOS;
/* Cuenta cuántos registros de la tabla EMPLEADOS cobran comisión.*/
SELECT COUNT(*) AS Cobran_Comision
FROM EMPLEADOS
WHERE COMISION>0;
/* Calcula el salario máximo de la tabla EMPLEADOS.*/
SELECT MAX(SALARIO) AS Salario_Maximo
FROM EMPLEADOS;
/* Obtén el máximo nombre (alfabéticamente) de la tabla EMPLEADOS.*/
SELECT MAX(APELLIDO) AS Max_Apellido
FROM EMPLEADOS;
/* Obtén el nombre del empleado que tiene mayor salario.*/
SELECT APELLIDO
FROM EMPLEADOS
WHERE SALARIO = (SELECT MAX(SALARIO)FROM EMPLEADOS);
/* Obtén el mínimo salario de la tabla EMPLEADOS.*/
SELECT MIN(SALARIO) AS Min_Salario
FROM EMPLEADOS;
/* Obtén el nombre del empleado que tiene el mínimo salario.*/
SELECT APELLIDO
FROM EMPLEADOS
WHERE SALARIO = (SELECT MIN(SALARIO)FROM EMPLEADOS);
/* Calcula la suma de todos los salarios de la tabla EMPLEADOS.*/
SELECT SUM(SALARIO) AS Suma_Salarios
FROM EMPLEADOS;
/* Obtén la desviación típica de todos los salarios de la tabla EMPLEADOS. Averigua antes que es la desviación típica.*/
SELECT STDDEV(SALARIO) AS Des_tipica_Salarios
FROM EMPLEADOS;
/* Calcula el número de departamentos que hay en la tabla EMPLEADOS. Después,  calcula el número de personas que hay en cada departamento que hay en la tabla EMPLEADOS.*/
SELECT COUNT(DISTINCT DEPT_NO) AS Num_Dept
FROM EMPLEADOS;
SELECT DEPT_NO, COUNT(*) AS Num_Per_Dept
FROM EMPLEADOS
GROUP BY DEPT_NO;
/* A partir de la tabla EMPLEADOS, visualiza cuántos apellidos empiezan por la letra ‘A’.*/
SELECT COUNT(*) AS Apellidos_A
FROM EMPLEADOS
WHERE APELLIDO LIKE 'A%';
/* Obtén el nombre de los empleados que empiecen por la letra ‘A’ y que tengan máximo salario (de los que empiezan por la letra ‘A’).*/
SELECT APELLIDO
FROM EMPLEADOS
WHERE APELLIDO LIKE 'A%'
AND SALARIO = (
    SELECT MAX(SALARIO)
    FROM EMPLEADOS
    WHERE APELLIDO LIKE 'A%'
);