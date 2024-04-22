package POO1;

import java.util.Random;

public class Metodos {

    public static int generarNumeroAleatorio(int minimo, int maximo) {
        Random random = new Random();
        return random.nextInt(maximo - minimo + 1) + minimo;

    }
}