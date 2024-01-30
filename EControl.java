import java.util.Scanner;
public class EControl {
    public static void main(String[] args) {

        int numUno, numDos, par;
        
        Scanner num = new Scanner(System.in);

System.out.println("Escriba el primer numero");
numUno = num.nextInt();

System.out.println("Escriba el segundo numero");
numDos = num.nextInt();

if (numUno>numDos){
    System.out.println("El numero " + numUno + " es mayor que el numero " + numDos + ".");
    System.out.println("El numero " + numDos + " es menor que el numero " + numDos + ".");
}else {
    System.out.println("El numero " + numDos + " es mayor que el numero " + numUno + ".");
    System.out.println("El numero " + numUno + " es menor que el numero " + numDos + ".");
}

System.out.println("Para comprobar si su numero es par o impar escriba su numero:");
par = num.nextInt();


if (par %2 == 0){
        System.out.println("El numero es par.");
}else{
    System.out.println("El numero es impar.");
}
    }
}
