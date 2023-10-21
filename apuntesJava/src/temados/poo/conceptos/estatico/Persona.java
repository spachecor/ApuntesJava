package temados.poo.conceptos.estatico;
/**
 * Ejemplo de miembros estáticos e instanciables
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Persona {
	//vamos a crear una propiedad estática para contar el número de instancias del tipo persona que 
	//se van a crear.
	private static int numPersonas;//estática
	//numPersonas se guarda en la memoria de mi tipo de dato, no del objeto. MUY IMPORTANTE
	
	//Propiedad instanciable, sólo se puede acceder a través de una instancia
	private String nombre;//instanciable
	
	/**
	 * Constructor predeterminado. Su función es incrementar una variable estática que almacena un 
	 * número de instancias de Persona creadas. Todos los objetos en su creación acceden a la propiedad
	 * estática, que pertenece al tipo de datos Persona.
	 */
	public Persona() {
		//Acceso estático
		Persona.numPersonas++;
		//En vez de usar this., lo llamamos con el tipo de dato(Persona.). Es un método de acceso estático
		
		//Acceso instanciable
		this.nombre="Juan Domingo";
		
	}
	/**
	 * Método estático que devuelve el número de instancias de personas creadas.
	 * @return un número entero que representa el número de instancias de personas creadas.
	 */
	//DEBE SER ESTÁTICO, OBLIGATORIAMENTE, PORQUE ESTAMOS TRABAJANDO CON DATOS ESTÁTICOS
	public static int getNumPersonas() {
		//se devuelve el valor de la propiedad estática numPersonas mediante acceso estático
		return Persona.numPersonas;
	}
	/* Si un tipo de dato no tiene que almacenar ninguna información de estado, lo normal es que sean datos
	 * estáticos. Un buen ejemplo de esto e sla clase Math.
	 * 
	 * Los métodos estáticos sirven para cuando no se quiere/ùede instanciar un objeto pero se quieren utilizar
	 * sus métodos. Éstos deben ser estáticos también.
	 * */
}
