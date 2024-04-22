package POO2;


public class Espectador {

    /*Atributos*/
    private String nombre;
    private int edad;
    private double dinero;

    /*Constructores*/
    public Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    /*Metodos*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }


    public void pagar(double precio) {
        dinero -= precio;
    }


    public boolean tieneEdad(int edadMinima) {
        return edad >= edadMinima;
    }


    public boolean tieneDinero(double precioEntrada) {
        return dinero >= precioEntrada;
    }

    @Override
    public String toString() {
        return "el nombre del espectador es " + nombre + " de " + edad + " años y con " + dinero + " euros en su bolsillo";
    }

}