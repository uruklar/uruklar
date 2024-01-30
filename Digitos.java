import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int n, res, contarDigitos;
        contarDigitos=0;
        n=1;

        while(n!=0){

            System.out.println("Introduce un numero del 1 al 999. Introduce el 0 para acabar el programa.");
            n = leer.nextInt();

            if(n<10){
                System.out.println("El numero tiene 1 digito.");
            }
            else if (n<100){
                System.err.println("El numero tiene 2 digitos.");
            }
            else if (n<1000){
                System.out.println("El numero tiene 3 digitos.");
            }
            else{
                System.out.println("El numero introducido no es valido.");
            }
        }
        System.out.println("Programa finalizado.");
    }
}
