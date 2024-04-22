package TareaPolimorfismo;

public class Directivo extends Empleado{

    public Directivo(String nombre) {
        super(nombre);
    }

    //Metodo que llama clase padre//
    @Override
    public String toString(){
        return super.toString() + ", Clase: Directivo";
    }

}
