package temaseis.genericos;

public class MetodosGenericosUsandoComparable {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("Almudena");
        Vendedor vendedor2 = new Vendedor("Sara");
        Vendedor vendedor3 = new Vendedor("Zoey");
        Vendedor max = maximo(vendedor1, vendedor2, vendedor3);
        System.out.println(max.nombre);//imprime Zoey
    }

    /**
     * Método genérico que toma tres tipos y los compara entre sí. Para ello, deben implementar comparable
     * @param a objeto 1 a comparar
     * @param b objeto 2 a comparar
     * @param c objeto 3 a comparar
     * @return el objeto mayor
     * @param <T> el tipo de objeto, que implementa comparable
     */
    public static <T extends Comparable<T>> T maximo(T a, T b, T c){
        //se asigna a como el posible máximo
        T max = a;
        //si b es mayor que a, se asigna b como el mayor
        if(b.compareTo(max) > 0) max = b;
        //si c es mayor a b(o a a en el casod e que a > b), se asigna c como el máximo
        if(c.compareTo(max) > 0) max = c;
        //se retorna el mayor
        return max;
    }
}
