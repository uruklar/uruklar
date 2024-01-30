import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int limite, contador,a,b,c;
        contador=0;
        a=1;
        b=0;
        c=0;

        System.out.println("Introduzca cuantos numeros de la sucesion de Fibonacci quiere:");
        limite = leer.nextInt();
        System.err.println("");

        while(contador<limite){
            System.out.println(b);
            c=a;
            a=a+b;
            b=c;
            contador++;
        }
    }
}
