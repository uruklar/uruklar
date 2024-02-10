import java.util.Scanner;

public class EjMath3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String respuesta;

        // Ejercicio 1//
        while (true) {
            System.out.println("Introduce el numero de segundos para calcular el minuto de partido.");
            int segundos = in.nextInt();

            if (segundos > 5400) {
                System.out.println("Error. El numero maximo de segundos es 5400.");
            } else {
                int minutos = Math.round(segundos / 60.0f);
                System.out.println("El partido esta en el minuto " + minutos);
                System.out.println("¿Desea continuar con el programa? (S/N)");
                respuesta = in.nextLine();
                respuesta = in.nextLine();
                if (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n")) {
                    System.out.println(
                            "Respuesta invalida, por favor introduzca S si quiere continuar o N si quiere finalizar.");
                }
                if (respuesta.equalsIgnoreCase("n")) {
                    break;
                }
            }
        }

        // Ejercicio 2//

        System.out.println("\n");
        System.out.println(
                "El ejercicio dos lo titularia como 'PRACTICA DE FUNCIONES MATH'. La explicacion de su flujo de codigo es:");
        System.out.println("En las tres primeras lineas, el codigo declara las variables.");
        System.out.println("En la siguiente linea, genera un numero aleatorio que guarda en la variable rand.");
        System.out.println(
                "En la siguiente linea, guarda en la variable x el valor positivo de -123, ya que la funcion Math.abs siempre devuelve un resultado positvo.");
        System.out.println(
                "En la siguiente linea, redondea el numero 123.567 al numero entero mas cercano y lo guarda en la variable y.");
        System.out.println(
                "En la siguiente linea, guarda en la variable z el resultado de elevar 2 a la 4 mediante la funcion Math.pow.");
        System.out.println(
                "En esta linea guarda en la variable max y gracias a la funcion Math.max, \n el numero mas alto entre dos numeros en formato de punto flotante que son 1*10 eleveado a 10 y 3*10 elevado a 9.");
        System.out.println("FInalmente, muestra los resultados guardados en cada variable en pantalla.");

        // Ejercicio 3//

        System.out.println("\n");
        System.out.println(
                "El ejercicio dos lo titularia como 'APROXIMACION AL NUMERO 'E'. La explicacion de su flujo de codigo es:");
        System.out.println(
                "Primero declara dos variables BigDecimal, con las que tiene una precision exacta en numeros decimales.");
        System.out.println(
                "La siguiente linea asigna a BigDecima 'e', el valor 1 con 300 decimales (setScale) y especifica que no haya redondeo y se acabe con el ultimo decimal (round down).");
        System.out.println("Establece la misma informacion para la variable 'factor' que para la 'e'.");
        System.out.println("En la siguiente formula se calcula un nuevo factor dividiendo 'factor' entre 200.");
        System.out.println("Se le agrega a factor 1.");
        System.out.println(
                "Se crea un bucle 'for' que se ejecutara 199 veces en el que se multiplica 'e' por 'factor' y se guarda el resultado en 'e'.");
        System.out.println("Se imprime el valor de 'e' en consola.");

        // Ejercicio 4//
        System.out.println("\n");
        System.out.println(
                "El enunciado del ejercicio seria: Calcula el valor absoluto de un numero dado desde consola, calcula su raiz cuadrada y calcula un numero aleatorio entre 1 y su valor absoluto.");
        System.out.println(
                "Redondea el resultado de la raiz cuadrada y transforma el numero resultante en una cadena string, conviertela completamente en letras mayusculas, devuelvela a letras minusculas y calcula su longitud.");

    }
}
