package POO1;

import java.util.Random;

public abstract class Persona {

    private String nombre;
    private char sexo;
    private int edad;
    private boolean asistencia;

    private final String[] NOMBRES_CHICOS={"Juan","Pedro","Miguel","Carlos","Alejandro","Andres","Luis","Gabriel"};
    private final String[] NOMBRES_CHICAS={"Maria","Ana","Laura","Sofia","Carla","Natalia","Silvia","Sandra"};

    public Persona (){

        Random random = new Random();

        int determinar_sexo = random.nextInt(2);

        if(determinar_sexo==0) {
            nombre=NOMBRES_CHICOS[random.nextInt(7)];
            sexo='M';
        }else{
            nombre=NOMBRES_CHICAS[random.nextInt(7)];
            sexo='F';
        }

        disponibilidad();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



    public abstract void disponibilidad();


    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    

}
