package TareaPolimorfismo;

public class Oficial extends Operario{

    //Constructor//
    public Oficial(String nombre) {
        super(nombre);
    }

    //Metodo que llama a la clase padre//
    @Override
    public String toString(){
        return super.toString() + ", Puesto: Oficial.";
    }

}
