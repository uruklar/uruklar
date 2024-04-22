package TareaPolimorfismo;

public class Main {

    public static void main(String[] args) {
        
        Oficial oficial = new Oficial("Pedro");
        System.out.println(oficial);

        Tecnico tecnico = new Tecnico("Ana");
        System.out.println(tecnico);

        Directivo directivo = new Directivo("Antonio");
        System.out.println(directivo);

    }
    
}
