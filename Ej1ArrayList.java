import java.util.ArrayList;
import java.util.Scanner;

public class Ej1ArrayList{
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
                System.out.println("¿Desea ejecutar otra opcion? (Si/No)");
                String respuesta = in.next().toLowerCase();
                ejecutar = respuesta.equals("si");
            }
        }
    }

    public static void ejercicio1() {

        // Crear el arraylist de strings//
        ArrayList<String> nombres = new ArrayList<String>();
        // Añadir 4 nombres al arraylist//
        nombres.add("Manolo");
        nombres.add("Paco");
        nombres.add("Antonio");
        nombres.add("Maria");
        // Recorrer el string con un bucle for each y mostrar en pantalla//
        for (String lista : nombres) {
            System.out.println(lista);
        }
    }


    public static void ejercicio2() {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        //Pedir por pantalla 5 datos de tipo int y rellenar el arraylist//
        for (int i=0; i<5;i++){
            System.out.println("Ingrese el elemento "+ (i+1) + " :");
            int elemento = in.nextInt();
            in.nextLine();
            numeros.add(elemento);
        }
        //Mostrar los datos por pantalla a decision de usuario//
        System.out.println("¿Desea mostrar los datos por pantalla?");
        String respuesta = in.nextLine().toLowerCase();
        if(respuesta.equals("si")){
            for(Integer lista : numeros) {
                System.out.println(lista);
            }
        }else{
            System.out.println("Ejercicio terminado.");
        }
    }

    public static void ejercicio3() {
        //Creacion y introduccion de datos en el arraylist//
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Sofia");
        nombres.add("Chema");
        nombres.add("Alex");
        nombres.add("Rosa");
        //Muestra del tamaño del arraylist//
        int tamaño = nombres.size();
        System.out.println("El tamaño del array es " + tamaño);
        //Buscar si el arraylist contiene el nombre de Juan//
        if (nombres.contains("Juan")){
            System.out.println("La lista contiene el nombre 'Juan'");
        }else{
            System.out.println("La lista no contiene el nombre 'Juan'");
        }
        //Se borra el ultimo elemento del arraylist//
        nombres.remove(tamaño-1);
        for(String lista : nombres){
            System.out.println(lista);
        }
    }

    public static void ejercicio4(){
        Scanner in = new Scanner(System.in);
        ArrayList<String> animales = new ArrayList<String>();
        String nombre;
        //Bucle para introducir datos en el arraylist hasa que se introduzca la palabra salir//
        do{
            System.out.println("Ingrese el nombre de un animal o la palabra 'salir' si desea terminar.");
            nombre = in.nextLine();

            if(!nombre.equalsIgnoreCase("salir")){
                animales.add(nombre);
            }
        } while (!nombre.equalsIgnoreCase("salir"));
        //Mostrar nombres ingrsados por pantalla//
        System.out.println("Los nombres ingresados son:");
        for(String lista : animales){
            System.out.println(lista);
        }
        //Mostrar el numero de valores introducidos//
        int tamaño = animales.size();
        System.out.println("El tamaño del array es " + tamaño);
    }
}