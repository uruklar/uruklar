import java.util.Scanner;
public class EjArray2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Introduzca el numero de datos que quiere que tenga su array.");
        int num = in.nextInt();

        int numeros[] = new int[num];

        System.out.println("Impresion de datos con bucle for:");

        for(int i=0; i<numeros.length; i++){
            numeros[i]= i+1;
            System.out.println(i+1 + " ");
        }

        System.out.println("Impresion de datos con bucle while:");
        int control= 0;
        while(control < num){
            System.out.println(numeros[control] + " ");
            control++;
        }

        System.out.println("Tabla pintada visualmetne:");
        System.out.println();
        for(int i=0; i<numeros.length; i++){
            System.out.print("| " + numeros[i] + " ");
            }
        System.out.print("|");
        System.out.println();
        for(int i=0; i<numeros.length;i++){
            System.out.print("-----");
        }
    }
}
