package temaseis.genericos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetodosGenericos {
    public static void main(String[] args) {
        String[] cadenasArreglo = {
                "Sara",
                "Juan",
                "María",
                "Pedro"
        };
        Integer[] numerosArreglo = {
            1,
            2,
            3,
            4
        };
        //Usamos nuestro método genérico que recibe el arreglo y que devuelve una lista con los datos contenidos dentro
        //del arreglo
        List<String> cadenasLista = fromArrayToList(cadenasArreglo);
        List<Integer> numerosLista = fromArrayToList(numerosArreglo);
        //usamos método foreach para iterar la lista e imprimirla,. OJO CÓMO VA EL ARGUMENTO
        cadenasLista.forEach(System.out::println);
        numerosLista.forEach(System.out::println);
        System.out.println("---------------------------------------------------------------");

        //Ahora usamos el metodo reescrito que toma dos arreglos, uno lo pasa a lista y el otro lo imprime por pantalla
        List<String> cadenaLista2 = fromArrayToList(cadenasArreglo, numerosArreglo);
        List<Integer> numerosLista2 = fromArrayToList(numerosArreglo, cadenasArreglo);
        System.out.println("---------------------------------------------------------------");

    }

    /**
     * Método que convierte un arreglo de un objeto cualquiera en una lista
     * @param t arreglo a convertir en lista
     * @return la lista resultante
     * @param <T> tipo de dato generico
     */
    public static  <T> List<T> fromArrayToList(T[] t){
        return Arrays.asList(t);
    }

    /**
     * Método reescrito del anterior, que en este caso, realiza las mismas funciones que el anterior y además imprime
     * por pantalla el segundo arreglo
     * @param t arreglo que será convertido en lista
     * @param g arreglo que será impreso por consola
     * @return la lista resultante de pasar a lista el arreglo t
     * @param <T> tipo de dato del primer arreglo
     * @param <G> tipo de dato del segundo arreglo
     */
    public static  <T, G> List<T> fromArrayToList(T[] t, G[] g){
        //usamos foreach para iterar e imprimir
        for(G elemento:g){
            System.out.println(elemento);
        }
        return Arrays.asList(t);
    }

}
