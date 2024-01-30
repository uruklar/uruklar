import java.util.Scanner;

public class NPrimos {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int n, i=1, c=0;
        n=1;
        
    while(n!=0){
        System.out.println("Ingresa un numero para saber si es primo.");
        n = leer.nextInt();
        while(i<=n){
            if(n % i == 0){
                c++;
            }
            i++;
        }
        if (c==2){
            System.out.println("El numero es primo.");
        }else{
            System.out.println("El numero no es primo.");
        }
        i=1;
        c=0;
    }System.out.println("El juego se ha terminado.");
    }
}
