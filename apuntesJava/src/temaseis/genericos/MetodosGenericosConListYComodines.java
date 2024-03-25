package temaseis.genericos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetodosGenericosConListYComodines {
    public static void main(String[] args) {
        //CON ARRAYLIST
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Amalia"));
        personas.add(new Persona("Pedro"));

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Sonia"));
        clientes.add(new Cliente("Santiago"));

        ArrayList<Vendedor> vendedores = new ArrayList<>();
        vendedores.add(new Vendedor("Carolina"));
        vendedores.add(new Vendedor("Carlos"));

        imprimir(personas);//imprime las personas
        imprimir(clientes);//imprime los clientes
        imprimir(vendedores);//imprime los vendedores

        //AHORA CON LIST
        Persona[] personasArray = {
                new Persona("Sergio"),
                new Persona("Samanta")
        };
        Cliente[] clientesArray = {
                new Cliente("Rodrigo"),
                new Cliente("Raquel")
        };
        Vendedor[] vendedoresArray = {
                new Vendedor("Eustaquio"),
                new Vendedor("Ester")
        };

        List<Persona> personasLista = Arrays.asList(personasArray);
        List<Cliente> clientesLista = Arrays.asList(clientesArray);
        List<Vendedor> vendedoresLista = Arrays.asList(vendedoresArray);

        imprimir(personasLista);
        imprimir(clientesLista);
        imprimir(vendedoresLista);

    }
    //AL PONER <? extends Persona>, ESTAMOS INDICANDO QUE ES CUALQUIER OBJETO QUE HEREDE DE PERSONA, NO ÚNICAMENTE
    //PERSONAS, SINO TAMBIÉN SUS HIJOS.
    public static <Persona> void imprimir(ArrayList<? extends Persona> arrayList){
        arrayList.forEach(System.out::println);
    }
    public static <Persona> void imprimir(List<? extends Persona> lista){
        lista.forEach(System.out::println);
    }
}
