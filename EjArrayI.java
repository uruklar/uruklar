import java.util.Scanner;
public class EjArrayI {
    public static void main(String[] args) {

        int num = 10;
        int numeros[] = new int [num];

//Ejercicio 1, el array almacena numeros del 1 al 10 y los muestra en pantalla en orden inverso//
        for(int i=0; i<numeros.length; i++){
            numeros [i] = i+1;
        }
        System.out.println("Los numeros del array en orden inverso son:");

        for (int x= numeros.length; x >= 0; x--){
            System.out.println(x + " ");
        }

//Ejercicio 2//
        int pantalla1, pantalla2;
        Scanner in = new Scanner(System.in);

        //Primer array//
        System.out.println("Introduzca el numero de posiciones que quiere que tenga su primer array.");
        pantalla1 = in.nextInt();
        int bucle1 [] = new int [pantalla1];

        for (int i=0; i<bucle1.length ;i++){
            System.out.println("Introduza un valor del array:");
            bucle1[i] = in.nextInt();
        }

        //Segundo array//
        System.out.println("Introduza el numero de posiciones que quiere para su sengundo array.");
        pantalla2 = in.nextInt();
        int bucle2 [] = new int [pantalla2];

        for(int i=0; i<bucle2.length; i++){
            bucle2 [i] = i+1;
        }

        //Tercer array//
        int bucle3 [] = new int [bucle1.length + bucle2.length];
        int contador = 0;

        for(int i=0; i<bucle1.length ; i++){
            bucle3[contador] = bucle1[i];
            contador++;
        }

        for(int i=0; i<bucle2.length; i++){
            bucle3[contador] = bucle2[i];
            contador++;
        }

        System.out.println("Los datos almacenados en el tercer array son: ");
        for(int i : bucle3){
            System.out.println(i + " ");
        }

//Tercer ejercicio//
        String caracteres[] = {"a","e","r","t","y","u"};
        int enteros[] = {1,2,3,4,5,6};

        int celdas[] = new int [caracteres.length + enteros.length];
        System.out.println("El numero de celdas del array del tercer ejercicio es: " + celdas.length);

//Cuarto ejercicio//
        int ParImpar [] = new int[57];
        int par=0, impar=0;

        for(int i=0; i<ParImpar.length; i++){
            ParImpar[i] = i+1;
        }
        for(int i=0; i<ParImpar.length;i++){
            if(ParImpar[i] % 2 == 0){
                par++;
            }else{
                impar++;
            }
        }
        System.out.println("El numero de celdas pares es " + par + " mientras que el numero de celdas impares es " + impar);

//Quinto ejercicio//
        int notas[] = new int[6];
        int suma=0;
        double media;
        boolean matematicas=false, lengua=false, ingles=false, quimica=false, fisica=false, biologia=false;

        System.out.println("Introduzca la nota de matematicas del 0 al 10.");
        notas[0] = in.nextInt();
        while(matematicas==false){
            if (notas[0] >= 0 && notas[0]<=10){
                matematicas=true;
            }else{
                System.out.println("Las notas solo pueden tener un valor entre 0 y 10. Por favor vuelva a introducir la nota.");
                notas[0] = in.nextInt();
            }
        }
        System.out.println("Introduzca la nota de lengua del 0 al 10.");
        notas[1] = in.nextInt();
        while(lengua==false){
            if (notas[1] >= 0 && notas[1]<=10){
                lengua=true;
            }else{
                System.out.println("Las notas solo pueden tener un valor entre 0 y 10. Por favor vuelva a introducir la nota.");
                notas[1] = in.nextInt();
            }
        }
        System.out.println("Introduzca la nota de ingles del 0 al 10.");
        notas[2] = in.nextInt();
        while(ingles==false){
            if (notas[2] >= 0 && notas[2]<=10){
                ingles=true;
            }else{
                System.out.println("Las notas solo pueden tener un valor entre 0 y 10. Por favor vuelva a introducir la nota.");
                notas[2] = in.nextInt();
            }
        }
        System.out.println("Introduzca la nota de quimica del 0 al 10.");
        notas[3] = in.nextInt();
        while(quimica==false){
            if (notas[3] >= 0 && notas[3]<=10){
                quimica=true;
            }else{
                System.out.println("Las notas solo pueden tener un valor entre 0 y 10. Por favor vuelva a introducir la nota.");
                notas[3] = in.nextInt();
            }
        }
        System.out.println("Introduzca la nota de fisica del 0 al 10.");
        notas[4] = in.nextInt();
        while(fisica==false){
            if (notas[4] >= 0 && notas[4]<=10){
                fisica=true;
            }else{
                System.out.println("Las notas solo pueden tener un valor entre 0 y 10. Por favor vuelva a introducir la nota.");
                notas[4] = in.nextInt();
            }
        }
        System.out.println("Introduzca la nota de biologia del 1 al 10.");
        notas[5] = in.nextInt();
        while(biologia==false){
            if (notas[5] >= 0 && notas[5]<=10){
                biologia=true;
            }else{
                System.out.println("Las notas solo pueden tener un valor entre 0 y 10. Por favor vuelva a introducir la nota.");
                notas[5] = in.nextInt();
            }
        }

        for(int i=0; i<notas.length;i++){
        suma += notas[i];
        }
        media = (double)suma/notas.length;
        
        if(media>5 && media<6.5){
            System.out.println("La nota es un aprobado con una nota media de " + media);
        }else if(media>6.5 && media <8.5){
            System.out.println("La nota es un notable con una nota media de " + media);
        }else if(media>8.5){
            System.out.println("La nota es un sobresaliente con una nota media de " + media);
        }else{
            System.out.println("La nota conjunta final es un suspenso con una nota media de " + media);
        }
    }
}
