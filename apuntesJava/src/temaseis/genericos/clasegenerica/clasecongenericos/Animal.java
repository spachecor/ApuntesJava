package temaseis.genericos.clasegenerica.clasecongenericos;

public class Animal {
    private String nombre, tipo;
    public Animal(String nombre, String tipo){
        this.nombre=nombre;
        this.tipo=tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
