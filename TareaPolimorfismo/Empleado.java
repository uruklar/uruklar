package TareaPolimorfismo;

public class Empleado {

    private String nombre;

    //Constructor//
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    //Get y set atributo nombre//
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodo que devuelve empleado + nombre//
    @Override
    public String toString() {
        return "Empleado: " + this.nombre;
    }

}
