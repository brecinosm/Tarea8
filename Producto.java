package Tarea8;
public class Producto {

    private int idProducto;
    private String nombreProducto;
    private double precioProducto;

    public Producto(int idProducto, String nombreProducto, double precioProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }

    public double getPrecio() {
        return precioProducto;
    }
}