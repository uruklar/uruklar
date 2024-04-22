package TareaPolimorfismo;

public class Tecnico extends Operario{

    //Constructor
    public Tecnico(String nombre) {
        super(nombre);
    }

    //Metodo que llama a la clase padre//
    @Override
    public String toString(){
        return super.toString() + ", Puesto: Tecnico.";
    }

}
