package temaseis.genericos;

public class MetodosGenericosLimitado {
    public static void main(String[] args) {
        //TODO terminar ejemplo demostrando como funcionan los métodos con genéricos limitados
        String cadena = "Hola";
        sorpresa(cadena);//imprime "Hola puede ser cualquier objeto"
        int numericoEntero = 3;
        sorpresa(numericoEntero);//imprime "3 es un Number"
        long numericoLargo = 346;
        sorpresa(numericoLargo);//imprime "346 es un Number"
        Persona persona = new Persona("Almudena");
        sorpresa(persona);//imprime "Persona{nombre='Almudena'} puede ser cualquier objeto"
        Cliente cliente = new Cliente("Álvaro");
        sorpresa(cliente);//imprime "Persona{nombre='Álvaro'} puede ser cualquier objeto"
        Vendedor vendedor = new Vendedor("Ana");
        sorpresa(vendedor);//imprime "Persona{nombre='Ana'} es una Persona e implementa la interfaz Comparable"
    }

    /**
     * Método genérico que recibe un objeto del tipo t e imprime t
     * @param t el objeto recibido
     * @param <T> el tipo del objeto
     */
    public static <T> void sorpresa(T t){
        System.out.println(t+" puede ser cualquier objeto");
    }

    /**
     * Método sobreescrito del anterior, que imprime el objeto que hereda de number y nos dice que hereda de number
     * @param t el objeto recibido
     * @param <T> el tipo de objeto recibido, que hereda de number
     */
    public static <T extends Number> void sorpresa(T t){
        System.out.println(t+" es un Number");
    }
    /**
     * Método sobreescrito del anterior, que imprime el objeto que hereda de persona e implementa Comparable
     * @param t el objeto recibido
     * @param <T> el tipo del objeto recibido, que hereda de persona e implementa Comparable
     */
    public static <T extends Persona & Comparable<Cliente>> void sorpresa(T t){
        System.out.println(t+" es una Persona e implementa la interfaz Comparable");
    }
}

