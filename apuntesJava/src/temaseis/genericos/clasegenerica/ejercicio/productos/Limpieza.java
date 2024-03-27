package temaseis.genericos.clasegenerica.ejercicio.productos;
/**
 * Clase que define los objetos del tipo Limpieza, que son productos
 * @author Selene
 * @version 1.0
 */
public class Limpieza extends Producto{
    String componentes;
    Double litros;

    /**
     * Constructor de objeto del tipo Limpieza
     * @param nombre nombre del producto
     * @param precio precio del producto
     * @param componentes componentes del producto de limpieza
     * @param litros litros que contiene el producto de limpieza
     */
    public Limpieza(String nombre, Double precio, String componentes, Double litros) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public Double getLitros() {
        return litros;
    }
}
