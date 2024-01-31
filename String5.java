import java.util.Scanner;
public class String5 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String texto;

        System.out.println("Introduzca una oracion");
        texto = in.nextLine();

        String[]separado = texto.split(" ");
        System.out.println("El texto separando las palabras en una linea distinta es:");
        System.out.println("");
        for(String str : separado){
            System.out.println(str);
        }
        
    }
}