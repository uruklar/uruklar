import java.util.ArrayList;
import java.util.Scanner;

public class Ej2ArrayList {
    public static void main(String[] args) {
        
        boolean ejecutar = true;
        Scanner in = new Scanner(System.in);

        while (ejecutar) {
            System.out.println("Seleccione el ejercicio que desea ejecutar");
            System.out.println("1 para el ejercicio numero 1");
            System.out.println("2 para el ejercicio numero 2");
            System.out.println("3 para el ejercicio numero 3");

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

                default:
                    System.out.println("Opcion no valida.");
            }
            if (opcion >= 1 && opcion <= 3) {
                System.out.println("¿Desea ejecutar otro ejercicio? (Si/No)");
                String respuesta = in.next().toLowerCase();
                ejecutar = respuesta.equals("si");
            }
        }
    }
    public static void ejercicio1(){
        //Rellenamos el arraylist con 5 datos numericos//
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(25);
        numeros.add(39);
        numeros.add(12);
        numeros.add(44);
        numeros.add(31);
        //Mostramos los datos por pantalla y calculamos la media, la cual tamnbien mostramos por pantalla//
        double suma=0;
        System.out.println("Los valores dentro del arraylist son:");
        for(Integer lista:numeros){
            suma += lista;
            System.out.println(lista);
        }
        double media = suma/(numeros.size());
        System.out.println("La media de los valores del array es: "+ media);
        }
    
    public static void ejercicio2(){
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

    public static void ejercicio3(){
        boolean ejecutar = true;
        Scanner in = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<String>();
        while (ejecutar) {
            System.out.println("Seleccione el ejercicio que desea ejecutar.");
            System.out.println("1 Para agregar nombres al arraylist.");
            System.out.println("2 Para modificar nombres del arraylist.");
            System.out.println("3 Para borrar un nombre del arraylist.");
            System.out.println("4 Para visualizar un nombre del arraylist.");
            System.out.println("5 Para visualizar todos los nombres del arraylist.");
            System.out.println("6 Para salir.");
            int opcion = in.nextInt();
            in.nextLine();

            String nombre;
            switch (opcion) {
                case 1:
                do{
                    System.out.println("Ingrese el nombre del empleado o la palabra 'salir' si desea terminar.");
                    nombre = in.nextLine();
        
                    if(!nombre.equalsIgnoreCase("salir")){
                        nombres.add(nombre);
                    }
                } while (!nombre.equalsIgnoreCase("salir"));
                break;
                case 2:
                    System.out.println("Introduzca la posicion del dato que quiere modificar entre 0 y "+ (nombres.size()-1));
                    int posicion = in.nextInt();
                    in.nextLine();
                    System.out.println("Introduzca el nuevo nombre:");
                    String nuevonombre = in.nextLine();
                    nombres.set(posicion, nuevonombre);
                    break;
                case 3:
                System.out.println("Si desea eliminar por posición introduzca '1', si prefiere eliminar por nombre introduzca '2':");
                String preferencia = in.nextLine();
                
                if (preferencia.equalsIgnoreCase("1")) {
                    System.out.println("Introduzca la posición del dato que quiere borrar (entre 0 y " + (nombres.size() - 1) + "):");
                    int borrar = in.nextInt();
                    in.nextLine();
                    
                    if (borrar >= 0 && borrar < nombres.size()) {
                        nombres.remove(borrar);
                        System.out.println("El nombre en la posición " + borrar + " ha sido eliminado de la lista.");
                    } else {
                        System.out.println("Posición no válida.");
                    }
                } else if (preferencia.equalsIgnoreCase("2")) {
                    System.out.println("Introduzca el nombre del empleado que quiere borrar:");
                    String nombreBorrar = in.nextLine();
                    
                    boolean eliminado = nombres.remove(nombreBorrar);
                    if (eliminado) {
                        System.out.println("El nombre '" + nombreBorrar + "' ha sido eliminado de la lista.");
                    } else {
                        System.out.println("El nombre '" + nombreBorrar + "' no se encontró en la lista.");
                    }
                } else {
                    System.out.println("Opción no válida.");
                }
                break;
                case 4:
                    System.out.println("Introduzca la posicion a visualizar entre 0 y "+ (nombres.size()-1));
                    int visualizar = in.nextInt();
                    if(visualizar>=0 && visualizar<nombres.size()){
                        String mostrar = nombres.get(visualizar);
                        System.out.println("El empleado en la posicion " + (visualizar)+ " es: " + mostrar);
                        break;
                    }else{
                        System.out.println("Opcion no valida.");
                    }
                    break;
                case 5:
                    System.out.println("Los nombres de los empleados introducidos son:");
                    for(String lista:nombres){
                        System.out.println(lista);
                    }
                    break;
                case 6:
                    ejecutar=false;
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }
    }
}




