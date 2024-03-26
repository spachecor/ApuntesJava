package temaseis.genericos.clasegenerica.clasecongenericos;

public class TestGenericos {
    public static void main(String[] args) {
        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Pepe", "caballo"));
        transporteCaballos.add(new Animal("Ana", "caballo"));
        transporteCaballos.add(new Animal("Joselito", "caballo"));
        transporteCaballos.add(new Animal("Alma", "caballo"));
        transporteCaballos.add(new Animal("Caballa", "caballo"));

        /*for(Animal a:transporteCaballos){
            System.out.println(a.getNombre()+" tipo: "+a.getTipo());
        }*/ //Sustituimos el for por un método genérico que me imprima los animales del camion
        TestGenericos.imprimir(transporteCaballos);

        Camion<Maquinaria> transporteMaquinas = new Camion<>(3);
        transporteMaquinas.add(new Maquinaria("taladro"));
        transporteMaquinas.add(new Maquinaria("picadora"));
        transporteMaquinas.add(new Maquinaria("perforadora"));

        /*for(Maquinaria m:transporteMaquinas){
            System.out.println(m.getTipo());
        }*/ //Sustituimos el for por un método genérico que me imprima las maquinarias del camion
        TestGenericos.imprimir(transporteMaquinas);

        Camion<Automovil> transporteAuto = new Camion<>(3);
        transporteAuto.add(new Automovil("Toyota"));
        transporteAuto.add(new Automovil("Ford"));
        transporteAuto.add(new Automovil("Citroen"));

        //Al  no usar genericos, entra un objeto Objects y luego hay que hacer casting, sin embargo, puede dar fallos,
        //porque si por lo que sea nos equivocamos y hacemos mal el casting y en vez de automovil ponemos animal, podríamos
        //acceder a los métodos de animal con un objeto automovil
        /*for(Automovil a:transporteAuto){
            System.out.println(a.getMarca());
        }*/ //Sustituimos el for por un método genérico que me imprima los automoviles del camion
        TestGenericos.imprimir(transporteAuto);
    }
    public static <T> void imprimir(Camion<T> camion){
        for(T t:camion){
            if(t instanceof Animal)System.out.println(((Animal) t).getNombre()+" tipo: "+((Animal) t).getTipo());
            else if(t instanceof Maquinaria)System.out.println("Tipo: "+((Maquinaria) t).getTipo());
            else if(t instanceof Automovil) System.out.println("Marca: "+((Automovil) t).getMarca());
            else System.out.println("WTF");
        }
    }
}
