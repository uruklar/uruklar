import java.util.Scanner;

public class String6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String correo;
        int intentos=0;
        char arroba='@',punto='.';
        
        System.out.println("Introduzca una direccion de correo, debe contener una '@' y un '.'");
        correo = in.nextLine();

        while(intentos<3){
            if(correo.indexOf(arroba)!=-1 && correo.indexOf(punto)!=-1){
                System.out.println("La direccion de correo es correcta.");
                break;
            }else{
                intentos++;
                System.out.println("La direccion de correo es incorrecta, introduzcala de nuevo.");
                correo = in.nextLine();
            }
        }
        if(intentos==3){
            System.out.println("Se han agotado los intentos, la direccion de correo no es valida.");
        }
    }
}


