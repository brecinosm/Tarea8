package Tarea8;
public class Alumno {

    private String carneAlumno;
    private String nombreAlumno;
    private int edadAlumno;

    public Alumno(String carneAlumno, String nombreAlumno, int edadAlumno) {
        this.carneAlumno = carneAlumno;
        this.nombreAlumno = nombreAlumno;
        this.edadAlumno = edadAlumno;
    }

    public int getEdad() {
        return edadAlumno;
    }
}