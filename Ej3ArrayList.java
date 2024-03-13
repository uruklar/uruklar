import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ej3ArrayList {
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

        while(ejecutar){
        System.out.println("Para añadir asignaturas a la lista, pulse '1'.");
        System.out.println("Para mostrar la lista de asignaturas , pulse '2'.");
        System.out.println("Para buscar una asignatura por su nombre, pulse'3'.");
        System.out.println("Para terminar el programa, pulse '4'.");

        int opcion = in.nextInt();

        switch (opcion) {
            case 1:
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
            case 2:
                System.out.println("La lista de asignaturas es:");
                for(String lista:asignaturas){
                    System.out.println(lista);
                }
                System.out.println("");
                break;
            case 3:
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
            case 4:
                ejecutar=false;
                break;
            default:
                System.out.println("Opcion no valida.");
            }
        }
    }
        
    

    public static void ejercicio4(){
        
    }

}
