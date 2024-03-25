package temaseis.genericos.clasegenerica.clasesingenericos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion implements Iterable {
    //lista de los objetos que van dentro del camión
    private List objetos;
    //la cantidad maxima de objetos que cogen en el camion
    private int max;

    /**
     * Constructor del camion
     * @param max cantidad maxima de objetos que cogen en el camion
     */
    public Camion(int max){
        this.max=max;
        this.objetos = new ArrayList();
    }

    /**
     * Método que añade objetos al camión. Se realiza comprobación para que no supere el maximo de objetos
     * @param objeto objeto que va a entrar en el camion
     */
    public void add(Object objeto){
        if(this.objetos.size()<=max)this.objetos.add(objeto);
        else throw new RuntimeException("no hay más espacio");
    }
//todo terminar

    /**
     * Método que devuelve un iterador de la lista de objetos del camión
     * @return un iterador de la lista de objetos del camión
     */
    @Override
    public Iterator iterator() {
        return this.objetos.iterator();
    }
}
