/*CREACION DE LA BASE DE DATOS*/
CREATE DATABASE Pubs;
/*ACTIVACION DE LA BASE DE DATOS*/
USE Pubs;
/*CREACION DE LAS TABLAS DE LA BASE DE DATOS*/
CREATE TABLE pub (
    COD_PUB CHAR(10) PRIMARY KEY NOT NULL,
    Nombre VARCHAR (30) NOT NULL,
    Licencia_fiscal CHAR (10) UNIQUE NOT NULL,
    Domicilio VARCHAR (100),
    Fecha_de_apertura DATE NOT NULL,
    Horario ENUM('HOR1', 'HOR2', 'HOR3') NOT NULL,
    Cod_localidad INT(5) ZEROFILL  NOT NULL
);
CREATE TABLE titular (
    DNI_Titular CHAR(9) PRIMARY KEY NOT NULL,
    Domicilio VARCHAR(100),
    COD_PUB CHAR(10) NOT NULL
);
CREATE TABLE empleado(
    DNI_Empleado CHAR(9) PRIMARY KEY NOT NULL,
    Nombre VARCHAR(30) NOT NULL,
    Domicilio VARCHAR(100)
);
CREATE TABLE existencias(
    COD_Articulo CHAR(10) PRIMARY KEY NOT NULL,
    Nombre VARCHAR(30) NOT NULL,
    Cantidad DECIMAL(6,2) NOT NULL,
    Precio DECIMAL(7,2) NOT NULL DEFAULT 1.00,
    COD_PUB CHAR(10) NOT NULL,
    CHECK (Precio>0)
);
CREATE TABLE localidad(
    Cod_localidad INT(5) ZEROFILL PRIMARY KEY NOT NULL,
    Nombre VARCHAR(30) NOT NULL
);
CREATE TABLE Pub_empleado(
    Funcion ENUM('camarero', 'seguridad', 'limpieza') NOT NULL,
    COD_PUB Char(10) NOT NULL,
    DNI_Empleado CHAR(9) NOT NULL
);
/*CREACION DE LA CLAVE PRIMARIA DE PUB_EMPLEADO*/
ALTER TABLE Pub_empleado
ADD CONSTRAINT pk_Pub_empleado PRIMARY KEY(Funcion, COD_PUB, DNI_Empleado);
/*CREACION DE LAS CLAVES FORANEAS DE LA BASE DE DATOS*/
ALTER TABLE pub
ADD CONSTRAINT fk_pub FOREIGN KEY (Cod_localidad) REFERENCES localidad (Cod_localidad);

ALTER TABLE titular
ADD CONSTRAINT fk_titular FOREIGN KEY (COD_PUB) REFERENCES pub (COD_PUB);

ALTER TABLE existencias
ADD CONSTRAINT fk_existencias FOREIGN KEY (COD_PUB) REFERENCES pub (COD_PUB);

ALTER TABLE Pub_empleado
ADD CONSTRAINT fk_Pub_empleado FOREIGN KEY (COD_PUB) REFERENCES pub (COD_PUB);

ALTER TABLE Pub_empleado
ADD CONSTRAINT fk_DNI_Empleado FOREIGN KEY (DNI_Empleado) REFERENCES empleado (DNI_Empleado);
