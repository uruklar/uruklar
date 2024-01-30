import java.util.Scanner;
public class String4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String correo;
        int arroba=0, tamaño, mayusculas=0;
        boolean check1=false, check2=false, check3=false, check4=false;
                
System.out.println("Introduzca su direccion de correo:");
correo = in.nextLine();

tamaño = correo.length();

for(int i=0;i<correo.length();i++){
    if(correo.charAt(i) == '@'){
        arroba++;
    }
    }
for(char may : correo.toCharArray()){
    if(Character.isUpperCase(may)){
        mayusculas++;
    }
}
    
if(arroba!=1){
    System.out.println("La direccion de correo debe contener una '@' obligatoriamente.");
}else{
    check1=true;
}
if(correo.endsWith(".")){
    check2=true;
    }else{
        System.out.println("La dirrecion de correo debe acabar con un '.'.");
    }
if(correo.length()<25){
    System.out.println("La direccion de correo debe contener al menos 25 caracteres.");
}else{
    check3=true;
}
if(mayusculas!=0){
    System.out.println("La direccion de correo no puede contener letras mayusculas.");
}else{
    check4=true;
}
if(check1 && check2 && check3 && check4){
    System.out.println("Direccion de correo guardada correctamente.");
}

    }
}
    

