import java.util.Scanner;

public class TCondicionales {
    public static void main(String[] args) {

        int numUno, numDos, numTres;

        Scanner numeros = new Scanner(System.in);

        System.out.println("Introduzca el primer numero:");
        numUno = numeros.nextInt();

        System.out.println("Introduzca el segundo numero");
        numDos = numeros.nextInt();

        System.out.println("Introduzca el tercer numero");
        numTres = numeros.nextInt();

        int mayor = Math.max(numUno,Math.max(numDos, numTres));
        int menor= Math.min(numUno, Math.min(numDos,numTres));

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }
}