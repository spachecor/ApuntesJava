package temaseis.genericos.clasegenerica.clasesingenericos;

public class TestGenericos {
    public static void main(String[] args) {
        Camion transporteCaballos = new Camion(5);
        transporteCaballos.add(new Animal("Pepe", "caballo"));
        transporteCaballos.add(new Animal("Ana", "caballo"));
        transporteCaballos.add(new Animal("Joselito", "caballo"));
        transporteCaballos.add(new Animal("Alma", "caballo"));
        transporteCaballos.add(new Animal("Caballa", "caballo"));

        for(Object o:transporteCaballos){
            //como no estamos usando genéricos, tenemos que hacer casting
            Animal a = (Animal) o;
            System.out.println(a.getNombre()+" tipo: "+a.getTipo());
        }

        Camion transporteMaquinas = new Camion(3);
        transporteMaquinas.add(new Maquinaria("taladro"));
        transporteMaquinas.add(new Maquinaria("picadora"));
        transporteMaquinas.add(new Maquinaria("perforadora"));

        for(Object o:transporteMaquinas){
            //como no estamos usando genéricos, tenemos que hacer casting
            Maquinaria m = (Maquinaria) o;
            System.out.println(m.getTipo());
        }

        Camion transporteAuto = new Camion(3);
        transporteAuto.add(new Automovil("Toyota"));
        transporteAuto.add(new Automovil("Ford"));
        transporteAuto.add(new Automovil("Citroen"));

        //Al  no usar genericos, entra un objeto Objects y luego hay que hacer casting, sin embargo, puede dar fallos,
        //porque si por lo que sea nos equivocamos y hacemos mal el casting y en vez de automovil ponemos animal, podríamos
        //acceder a los métodos de animal con un objeto automovil
        for(Object o:transporteAuto){
            //como no estamos usando genéricos, tenemos que hacer casting
            Animal a =(Animal) o;
            System.out.println(a.getNombre());
        }
    }
}
