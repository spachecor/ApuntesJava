package temaseis.genericos;

public class MetodosGenericosLimitado {
    public static void main(String[] args) {
        //TODO terminar ejemplo demostrando como funcionan los métodos con genéricos limitados
        
    }

    /**
     * Método genérico que recibe un objeto del tipo t e imprime t
     * @param t el objeto recibido
     * @param <T> el tipo del objeto
     */
    public <T> void sorpresa(T t){
        System.out.println(t);
    }

    /**
     * Método sobreescrito del anterior, que imprime el objeto que hereda de number y nos dice que hereda de number
     * @param t el objeto recibido
     * @param <T> el tipo de objeto recibido, que hereda de number
     */
    public <T extends Number> void sorpresa(T t){
        System.out.println(t+" es un Number");
    }
    /**
     * Método sobreescrito del anterior, que imprime el objeto que hereda de persona e implementa Comparable
     * @param t el objeto recibido
     * @param <T> el tipo del objeto recibido, que hereda de persona e implementa Comparable
     */
    public <T extends Persona&Comparable<T>> void sorpresa(T t){
        System.out.println(t+" es una Persona e implementa la interfaz Comparable");
    }
}

