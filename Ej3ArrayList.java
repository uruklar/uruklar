import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ej3ArrayList {
    public static void main(String[] args) {
        
        boolean ejecutar = true;
        Scanner in = new Scanner(System.in);
        //Menu de opciones mediante un bucle while y un switch//
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
            if (opcion >= 1 && opcion <= 4) {
                System.out.println("¿Desea ejecutar otro ejercicio? (Si/No)");
                String respuesta = in.next().toLowerCase();
                ejecutar = respuesta.equals("si");
            }
        }
    }
    
        //EJERCICIO 1//
    public static void ejercicio1(){

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int numero;

        //Bucle do-while para guardar los valores numericos en el arraylist hasta que el usuario introduzca -99.//
        do{
            System.out.println("Introduzca valores numericos para la lista. Para terminar introduzca '-99'");
            numero = in.nextInt();

            if(numero != -99){
                numeros.add(numero);
            }
        }while (numero != -99);

        //Mostrar los numeros guardados en el arraylist por pantalla.//
        System.out.println("Los numeros guardados en la lista son:");
        for(Integer lista:numeros ){
            System.out.println(lista);
        }

        //Mostrar por pantalla la suma y la media de los valores introducidos en el arraylist//
        double suma=0;
        for(Integer sumandos:numeros){
            suma=suma+sumandos;
        }
        System.out.println("La suma de todos los valores de la lista es: " + suma);
        double media = suma/(numeros.size());
        System.out.println("La media de los valores de la lista es: " + media);

        //Mostrar por pantalla todos los valores leidos y cuales de ellos son mayores que la media//
        int mayormedia=0;
        for(Integer listado:numeros){
            if(listado>media){
                System.out.println(listado + " es mayor que la media.");
                mayormedia++;
            }else{
                System.out.println(listado);
            }
        }
        System.out.println("Hay " + mayormedia + " valores por encima de la media.");
    }

    //EJERCICIO 2//
    public static void ejercicio2(){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer>aleatorios = new ArrayList<Integer>();
        Random aleatorio = new Random();
        
        //Almacenamos n numeros aleatorios en un arraylist//
        int cantidadnumeros;
        do{
            System.out.println("Introduzca la cantidad de valores que quiere en la lista, recuerde que no puede ser menor que 1.");
            cantidadnumeros = in.nextInt();
        }while(cantidadnumeros<1);


        int contador=0;
        do{
            int numeroaleatorio=aleatorio.nextInt(100)+1;
            aleatorios.add(numeroaleatorio);
            contador ++;
        }while(contador!=cantidadnumeros);

        //Imprimir todos los valores del arraylist//
        System.out.println("Los numeros guardados en la lista son:");
        for(Integer lista:aleatorios){
            System.out.println(lista);
        }

        //Mostrar el primer valor del arraylist//
        int primervalor;
        primervalor= aleatorios.get(0);
        System.out.println("El primer valor de la lista es: " + primervalor);

        //Mostrar el ultimo valor del arraylist//
        int ultimovalor;
        ultimovalor=aleatorios.get(aleatorios.size()-1);
        System.out.println("El ultimo valor de la lista es: " + ultimovalor);

        //Pedir al usuario si quiere añadir mas datos al arraylist//
        String respuesta;
        in.nextLine();
        do{
            System.out.println("¿Desea introducir nuevos valores a la lista?");
            respuesta=in.nextLine();

            if(respuesta.equalsIgnoreCase("si")){
                System.out.println("Introduzca el valor que quiere añadir a la lista.");
                int añadir=in.nextInt();
                aleatorios.add(añadir);
                in.nextLine();
            }else if(!respuesta.equalsIgnoreCase("si")&& !respuesta.equalsIgnoreCase("no")){
                System.out.println("Respuesta incorrecta.");
                }
        }while(!respuesta.equalsIgnoreCase("no"));
        System.out.println("La lista de valores final es:");
        for(Integer lista:aleatorios ){
            System.out.println(lista);
        }
    }

    //EJERCICIO 3//
    public static void ejercicio3(){
        ArrayList<String>asignaturas = new ArrayList<String>();
        boolean ejecutar = true;
        Scanner in = new Scanner(System.in);
        String añadir;
        //Menu de opciones mediante un bucle while y un switch//
        while(ejecutar){
        System.out.println("Para añadir asignaturas a la lista, pulse '1'.");
        System.out.println("Para mostrar la lista de asignaturas , pulse '2'.");
        System.out.println("Para buscar una asignatura por su nombre, pulse'3'.");
        System.out.println("Para terminar el programa, pulse '4'.");

        int opcion = in.nextInt();

        switch (opcion) {
            case 1:            //Introducir asignaturas en el arraylist hasta que quiera el usuario//
                in.nextLine();
                System.out.println("Introduzca el nombre de la asignatura:");
                String asignatura = in.nextLine();
                asignaturas.add(asignatura);

                do{
                    System.out.println("¿Desea añadir mas asignaturas?");
                    añadir = in.nextLine();
                    if(añadir.equalsIgnoreCase("si")){
                        System.out.println("Introduzca el nombre de la asignatura que quiere añadir.");
                        asignatura=in.nextLine();
                        asignaturas.add(asignatura);
                    }else if(!añadir.equalsIgnoreCase("si")&& !añadir.equalsIgnoreCase("no")){
                        System.out.println("Respuesta incorrecta.");
                        }
                }while(!añadir.equalsIgnoreCase("no"));
                System.out.println("");
                break;
            case 2:            //Listar las asignaturas introducidas en el arraylist//
                System.out.println("La lista de asignaturas es:");
                for(String lista:asignaturas){
                    System.out.println(lista);
                }
                System.out.println("");
                break;
            case 3:            //Buscar asignaturas por nombre dentro del arraylist//
                if(asignaturas.size()<1){
                    System.out.println("Todavia no hay datos en la tabla.");
                    System.out.println("");
                    break;
                }else{
                    in.nextLine();
                    System.out.println("Introduzca el nombre de la asignatura que quiere buscar:");
                    String buscar = in.nextLine();
                    for(String lista:asignaturas){
                        if(buscar.equalsIgnoreCase(lista)){
                            System.out.println("La asignatura "+ lista + " se encuentra en la lista.");
                            System.out.println("");
                            break;
                        }else{
                            System.out.println("La asignatura " + buscar + " no se encuentra en la lista.");
                            System.out.println("");
                            break;
                        }
                    }
                }
            case 4:            //Terminar la ejecucion del ejercicio//
                ejecutar=false;
                break;
            default:
                System.out.println("Opcion no valida.");
            }
        }
    }
        
    //Ejercicio 4//
    public static void ejercicio4(){
        ArrayList<Integer>numeros = new ArrayList<Integer>();
        boolean ejecutar = true;
        Scanner in = new Scanner(System.in);
        System.out.println("Lo primero de todos, para generar un array convencional, debes elegir su tamaño. Por favor escriba el tamaño de array convencional que desea:");
        int tamaño = in.nextInt();
        int numeros1[] = new int[tamaño];
        String añadir;
        //Menu de opciones mediante un bucle while y un switch//
        while(ejecutar){
        System.out.println("");
        System.out.println("Para añadir valores al arraylist pulse '1'.");
        System.out.println("Para añadir los valores al array convencional pulse '2'.");
        System.out.println("Para calcular la suma de los valores del arraylist pulse '3'.");
        System.out.println("Para calcular la suma de los valores del array convencional pulse '4'.");
        System.out.println("Para encontrar el numero mas grande en el arraylist pulse '5'.");
        System.out.println("Para encontrar el numero mas grande en el array convencional pulse '6'.");
        System.out.println("Para mostrar los valores guardados en el arraylist pulse '7'");
        System.out.println("Para mostrar los valores guardados en el array convencional pulse '8'");
        System.out.println("Para finalizar el ejercicio pulse '9'.");


        int opcion = in.nextInt();

        switch (opcion) {
            case 1:            //Introducir valores en el arraylist//
                System.out.println("");
                in.nextLine();
                System.out.println("Introduzca el valor que desea añadir al arraylist:");
                int numero = in.nextInt();
                numeros.add(numero);

                do{
                    in.nextLine();
                    System.out.println("¿Desea añadir mas valores?");
                    añadir = in.nextLine();
                    if(añadir.equalsIgnoreCase("si")){
                        System.out.println("Introduzca el valor que quiere añadir.");
                        numero=in.nextInt();
                        numeros.add(numero);
                    }else if(!añadir.equalsIgnoreCase("si")&& !añadir.equalsIgnoreCase("no")){
                        System.out.println("Respuesta incorrecta.");
                        }
                }while(!añadir.equalsIgnoreCase("no"));
                System.out.println("");
                break;
            case 2:            //Introducir valores en el array convencional//
                System.out.println("");
                System.out.println("Introduzca los valores en su array convencional.");
                for(int i=0; i<tamaño;i++){
                    System.out.println("Introduzca el valor del elemento " + (i+1) + " :");
                    numeros1[i] = in.nextInt();
                }
                System.out.println("");
                break;
            case 3:            //Mostrar por pantalla la suma de los valores guardados en el arraylist//
                System.out.println("");
                int suma=0;
                for(Integer lista:numeros){
                    suma+=lista;
                }
                System.out.println("La suma de los valores del arraylist es: " + suma + " .");
                System.out.println("");
                break;
            case 4:             //Mostrar por pantalla los la suma de los valores guardados en el array convencional//
                System.out.println("");
                int suma1=0;
                for(int i=0;i<tamaño;i++){
                    suma1+=numeros1[i];
                }
                System.out.println("La suma de los valores del array convencional es: " + suma1 + " .");
                System.out.println("");
                break;
            case 5:             //Mostrar por pantalla el valor mas alto guardado en el arraylist//
                System.out.println("");
                int mayor=Integer.MIN_VALUE;
                for (int lista:numeros){
                    if(lista>mayor){
                        mayor = lista;
                    }
                }
                System.out.println("El valor mas alto en el arraylist es: "+ mayor + " .");
                System.out.println("");
                break;
            case 6:             //Mostrar por pantalla el valor mas alto guardado en el array convencional//
                System.out.println("");
                int mayor1=Integer.MIN_VALUE;
                for(int i=0;i<tamaño;i++){
                    if(numeros1[i]>mayor1){
                        mayor1=numeros1[i];
                    }
                }
                System.out.println("El valor mas alto en el array convencional es "+ mayor1+ " .");
                System.out.println("");
                break;
            case 7:             //Mostrar por pantalla los valores guardados en el arraylist//
                System.out.println("");
                System.out.println("Los valores del arraylist son: ");
                System.out.print("| ");
                for(Integer lista:numeros){
                    System.out.print(lista + " | ");
                }
                System.out.println("");
                break;
            case 8:             //Mostrar por pantalla los valores guardados en el array convencional//
                System.out.println("Los valores del array convencional son: ");
                System.out.print("| ");
                for(int i=0; i<tamaño;i++){
                    System.out.print(numeros1[i]+ " | ");
                }
                System.out.println("");
                break;
            case 9:             //Finalizar el ejercicio//
                ejecutar=false;
                break;
            }
        }

    }
}
