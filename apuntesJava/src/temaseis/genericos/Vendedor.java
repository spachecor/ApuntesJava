package temaseis.genericos;

public class Vendedor<T> extends Persona implements Comparable<T>{
    public Vendedor(String nombre){
        super(nombre);
    }
    @Override
    public int compareTo(T o) {
        return 0;
    }
}
