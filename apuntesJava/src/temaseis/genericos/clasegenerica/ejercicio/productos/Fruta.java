package temaseis.genericos.clasegenerica.ejercicio.productos;
/**
 * Clase que define los objetos del tipo Fruta, que son productos
 * @author Selene
 * @version 1.0
 */
public class Fruta extends Producto{
    Double peso;
    String color;

    /**
     * Constructor de objetos del tipo fruta
     * @param nombre nombre del producto tipo fruta
     * @param precio precio del producto
     * @param peso peso de la fruta
     * @param color color de la fruta
     */
    public Fruta(String nombre, Double precio, Double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    public Double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }
}
