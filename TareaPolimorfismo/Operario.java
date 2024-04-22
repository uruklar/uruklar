package TareaPolimorfismo;

public class Operario extends Empleado{

    //Constructor//
    public Operario(String nombre) {
        super(nombre);

    }

    //Metodo que llama clase padre//
    @Override
    public String toString(){
        return super.toString() + ", Clase: Operario";
    }


}
