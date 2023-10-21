package temados.poo.conceptos.estatico;
/**
 * El método main es estático, porque el sistema operativo no sabe hacer new.
 * Si nos fijamos, en los parámetros del método main tenemos String[],y esos corchetes se usan con
 * arrays.
 * Los arrays son una secuencia de elementos que son el mismo tipo de dato.
 */
public class TestPersona {
	public static void main(String[] args) {
		//Decimos que queremos acceder a la primera posición del array
		//Las posiciones del array comienzan desde cero, es decir, la primera será 0, la segunda 1, etc.
		System.out.println("Hola " + args[0]);
		//ERROR (de primeras si no lo has configurado)
		/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds
		 * for length 0	at apuntesJava/temados.poo.conceptos.estatico.TestPersona.main(TestPersona.java:11)*/
		
		//1º Falla porque, si no metemos argumentos, args tiene una longitud 0. Ésto quiere decir
		//que no tiene elementos, está vacío.
		//Luego vamos a "Run Configurations" y en la pestaña "Arguments" le introducimos los
		//argumentos.
		//Cada argumento se meterá en orden y separados entre sí con espacios.
		//Con esto le añadimos los valores a args[] y ya tiene valores.
		//Esta configuración se comparte entre debug y run, por lo que no tenemos que hacerlo en
		//ambos sitio.
		System.out.println("Hola " + args[1]);
		
		/*Podemos también con el run configuration configurar el JRE que queremos, cambiandolo al que
		 * queramos probar. Para esto lo tenemos que tener instalado previamente.
		 * Esto es muy útil para poder probar nuestro programa en diferentes versiones de java y
		 * comprobar su comportamientos en diferentes tipos de JRE.*/
		
		/* ¿CÓMO PODEMOS IR RÁPIDAMENTE A LA CLASE DEL OBJETO QUE QUERAMOS O INCLUSO VER SU JERARQUÍA DE
		 * LLAMADA?
		 * 
		 * Pulsamos Ctrl y nos ponemos encima del nombre del objeto:
		 * - Open declaraton y Open implementarion nos lleva a la clase del objeto.
		 * - Open Call Hierarchy nos muestra la jerarquía de llamada, desde donde se llama al éste
		 *  objeto.
		 *  
		 * ESTO ÚLTIMO ES SÚPER ÚTIL PARA CUANDO HAYA FALLOS PODER ENCONTRARLOS.
		 * */

/*---------------------------------------------------------------------------------------------------*/		
	//se crean dos objetos del tipo Persona
	Persona persona1 = new Persona();
	Persona persona2 = new Persona();
	//se obtiene el número de personas creadas a partir de un método estático de Persona
	System.out.println(Persona.getNumPersonas());
	
/*---------------------------------------------------------------------------------------------------*/		
	/* ¿CÓMO SABER SI UN OBJETO ES ESTÁTICO O TIENE MÉTODOS ESTÁTICOS?
	 * Para saberlo, debemos poner el nombre del tipo del objeto (Ej: String o Persona, no el nombre
	 * de un objeto en concreto de este tipo de objetos, sino el nombre del tipo de objetos).
	 * Después, agregamos un punto después. Todos los métodos que nos aparezcan, serán estáticos,
	 * porque no es necesario instanciar el objeto (crear un) para poder acceder a sus métodos.
	 * Ej: 
	 * String.valueOf(1);
	 * int Math.PI();
	 * etc...
	 * 
	 * Un método es estático porque podemos llamarlo sin instanciar/crear el objeto.
	 * Si llamamos a Math.PI, estamos llamando a la constante PI, que es estática porque podemos
	 * llamarla sin instanciar/crear un objeto Math.*/

	}
}
