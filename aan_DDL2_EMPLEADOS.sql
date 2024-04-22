/*ACTUALIZAMOS LA BDD*/
/*Modificar la dirección de la Delegación de Huelva a ‘Langostino, 12’. */
UPDATE Delegaciones
SET Direccion = 'Langostino, 12'
WHERE Cod_del = '21000';
/*Actualizar el nuevo responsable del departamento DEP SEVILLA 01 a EMP10. Si no puedes, modifica lo
que sea necesario*/
UPDATE Departamentos
SET Director = 'EMP10'
WHERE Cod_dep = 'D0141';
/*Reducir en un 10% el presupuesto de los departamentos que actualmente tengan un presupuesto
superior a 180.000€ */
UPDATE Departamentos
SET Presupuesto = Presupuesto * 0.9
WHERE Presupuesto > 180000;
/*Reducir 5.000€ el presupuesto de los departamentos restantes. */
UPDATE Departamentos
SET Presupuesto = Presupuesto - 5000
WHERE Presupuesto < 162000;
/*Subir el sueldo un 5% a los empleados que hayan nacido antes de 1980. */
UPDATE Empleados
SET Salario = Salario * 1.05
WHERE YEAR(Fec_nac) < 1980;
/*A los restantes empleados, aumentarle el sueldo en 1.000€. */
UPDATE Empleados
SET Salario = Salario +1000
WHERE YEAR(Fec_nac) >= 1980;
/*Borrar el departamento 'DEP JAEN 01' */
UPDATE Departamentos
SET Dep_sup = NULL
WHERE Dep_sup = 'D0123';
UPDATE Empleados
SET Deptno = NULL
WHERE Deptno = 'D0123';
DELETE FROM Departamentos
WHERE Nombre = 'DEP JAEN 01';
/*Dar de baja el empleado Alfonso.*/
DELETE FROM Empleados
WHERE Nombre = 'Alfonso';
/*Eliminar la delegación de Huelva */
UPDATE Departamentos
SET Cod_del = NULL
WHERE Cod_del = '21000';
DELETE FROM Delegaciones
WHERE Cod_del = '21000';