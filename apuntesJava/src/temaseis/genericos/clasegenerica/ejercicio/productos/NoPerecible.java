package temaseis.genericos.clasegenerica.ejercicio.productos;
/**
 * Clase que define los objetos del tipo NoPerecible, que son productos
 * @author Selene
 * @version 1.0
 */
public class NoPerecible extends Producto{
    Integer contenido, calorias;
    /**
     * Constructor de objeto del tipo Limpieza
     * @param nombre nombre del producto
     * @param precio precio del producto
     * @param contenido el contenido que contiene del producto de no perecible
     * @param calorias calorias que contiene el producto de no perecible
     */
    public NoPerecible(String nombre, Double precio, Integer contenido, Integer calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public Integer getContenido() {
        return contenido;
    }

    public Integer getCalorias() {
        return calorias;
    }
}
