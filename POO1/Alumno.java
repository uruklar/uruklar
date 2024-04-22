package POO1;

import java.util.Random;

public class Alumno extends Persona{

    private double calificacion;

    public Alumno() {
        super();

        Random random = new Random();

        calificacion=random.nextInt(9);

        super.setEdad(random.nextInt(3)+10);

    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public void disponibilidad() {

        int prob=Metodos.generarNumeroAleatorio(0,100);

        if(prob<50){
            super.setAsistencia(false);
        }else{
            super.setAsistencia(true);
        }

    }

    public String toString(){

        return "Nombre: "+super.getNombre()+" ,sexo: "+super.getSexo()+" ,nota: "+calificacion;

    }


    
}
