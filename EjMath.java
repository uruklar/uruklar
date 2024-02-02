import java.text.DecimalFormat;
import java.util.Scanner;
public class EjMath {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double radio, volumen, ladoA, ladoB, ladoC, p, area;

        //Ejercicio para calcular el volumen de una esfera a traves de su radio//
        System.out.println("Introduzca la medida en cm del radio de la esfera de la que quiere calcular el volumen:");
        radio = in.nextDouble();

        volumen = (4.0/3.0)*java.lang.Math.PI*Math.pow(radio,3);
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("El volumen de tu esfera es: " + df.format(volumen) + " centimetros.");

        //Ejercicio para calcular el area de un triangulo en funcion de las longitudes de sus lados//

        System.out.println("Ahora vamos a calcular la superficie de un triangulo a traves de sus lados, introduzca la longitud en centimetros del lado 'A'.");
        ladoA = in.nextDouble();
        System.out.println("Ahora introduzca la longitud en centimetros del lado 'b'");
        ladoB = in.nextDouble();
        System.out.println("Por ultimo introduzca la longitud en centimetros del lado 'c'.");
        ladoC = in.nextDouble();
            //Comprobacion de la validad de los datos introducidos//
        if(ladoA>0 && ladoB>0 && ladoC>0 && ladoA+ladoB>ladoC && ladoA+ladoC>ladoB && ladoB+ladoC>ladoA){
            p = (ladoA+ladoB+ladoC)/2;
            area = java.lang.Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));
            System.out.println("El area de tu triangulo son " + area + " centimetros.");
        }else{
            System.out.println("Los lados introducidos no corresponden a un triangulo valido.");
        }
        in.close();
    }
}
