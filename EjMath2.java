import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
public class EjMath2 {
    public static void main(String[] args) {
        
        Double radio, volumen, numAleatorio;
        int aleatorios;
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.000");

        //Ejercicio 1//
        System.out.println("Introduzca el radio del circulo en centimetros para calcular su area.");
        radio = in.nextDouble();

        if (radio<=0){
            System.out.println("Valor erroneo.");
        }else{
            //Calculo del area del circulo//
            volumen = Math.PI * Math.pow(radio,2);
            System.out.println("El area del circulo con redondeo es de " + Math.round(volumen) + " centimetros cuadrados.");
        }

        //Ejercicio 2//
        Random random = new Random();

        System.out.println("Introduzca la cantidad de numeros aleatorios que desea generar.");
        aleatorios = in.nextInt();

        String numero = String.valueOf(aleatorios);
        boolean decimal = numero.contains(".");

        if(aleatorios<=0){
            System.out.println("Valor erroneo.");
        }else if(decimal){
            System.out.println("No se pueden introducir numeros decimales.");
        }else{
            for(int i=0; i<aleatorios; i++){
                numAleatorio = random.nextDouble() * 100;
                System.out.println("Numero aleatorio generado: " + Math.round(numAleatorio));
            }
        }

        //Ejercicio 3//
        System.out.println("Introduzca el valor limite inferior para la generacion de numeros aleatorios.");
        int inferior = in.nextInt();
        System.out.println("Introduzca el valor limite superior para la generacion de numeros aleatorios.");
        int superior = in.nextInt();

        if (inferior>=superior){
            System.out.println("El limite inferior no puede ser mayor o igual al superior.");
        }else{
            int alea = random.nextInt(superior-inferior+1) + inferior;
            System.out.println("Su numero aleatorio en ese rango es: " + alea);
        }

        //Ejercicio 4//
        System.out.println("Vamos a resolver una ecuacion cuadratica.");
        System.out.println("Ingrese el valor del coeficiente 'a'.");
        double a = in.nextDouble();
        System.out.println("Ingrese el valor del coeficiente 'b'.");
        double b = in.nextDouble();
        System.out.println("Ingrese el valor del coeficiente 'c'.");
        double c = in.nextDouble();

        double discriminante = b*b-4*a*c;

        if (discriminante<0){
            System.out.println("No hay soluciones reales para esos valores.");
        }else{
            double raizdiscriminante = Math.sqrt(discriminante);
            double x1 = (-b + raizdiscriminante) / (2*a);
            double x2 = (-b - raizdiscriminante) / (2*a);
            System.out.println("Los resultados de las raices son:");
            System.out.println("X1= " + x1);
            System.out.println("X2= " + x2);
        }

        //Ejercicio 5//
        System.out.println("");
        System.out.println("Explicacion del ejercicio 5");
        System.out.println("Primero se realiza una presentacion mediante System.out.println y se dice que va a realizar un lanzamiento el jugador 1");
        System.out.println("Con las variables double aux1 y aux2 se establecen las tiradas en un rango definido por la funcion Math.random entre el 0,5 y el 6,5 consecuencia de *6 y +0.5");
        System.out.println("Con las variables double intento1 e intento2 se realiza un redondeo de los resultados anteriores mediante la funcion Math.round");
        System.out.println("Los resultados de intento1 e intento2 se transforman en una variable int jugador1 y jugador2 que elimina la parte decimal del resultado y solo se queda con la parte entera");
        System.out.println("Se muestran los resultados de jugador1 y jugador2 en pantalla");
        System.out.println("Con la funcion Math.max se busca el valor mas alto entre ambas variables para guardarlo en una variable y mostrarlo mediante texto al final");
        System.out.println("El titulo seria: JUEGO DE DADOS");
    }
}
