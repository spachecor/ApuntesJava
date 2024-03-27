package temaseis.genericos.clasegenerica.ejercicio.productos;

/**
 * Clase que define los objetos del tipo Lacteo, que son productos
 * @author Selene
 * @version 1.0
 */
public class Lacteo extends Producto{
    Integer cantidad, proteinas;

    /**
     * Constructor de objetos del tipo Lacteo
     * @param nombre nombre del producto
     * @param precio precio del producto
     * @param cantidad la cantidad que trae el producto del tipo lacteo
     * @param proteinas las proteinas que trae el producto del tipo lacteo
     */
    public Lacteo(String nombre, Double precio, Integer cantidad, Integer proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Integer getProteinas() {
        return proteinas;
    }
}
