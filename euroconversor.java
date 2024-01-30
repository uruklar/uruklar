import java.util.Scanner;

public class euroconversor{

    public static void main(String[] args) {
        Scanner conversor = new Scanner(System.in);

        System.out.println("Introduzca el valor en euros a convertir en libras: ");

        double cantidad = conversor.nextDouble();

        System.out.println("El valor en libras es: " + cantidad*0.86);
    }
}

