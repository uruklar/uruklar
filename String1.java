import java.util.Scanner;
public class String1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String contraseña, primera, ultima, restante;
        int limite=25, tamaño;
        Boolean especiales = false, cantidad = false;

                System.out.println("Escriba su contraseña:");
                contraseña = in.nextLine();
                if (contraseña.length() > limite) {
                    System.out.println("La contraseña solo puede contener 25 caracteres.");
                    cantidad=true;
                }else
                    for(int i=0; i<contraseña.length();i++){
                        if (contraseña.charAt(i)== '@') {
                            System.out.println("La contraseña no puede contener el caracter '@'.");
                            especiales=true;
                            i=contraseña.length();
                        }else if(contraseña.charAt(i)== '.'){
                            System.out.println("La contraseña no puede contener el caracter '.'.");
                            especiales=true;
                            i=contraseña.length();
                        }else if(contraseña.charAt(i)== '&'){
                            System.out.println("La contraseña no puede contener el caracter '&'.");
                            especiales=true;
                            i=contraseña.length();
                        }else if(contraseña.charAt(i)== '$'){
                            System.out.println("La contraseña no puede contener el caracter '$'.");
                            especiales=true;
                            i=contraseña.length();
                        }else if(contraseña.charAt(i)== '/'){
                            System.out.println("La contraseña no puede contener el caracter '/'.");
                            especiales=true;
                            i=contraseña.length();
                        }else if(contraseña.charAt(i)== '#'){
                            System.out.println("La contraseña no puede contener el caracter '#'.");
                            especiales=true;
                            i=contraseña.length();
                    }
                    }
                        if(especiales==false && cantidad==false){
                        tamaño = contraseña.length();
                        primera = contraseña.substring(0,1);
                        ultima = contraseña.substring(tamaño-1);
                        restante = contraseña.substring(1, tamaño-1);
                        contraseña = primera.toUpperCase() + restante + ultima.toUpperCase();
                        System.out.println("Tu contraseña ha sido guardada como: " + contraseña);
                    }
    }
}

