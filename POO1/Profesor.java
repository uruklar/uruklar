package POO1;

import java.util.Random;

public class Profesor extends Persona{

    private String asignatura;

    public Profesor() {
        super();

        Random random = new Random();

        super.setEdad(random.nextInt(30)+25);

        asignatura=Constantes.ASIGNATURAS[Metodos.generarNumeroAleatorio(0,2)];

    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public void disponibilidad() {

        int prob=Metodos.generarNumeroAleatorio(0,100);

        if(prob<20){
            super.setAsistencia(false);
        }else{
            super.setAsistencia(true);
        }

    }

}
