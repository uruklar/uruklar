package POO1;

public class Aula {

    private int id;
    private Profesor profesor;
    private Alumno[] alumnos;
    private String asignatura;

    private final int MAX_ALUMNOS=20;

    public Aula(){

        id=01;

        profesor=new Profesor();

        alumnos=new Alumno[MAX_ALUMNOS];

        creaAlumnos();

        asignatura=Constantes.ASIGNATURAS[Metodos.generarNumeroAleatorio(0,2)];

    }

    private void creaAlumnos(){

        for(int i=0; i<MAX_ALUMNOS;i++){

            alumnos[i]=new Alumno();

        }

    }

    private boolean asistenciaAlumnos(){

        int contadorAsistencia=0;

        for(int i=0;i<MAX_ALUMNOS;i++){

            if(alumnos[i].isAsistencia()){

                contadorAsistencia++;

            }

        }

        System.out.println("Hay "+contadorAsistencia+" alumnos presentes.");
        return contadorAsistencia>=(MAX_ALUMNOS/2);

        }

    

    public boolean darClase(){

        if(!profesor.isAsistencia()){
            System.out.println("El profesor no esta, no se puede dar clase.");
            return false;

        }else if(profesor.getAsignatura().equals(asignatura)){
            System.out.println("El profesor y la materia no coinciden, no se puede dar clase.");
            return false;

        }else if(!asistenciaAlumnos()){
            System.out.println("La asistencia es demasiado baja, no se puede dar la clase.");
            return false;

        }

        System.out.println("Se puede dar clase.");
        return true;

    }

    public void notas(){

        int chicosAprobados=0;
        int chicasAprobadas=0;

        for(int i=0;i<MAX_ALUMNOS;i++){

            if(alumnos[i].getCalificacion()>=5){
                if(alumnos[i].getSexo()=='M'){
                    chicosAprobados++;
                }else{
                    chicasAprobadas++;
                }

                System.out.println(alumnos[i].toString());
            }

        }


        System.out.println("Hay "+ chicosAprobados+ " chicos aprobados y "+ chicasAprobadas+ " chicas aprobadas.");

    }

}
