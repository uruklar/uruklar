import java.util.Random;
import java.util.Scanner;

public class Matrices2 {

    public static void main(String[] args) {
        boolean ejecutar = true;
        Scanner in = new Scanner(System.in);

        while (ejecutar) {
            System.out.println("Seleccione el ejercicio que desea ejecutar");
            System.out.println("1 para el ejercicio numero 1");
            System.out.println("2 para el ejercicio numero 2");
            System.out.println("3 para el ejercicio numero 3");
            System.out.println("4 para el ejercicio numero 4");
            int opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
            if(opcion>=1 && opcion<=4){
                System.out.println("¿Desea ejecutar otra opcion? (Si/No)");
                String respuesta = in.next().toLowerCase();
                ejecutar = respuesta.equals("si");
            }
        }
    }

    // 1. Crear una matriz de 5 filas y n columnas (se pide al usuario). Rellenarlo
    // con números aleatorios entre 0 y 10.//

    public static void ejercicio1() {
        Scanner in = new Scanner(System.in);
        System.out.println("EJERCICIO 1");
        System.out.println("Introduzca el numero de columnas que quiere que tenga su array.");
        int n = in.nextInt();

        int matriz[][] = new int[5][n];

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                Random random = new Random();
                matriz[f][c] = random.nextInt(10);
            }
        }
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(" " + matriz[f][c] + " ");
                if (c == matriz[f].length - 1) {
                    System.out.println("");
                }
            }
        }
    }

    // 2. Crear dos matrices de nxn y sumar sus valores, los resultados se deben
    // almacenar en otra matriz. Los valores y la longitud, seran insertados por el
    // usuario. Mostrar las matrices originales y el resultado.//

    public static void ejercicio2() {
        Scanner in = new Scanner(System.in);
        System.out.println("EJERCICIO 2");
        System.out.println("Introduzca el numero de filas y columnas que quiere que tengan los array:");

        int m = in.nextInt();

        int matriz1[][] = new int[m][m];
        int matriz2[][] = new int[m][m];

        for (int f = 0; f < matriz1.length; f++) {
            for (int c = 0; c < matriz1[f].length; c++) {
                System.out.println("Inserte el valor para la posicion " + f + "," + c + " del primer array.");
                matriz1[f][c] = in.nextInt();
            }
        }

        for (int f = 0; f < matriz2.length; f++) {
            for (int c = 0; c < matriz2[f].length; c++) {
                System.out.println("Inserte el valor para la posicion " + f + "," + c + " del segundo array.");
                matriz2[f][c] = in.nextInt();
            }
        }

        int matrizsuma[][] = new int[m][m];
        for (int f = 0; f < matrizsuma.length; f++) {
            for (int c = 0; c < matrizsuma[f].length; c++) {
                matrizsuma[f][c] = matriz1[f][c] + matriz2[f][c];
            }
        }

        System.out.println("Primera matriz:");
        System.out.print("{");
        for (int f = 0; f < matriz1.length; f++) {

            for (int c = 0; c < matriz1[f].length; c++) {
                System.out.print(" " + matriz1[f][c] + " ");
                if (c == matriz1[f].length - 1) {
                    System.out.print("}");
                    System.out.println("");
                    if (f < matriz1[f].length - 1) {
                        System.out.print("{");
                    }
                }
            }
        }

        System.out.println(" ");
        System.out.println("Segunda matriz:");
        System.out.print("{");
        for (int f = 0; f < matriz2.length; f++) {

            for (int c = 0; c < matriz2[f].length; c++) {
                System.out.print(" " + matriz2[f][c] + " ");
                if (c == matriz2[f].length - 1) {
                    System.out.print("}");
                    System.out.println("");
                    if (f < matriz2[f].length - 1) {
                        System.out.print("{");
                    }
                }
            }
        }

        System.out.println(" ");
        System.out.println("Matriz suma:");
        System.out.print("{");
        for (int f = 0; f < matrizsuma.length; f++) {

            for (int c = 0; c < matrizsuma[f].length; c++) {
                System.out.print(" " + matrizsuma[f][c] + " ");
                if (c == matrizsuma[f].length - 1) {
                    System.out.print("}");
                    System.out.println("");
                    if (f < matrizsuma[f].length - 1) {
                        System.out.print("{");
                    }
                }
            }
        }
    }

    // 3. Crear una matriz de 4×4 de números enteros que inicialmente esta vacía.//

    public static void ejercicio3() {
        Scanner in = new Scanner(System.in);
        int matriz3[][] = new int[4][4];

        // 3.1 Rellenar TODA la matriz de números, debes pedírselo al usuario.//

        System.out.println("EJERCICIO 3");
        for (int f = 0; f < matriz3.length; f++) {
            for (int c = 0; c < matriz3[f].length; c++) {
                System.out.println("Inserte el valor para la posicion " + f + "," + c + " del array.");
                matriz3[f][c] = in.nextInt();
            }
        }
        // 3.2 Suma de una fila que se pedirá al usuario (controlar que elija una
        // correcta)//

        System.out.println(
                "Indique de que fila del array quiere hacer la suma de los valores, elija entre 0 y 3, ambos incluidos.");
        int fila = in.nextInt();
        int sumaFila = 0;
        boolean filas = true;

        while (filas == true) {
            if (fila >= 0 && fila < 4) {
                for (int c = 0; c < matriz3[fila].length; c++) {
                    sumaFila = sumaFila + matriz3[fila][c];
                }
                System.out.println("La suma de los valores de la fila " + fila + " es: " + sumaFila);
                break;
            } else {
                System.out.println("Por favor introduzca uan fila valida.");
                fila = in.nextInt();
            }
        }

        // 3.3 Suma de una columna que se pedira al usuario (controlar que se elija una
        // correcta)//
        System.out.println(
                "Indique de que columna del array quiere hacer la suma de los valores, elija entre 0 y 3, ambos incluidos.");
        int columna = in.nextInt();
        int sumaColumna = 0;
        boolean columnas = true;

        while (columnas == true) {
            if (columna >= 0 && columna < 4) {
                for (int f = 0; f < matriz3[fila].length; f++) {
                    sumaColumna = sumaColumna + matriz3[f][columna];
                }
                System.out.println("La suma de los valores de la columna " + columna + " es: " + sumaColumna);
                break;
            } else {
                System.out.println("Por favor introduzca uan columna valida.");
                columna = in.nextInt();
            }
        }
        // 3.4 Sumar la diagonal principal//
        int diagonal = 0;

        for (int f = 0; f < matriz3.length; f++) {
            for (int c = 0; c < matriz3[f].length; c++) {
                if (f == c) {
                    diagonal = diagonal + matriz3[f][c];
                }
            }
        }
        System.out.println("La suma de la diagonal principal es: " + diagonal);

        // 3.5 Sumar la diagonal inversa//
        int diagonalInv = 0;

        for (int f = 0; f < matriz3.length; f++) {
            diagonalInv += matriz3[f][matriz3.length - f - 1];
        }
        System.out.println("La suma de la diagonal inversa es: " + diagonalInv);

        // 3.6 La media de los valores de la matriz//
        double sumatorio = 0, elementos = 0;
        for (int f = 0; f < matriz3.length; f++) {
            for (int c = 0; c < matriz3[f].length; c++) {
                sumatorio = sumatorio + matriz3[f][c];
                elementos++;
            }
        }
        double media = sumatorio / elementos;
        System.out.println("La media de los valores del array es: " + media);

    }

    //Crear una matriz de 3x3 con numeros aleatorios sin repetirse.
    public static void ejercicio4(){
        Random random=new Random();
        int matriz4[][] = new int[3][3];
        boolean [] numGenerados = new boolean[100];

        for(int f=0;f<matriz4.length;f++){
            for(int c=0;c<matriz4[f].length;c++){
                int numeroaleatorio;
                do {
                    numeroaleatorio = random.nextInt(100);
                } while (numGenerados[numeroaleatorio]);

                matriz4[f][c] = numeroaleatorio;
                numGenerados[numeroaleatorio]=true;
            }
        }

        for (int f = 0; f < matriz4.length; f++) {
            for (int c = 0; c < matriz4[f].length; c++) {
                System.out.print(" " + matriz4[f][c] + " ");
                if (c == matriz4[f].length - 1) {
                    System.out.println("");
                }
            }
        }

    }
}