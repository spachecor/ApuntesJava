package temados.poo.encapsular;

public class Transporte {
	private int velocidad;
	private String marca;
	private String modelo;
	private long kilometraje;
	
	//Método setter. Éstos métodos son utilizados para guardar/fijar el valor de algún atributo
	public void setMarca(String marca) {
		this.marca=marca;
	}
	
	/*La única forma de acceder a los atributos de esta clase es a través del método setter, pues
	 * todas tienen el modificador de acceso private, que hace que sólo se pueda modificar su valor
	 * dentro de la clase.
	 */
	
	
}
