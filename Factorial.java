public class Factorial {
    public static void main(String[] args) {
        
        int factorial, i;
        factorial=1;
        i=4;
        
        while(i !=0){
            factorial=factorial*i;
            i--;
        }
        System.out.println("El factorial de 4 es: " + factorial);

        factorial=1;
        i=15;

        while(i !=0){
        factorial=factorial*i;
        i--;
        }
        System.out.println("El factorial de 15 es: " + factorial);

    }
}