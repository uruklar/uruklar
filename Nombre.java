import java.util.Scanner;

public class Nombre {
    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);
        String name = "", apellido = "";

        System.out.println("¿Cual es tu nombre?");
        name = datos.nextLine();

        System.out.println("¿Cual es tu apellido?");
        apellido = datos.nextLine();

        System.out.println("Buenos dias "+ name + " " + apellido);
        
    }
}
