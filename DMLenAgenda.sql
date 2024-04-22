/*CREACION DE LA BASE DE DATOS*/
CREATE DATABASE pruebas;
/*ACTIVACION DE LA BASE DE DATOS*/
USE pruebas;
/*CREACION DE LA TABLA DE LA BASE DE DATOS*/
CREATE TABLE Agenda (
    Apellido VARCHAR(30) NOT NULL,
    Nombre VARCHAR(20) NOT NULL,
    Domicilio VARCHAR(30) NOT NULL,
    Telefono INT(9) NOT NULL,
    Prefijo VARCHAR(5) DEFAULT '+0034' NOT NULL
);
/*AÑADIR LOS DATOS A LA TABLA*/
INSERT INTO Agenda (Apellido, Nombre, Domicilio, Telefono, Prefijo) VALUES
('Alvarez', 'Alberto','Colon 123',423456798,'+0034'),
('Juarez', 'Juan','Avellaneda 123',445878778,'+0034'),
('Lopez', 'Maria','Urquiza 333',454545445, '+0047'),
('Lopez', 'Jose','Urquiza 333',423456798,'+0034'),
('Salas', 'Susana','Gral. Paz 1234',412345612,'+0036');
/*CAMBIAR NOMBRE DE JUAN POR JOSE*/
UPDATE Agenda
SET Nombre = 'Jose'
WHERE Nombre = 'Juan';
/*ELIMINAR LOS REGISTROS CUYO NUMERO SEA 423456789*/
DELETE FROM Agenda
WHERE Telefono ='423456798';
/*ELIMINAR TODOS LOS REGISTROS*/
DELETE FROM Agenda;
/*AÑADE UN NUEVO REGISTRO CON DATOS PERSONALES*/
INSERT INTO Agenda (Apellido, Nombre, Domicilio, Telefono, Prefijo) VALUES
('Menendez', 'Javier', 'Oslo 42', 657461335,'+0034');
/*ACTUALIZA EL APELLIDO LOPEZ POR GARCIA*/
UPDATE Agenda
SET Apellido = 'Garcia'
WHERE Apellido = 'Lopez';
/*CAMBIA NOMBRE JOSE POR ROBERTO*/
UPDATE Agenda
SET Nombre = 'Roberto'
WHERE Nombre = 'Jose';
/*ACTUALIZAR EL TELEFONO DE ALBERTO*/
UPDATE Agenda
SET Telefono = '123456789'
WHERE Nombre = 'Alberto' AND Telefono = '423456798';