package POO2;

public class Metodos {

    public static int generarNumeroAleatorioEntero(int minimo, int maximo){
        int num=(int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
    }

    public static double generarNumeroAleatorioReal(double minimo, double maximo){
        double num=Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
    }

    public class Nombres {

        public static final String nombres[] = {"Fernando", "Laura", "Pepe", "Eufrasio"};
    
        public static int generaNumeroEnteroAleatorio(int minimo, int maximo) {
            int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
            return num;
        }
    }
}
