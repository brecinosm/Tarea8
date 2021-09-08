package Tarea8;
public class Comparador {

    private int edadAlumno;
    private double precioProducto;

    public Comparador() {
        this.edadAlumno=0;
        this.precioProducto=0;
    }

    public void setEdad(int edadAlumno) {

        this.edadAlumno = edadAlumno;
    }

    public void setPrecio(double precioProducto) {

        this.precioProducto = precioProducto;
    }


    //Comparador para producto
    public boolean igualQueP(Object pr) {
        Producto pro = (Producto) pr;
        return this.precioProducto == pro.getPrecio();
    }

    public boolean menorQueP(Object pr) {
        Producto pro = (Producto) pr;
        return pro.getPrecio() < this.precioProducto;
    }

    public boolean mayorQueP(Object pr) {
        Producto pro = (Producto) pr;
        return pro.getPrecio() > this.precioProducto;
    }

    public boolean mayorIgualQueP(Object pr) {
        Producto pro = (Producto) pr;
        return pro.getPrecio() >= this.precioProducto;
    }

    public boolean menorIgualQueP(Object pr) {
        Producto pro = (Producto) pr;
        return pro.getPrecio() <= this.precioProducto;
    }

    //Comparador para alumno
    public boolean igualQueA(Object al) {
        Alumno a = (Alumno) al;
        return this.edadAlumno == a.getEdad();
    }

    public boolean menorQueA(Object al) {
        Alumno a = (Alumno) al;
        return a.getEdad() < this.edadAlumno;
    }

    public boolean mayorQueA(Object al) {
        Alumno a = (Alumno) al;
        return a.getEdad() > this.edadAlumno;
    }

    public boolean mayorIgualQueA(Object al) {
        Alumno a = (Alumno) al;
        return a.getEdad() >= this.edadAlumno;
    }

    public boolean menorIgualQueA(Object al) {
        Alumno a = (Alumno) al;
        return a.getEdad() <= this.edadAlumno;
    }

}