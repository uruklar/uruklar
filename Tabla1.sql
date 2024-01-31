CREATE TABLE Prueba1 (
    nombre CHAR(10),
    apellidos VARCHAR(50),
    fecha_nac DATE
);

CREATE TABLE Prueba2 (
    dni CHAR(10),
    nombre VARCHAR(30),
    apellidos VARCHAR(50),
    edad INT(3),
    altura DECIMAL(3,2)
);

/*añado al final*/
ALTER TABLE Prueba2 ADD peso DECIMAL(4,1);

/*añado al principio*/
ALTER TABLE Prueba2 ADD codigo INT(6) FIRST;

/*añado tras un dato en concreto*/
ALTER TABLE Prueba2 ADD domicilio VARCHAR(50) AFTER apellidos;

/*modifico el rango de los datos de un atributo*/
ALTER TABLE Prueba2 CHANGE peso peso DECIMAL(5,2);

ALTER TABLE Prueba2 DROP COLUMN codigo;

ALTER TABLE Prueba2 ADD PRIMARY KEY(dni);