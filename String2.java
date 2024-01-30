import java.util.Scanner;
public class String2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String texto, mitad, ultimo;
        int longitud, vocales=0;
        boolean palindromo=false;
        
        System.out.println("Por favor, introduzca dos o 3 palabras.");
        texto = in.nextLine();

        longitud = texto.length();
        mitad = texto.substring(0,longitud/2);
        System.out.println("La mitad de tu texto es: " + mitad);

        ultimo = texto.substring(longitud-1);
        System.out.println("El ultimo caracter de tu texto es: " + ultimo);

        System.out.println("El texto de forma inversa es:");
        for(int i = texto.length()-1; i>=0; i--){
            System.out.print(texto.charAt(i));
        }
        System.out.println("");
        String guiones = String.join("-" , texto.split(""));
        System.out.println("El texto separado con '-' es:");
        System.out.println(guiones);

        for(int i=0; i<texto.length();i++ ){
            if(texto.charAt(i) == 'a'){
                vocales++;
            }else if((texto.charAt(i) == 'e')){
                    vocales++;
                }else if(texto.charAt(i) == 'e'){
                        vocales++;
                    }else if(texto.charAt(i) == 'i'){
                            vocales++;
                        }else if(texto.charAt(i) == 'o'){
                                vocales++;
                            }else if(texto.charAt(i) == 'u'){
                                    vocales++;
                                }
            }
            System.out.println("El numero de vocales es: " + vocales);

            for(int i = texto.length()-1; i>=0; i--){
                if (texto.charAt(i)!= texto.charAt(texto.length()-1-i)){
                    palindromo = false;
                }else{
                    palindromo = true;
                }
                }
            if (palindromo){
                System.out.println("El texto es un palindromo");
            }else{
                System.out.println("El texto no es un palindromo");
            }
        }
}
