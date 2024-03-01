import java.util.Scanner;

public class Matrices3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Introduzca una palabra que tenga entre 3 y 10 letras y no contenga espacios.");
        String palabra = in.nextLine();
        int longitud = palabra.length();
        boolean comprobador=true;

        //Control de datos para la creacion de la matriz
        while(comprobador==true){
            if(longitud<3 || longitud>10 || palabra.contains(" ")|| palabra.matches("[0-9]+")){
                System.out.println("Palabra incorrecta, por favor introduzca una palabra valida.");
                palabra = in.nextLine();
                longitud = palabra.length();
            
            }else{
                comprobador=false;
                break;
            }
        }

        //Creacion de la matriz e impresion de la misma en pantalla.
        char matriz[] = new char[longitud];
        
        for(int i=0;i<palabra.length();i++){
            matriz[i]= palabra.charAt(i);
            System.out.print("| " + matriz[i] + " | ");
        }

        //Comprobacion si hay caracteres repetidos.
        boolean repetidos = false;
        for(int i=0;i<palabra.length();i++){
            for(int c=0;c<palabra.length();c++){
                if(i!=c){
                    if(matriz[i]==matriz[c]){
                        repetidos=true;
                    }
                }
            }
        }

        //Respuesta al usuario.
        System.out.println("");
        if(repetidos==true){
            System.out.println("Hay caracteres repetidos.");
        }else{
            System.out.println("No hay caracteres repetidos.");
        }
    }
}

        
        
    


