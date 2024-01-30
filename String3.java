import java.util.Scanner;
public class String3 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String input;

        System.out.println("Escriba 2 o 3 palabras");
        input = in.nextLine();

        //Separo el texto en palabras
        String [] separado = input.split("\\s+");

        //Cuento la cantidad de palabras
        int cantidadPalabras = separado.length;

        for(int i=0; i<cantidadPalabras;i++){
            String palabras = separado[i];
            if(i==cantidadPalabras-1){
                System.out.println(palabras.substring(0,palabras.length()-1));
            }else{
                System.out.println(palabras);
            }
        }

                
    }
}
