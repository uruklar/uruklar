/*1-Lista el nombre de todos los productos que hay en la tabla productos*/
SELECT nombre
FROM producto;

/*2-Lista el nombre y los precios de todos los productos que hay en la tabla productos*/
SELECT nombre, precio
FROM producto;

/*3-Lista todas las columnas de la tabla productos*/
SELECT *
FROM producto;
    /*O tambien si no se pide lo anterior:*/
    SHOW columns
    FROM producto;

/*4-Lista el nombre de los productos, el precio en euros y el precio en dolares estadounidenses.*/
SELECT nombre, precio, precio * 1.09 As precio_dolares
FROM producto;

/*5-Lista el nombre de los productos, el precio en euros y el precio en dolares estadounidenses. Utiliza los siguientes alias para las columnas: Nombre del producto, euros, dolares.*/
SELECT nombre AS 'Nombre del producto',
       precio AS 'euros',
       precio * 1.09 AS 'dolares'
FROM producto;

/*6-Lista los nombres y los precios de todos los productos de la tabla producto, convirtiendo los nombres a mayuscula.*/
SELECT UPPER(nombre) AS 'Nombre mayuscula', precio
FROM producto;

/*7-Lista los nombres y los precios de todos los productos de la tabla producto, convirtiendo los nombres a minuscula.*/
SELECT LOWER(nombre) AS 'Nombre minuscula', precio
FROM producto;

/*8-Lista el nombre de todos los fabricantes en una columna y en otra columna obten en mayusculas los dos primeros caracteres del nombre del fabricante.*/
SELECT nombre AS 'Nombre fabricante', UPPER(LEFT(nombre,2)) AS 'Iniciales'
FROM fabricante;

/*9-Lista los nombres y los precios de todos los productos de la tabla producto, redondeando el valor precio.*/
SELECT nombre, ROUND(precio) AS 'Precio redondeado'
FROM producto;

/*10-Lista los nombres y los precios de todos los productos de la tabla producto, truncando el valor precio para mostrarlo sin una cifra decimal.*/
SELECT nombre, TRUNCATE(precio,0) AS 'Precio redondeado'
FROM producto;

/*11-Lista los códigos de los fabricantes que tienen productos en la tabla producto.*/
SELECT codigo_fabricante
FROM producto;

/*12-Lista el código de los fabricantes que tienen productos en la tabla producto, mostrando dichos códigos sin repetir.*/
SELECT DISTINCT codigo_fabricante
FROM producto;

/*13-Lista los nombres de los fabricantes ordenados de forma ascendente.*/
SELECT DISTINCT codigo_fabricante
FROM producto
ORDER BY codigo_fabricante ASC;

/*14-Lista los nombres de los fabricantes ordenados de forma descendente.*/
SELECT DISTINCT codigo_fabricante
FROM producto
ORDER BY codigo_fabricante DESC;

/*15-Lista los nombres de los productos ordenados en primer lugar por el nombre de forma ascendente y en segundo lugar por el precio de forma descendente.*/
SELECT nombre, precio
FROM producto
ORDER BY nombre ASC, precio DESC;

/*16-Devuelve una lista con las 5 primeras filas de la tabla fabricante.*/
SELECT *
FROM fabricante
LIMIT 5;

/*17-Devuelve una lista con 2 filas a partir de la cuarta fila de la tabla fabricante. La cuarta fila también se debe incluir en la respuesta.*/
SELECT *
FROM fabricante
LIMIT 2 OFFSET 3;

/*18-Lista el nombre y el precio del producto más barato. (Utilizar las cláusulas ORDER BY y LIMIT)*/
SELECT nombre, precio
FROM producto
ORDER BY precio ASC
LIMIT 1;

/*19-Lista el nombre y el precio del producto más caro. (Utilizar las cláusulas ORDER BY y LIMIT)*/
SELECT nombre, precio
FROM producto
ORDER BY precio DESC
LIMIT 1;

/*20-Lista el nombre de todos los productos del fabricante cuyo código de fabricante es igual a 2.*/
SELECT nombre
FROM producto
WHERE codigo_fabricante = 2;

/*21-Lista el nombre de los productos que tienen un precio menor o igual a 120€.*/
SELECT nombre
FROM producto
WHERE precio<=120;

/*22-Lista el nombre de los productos que tienen un precio mayor o igual a 400€.*/
SELECT nombre
FROM producto
WHERE precio>=400;

/*23-Lista el nombre de los productos que no tienen un precio mayor o igual a 400€.*/
SELECT nombre
FROM producto
WHERE precio<400;

/*24-Lista todos los productos que tengan un precio entre 80€ y 300€. Sin utilizar el operador BETWEEN.*/
SELECT nombre
FROM producto
WHERE precio > 80 AND precio < 300;

/*25-Lista todos los productos que tengan un precio entre 60€ y 200€. Utilizando el operador BETWEEN.*/
SELECT nombre
FROM producto
WHERE precio BETWEEN 60 AND 200;

/*26-Lista todos los productos que tengan un precio mayor que 200€ y que el código de fabricante sea igual a 6.*/
SELECT nombre
FROM producto
WHERE precio>200 AND codigo_fabricante=6;

/*27-Lista todos los productos donde el código de fabricante sea 1, 3 o 5. Sin utilizar el operador IN.*/
SELECT nombre
FROM producto
WHERE codigo_fabricante=1  OR codigo_fabricante=3 OR codigo_fabricante=5;

/*28-Lista todos los productos donde el código de fabricante sea 1, 3 o 5. Utilizando el operador IN*/
SELECT nombre
FROM producto
WHERE codigo_fabricante IN (1,3,5);

/*29-Lista el nombre y el precio de los productos en céntimos (Habrá que multiplicar por 100 el valor del precio). Crear un alias para la columna que contiene el precio que se llame céntimos.*/
SELECT nombre, precio*100 AS centimos
FROM producto;

/*30-Lista los nombres de los fabricantes cuyo nombre empiece por la letra S.*/
SELECT nombre
FROM fabricante
WHERE nombre LIKE 'S%';

/*31-Lista los nombres de los fabricantes cuyo nombre termine por la vocal e.*/
SELECT nombre
FROM fabricante
WHERE nombre LIKE '%e';

/*32-Lista los nombres de los fabricantes cuyo nombre contenga el carácter w.*/
SELECT nombre
FROM fabricante
WHERE nombre LIKE '%w%';

/*33-Lista los nombres de los fabricantes cuyo nombre sea de 4 caracteres.*/
SELECT nombre
FROM fabricante
WHERE LENGTH(nombre)=4;

/*34-Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil en el nombre.*/
SELECT nombre
FROM producto
WHERE nombre LIKE '%Portatil%';

/*35-Devuelve una lista con el nombre de todos los productos que contienen la cadena Monitor en el nombre y tienen un precio inferior a 215 €.*/
SELECT nombre
FROM producto
WHERE nombre LIKE '%Monitor%' AND precio<215;

/*36-Lista el nombre y el precio de todos los productos que tengan un precio mayor o igual a 180€. Ordena el resultado en primer lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden ascendente).*/
SELECT nombre, precio
FROM producto
WHERE precio >=180
ORDER BY precio DESC, nombre ASC;