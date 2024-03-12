/*CREACION DE LA BASE DE DATOS*/
CREATE DATABASE Pedidos;
/*ACTIVACION DE LA BASE DE DATOS*/
USE Pedidos;
/*CREACION DE LAS TABLAS DE LA BASE DE DATOS*/
CREATE TABLE Pedido (
    RefPed CHAR(5) PRIMARY KEY NOT NULL,
    FecPed DATE NOT NULL
);
CREATE TABLE Articulo (
    CodArt CHAR(5) PRIMARY KEY NOT NULL,
    DesArt VARCHAR(100) NOT NULL,
    PVPArt DECIMAL(3,2) NOT NULL
);
CREATE TABLE LineaPedido (
    RefPed CHAR(5) NOT NULL,
    CodArt CHAR(5) NOT NULL,
    CantArt INT(3) NOT NULL,
    FOREIGN KEY (RefPed) REFERENCES Pedido(RefPed),
    FOREIGN KEY (CodArt) REFERENCES Articulo(CodArt)
);
/*AÑADIR LOS DATOS A LAS TABLAS*/
INSERT INTO Pedido (RefPed, FecPed) VALUES
('P0001', '2014-02-16'),
('P0002', '2014-02-18'),
('P0003', '2014-02-23'),
('P0004', '2014-02-25');
INSERT INTO Articulo (CodArt, DesArt,PVPArt) VALUES
('A0043', 'Boligrafo azul fino', '0.78'),
('A0078', 'Boligrafo rojo normal', '1.05'),
('A0075', 'Lapiz2B', '0.55'),
('A0012', 'Goma de borrar', '0.15'),
('A0089', 'Sacapuntas', '0.25');
INSERT INTO LineaPedido (RefPed, CodArt,CantArt) VALUES
('P0001', 'A0043', '10'),
('P0001', 'A0078', '12'),
('P0002', 'A0043', '5'),
('P0003', 'A0075', '20'),
('P0004', 'A0012', '15'),
('P0004', 'A0043', '5'),
('P0004', 'A0089', '50');