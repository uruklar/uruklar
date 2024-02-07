/* Modelo relacional:
ALUMNOS (dni_a(PK), codigo_curso(FK), nombre, apellidos, direccion, fecha_nacimiento, sexo)
PROFESORES (dni_p(PK), nombre, apellidos, direccion, titulo academico, precio_hora)
CURSO (codigo_curso(PK), numero_alumnos, nombre, dni_a(FK), fecha_inicio, fecha_final, horas_curso)
*/

CREATE TABLE PROFESORES(
    Dni_p VARCHAR(9) PRIMARY KEY,
    Nombre VARCHAR(50) NOT NULL,
    Apellidos VARCHAR(50) NOT NULL,
    Direccion VARCHAR(100) NOT NULL,
    TituloAcademico VARCHAR(4) CHECK(TituloAcademico IN('LDO', 'DDO', 'CFGS')),
    PrecioHora DECIMAL(5,2) CHECK(PrecioHora > 0)
);
CREATE TABLE CURSOS(
    Codigo_curso INT PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    NumeroAlumnos INT CHECK(NumeroAlumnos>=10),
    Dni_p VARCHAR(9),
    FechaInicio DATE NOT NULL,
    FechaFinal DATE CHECK(FechaInicio<FechaFinal),
    NumHoras INT CHECK(NumHoras>=80),
    FOREIGN KEY (Dni_p) REFERENCES PROFESORES(Dni_p)
);
CREATE TABLE ALUMNOS(
    Dni_a VARCHAR(9) PRIMARY KEY,
    Nombre VARCHAR(50) NOT NULL,
    Apellidos VARCHAR(50) NOT NULL,
    Direccion VARCHAR(100) NOT NULL,
    FechaNacimiento DATE Not NULL,
    Sexo CHAR(1) CHECK(Sexo IN('H' , 'M')),
    Codigo_curso INT,
    FOREIGN KEY (Codigo_curso) REFERENCES CURSOS(Codigo_curso)
);
