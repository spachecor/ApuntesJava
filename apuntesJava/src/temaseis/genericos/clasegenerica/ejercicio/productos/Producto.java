package temaseis.genericos.clasegenerica.ejercicio.productos;

/**
 * Clase abstracta producto, que es el molde de todos los productos
 * @author Selene
 * @version 1.0
 */
public abstract class Producto {
    protected String nombre;
    protected Double precio;

    /**
     * Constructor de objetos de tipo Producto
     * @param nombre el nombre del producto
     * @param precio el precio del producto
     */
    protected Producto(String nombre, Double precio){
        this.nombre=nombre;
        this.precio=precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }
}
