package temaseis.genericos.clasegenerica.ejercicio;

import temaseis.genericos.clasegenerica.ejercicio.productos.Producto;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase genérica, que trata objetos del tipo productos y los almacena en listas. Hereda de arraylist
 * @param <T> tipo de objeto que hereda de producto
 */
public class BolsaSupermercado<T extends Producto>{
    int MAX = 5;
    List<T> bolsa;
    {
        bolsa = new ArrayList<>();
    }

    /**
     * Método donde podremos agregar en la bolsa los productos
     * @param t el nuevo producto a agregar
     */
    public void addProducto(T t){
        if(this.bolsa.size()<this.MAX)this.bolsa.add(t);
        else System.out.println("La bolsa está llena");
    }

    public List<T> getProductos(){
        return this.bolsa;
    }
}
