package temaseis.genericos;

/**
 * Clase genérica (Lleva el diamante al lado del nombre de la clase)
 */
public class Vendedor extends Persona implements Comparable<Vendedor>{
    public Vendedor(String nombre){
        super(nombre);
    }
    @Override
    public int compareTo(Vendedor vendedor) {
        return this.nombre.compareTo(vendedor.nombre);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
