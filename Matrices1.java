public class Matrices1 {
    public static void main(String[] args) {

        // Asignacion manual de valores a la matriz//

        int[][] matriz ={
        {3,4,5,78},
        {0,0,0,0},
        {1,1,1,1},
        {6,6,6,-1}
        };

        //Impresion de los valroes de la mariz en el formato requerido utilizando dos bucles para recorrer filas y columnas//

        System.out.print("{");
        for(int f=0; f<matriz.length;f++){

            for(int c=0; c<matriz[f].length;c++){
                System.out.print(" " + matriz[f][c] + " ");
                if(c == matriz[f].length - 1){
                    System.out.print("}");
                    System.out.println("");
                    if(f < matriz[f].length-1){
                        System.out.print("{");
                    }
                }
            }
        }
        //En esta parte se busca el mayor valor de la matriz, comparando mediante un bucle el menor valor posible con los valores de la matriz, guardando en la variable el mayor//

        int NumMayor=Integer.MIN_VALUE;
        for (int f=0; f<matriz.length;f++){
            for (int c=0; c<matriz[f].length;c++ ){
                NumMayor=Math.max(NumMayor, matriz[f][c]);
            }
        }
        System.out.println("El mayor valor en la matriz es " + NumMayor);

        //En esta parte se recorre de nuevo la matriz con dos bucles, comprobando mediante la clase Math el menor valor y guardandolo en la variable corresponiente//

        int NumMenor=Integer.MAX_VALUE;
        for(int f=0;f<matriz.length;f++){
            for(int c=0;c<matriz[f].length;c++){
                NumMenor=Math.min(NumMenor, matriz[f][c]);
            }
        }
        System.out.println("El menor valor en la matriz es " + NumMenor);

        //En esta parte se muestran los valores de la primera fila y de la ultima de la matriz recorriendo la matriz y indicando que solo quieres la primera y ultima filas en pantalla//

        System.out.println("Los valores de la primera fila son: ");
        for(int f=0; f<matriz.length;f++){
            for(int c=0; c<matriz[f].length;c++){
                if(f==0){
                    System.out.print(matriz[0][c]);
                }
                if(f==matriz.length-1 && c==0){
                    System.out.println("");
                    System.out.println("Los valores de la ultima fila son:");
                }
                if(f==matriz.length-1){
                    System.out.print(matriz[matriz.length-1][c]);
                }
            }
        }
    }
}
