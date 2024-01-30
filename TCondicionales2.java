import java.util.Scanner;
public class TCondicionales2 {
    public static void main(String[] args) {
        
        int numUno, numDos, numTres;

        Scanner num = new Scanner(System.in);

        System.out.println("Introduzca el primer numero:");
        numUno = num.nextInt();

        System.out.println("Introduzca el segundo numero");
        numDos = num.nextInt();

        System.out.println("Introduzca el tercer numero");
        numTres = num.nextInt();

        if (numUno>numDos && numUno>numTres){
        System.out.println("El numero mayor es: " + numUno);
        }else if (numDos>numUno && numDos>numTres){
            System.out.println("El numero mayor es: " + numDos);
            }else if(numTres>numUno && numTres>numDos){
                System.out.println("El numero mayor es: " + numTres);
            }
        if (numUno<numDos && numUno<numTres){
            System.out.println("EL numero menor es: " + numUno);
        }else if(numDos<numUno && numDos<numTres){
            System.out.println("El numero menor es: " + numDos);
        }else if(numTres<numUno && numTres<numDos){
            System.out.println("EL numero menor es: " + numTres);
        }
                
    }
}
