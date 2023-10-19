package temados.poo.conceptos;

public class This {
	
	/* "this" es una palabra reservada. Se utiliza para referenciar a la propia instancia a la que
	 * pertenece.
	 * Es recomendable calificar con this a todas las referencias a los atributos y métodos del tipo
	 * objeto; y resulta obligatorio cuando queremos distinguir entre un parámetro y una variable de 
	 * instancia con el mismo nombre. También referenciamos con la palabra this a nuestros propios
	 * constructores.
	 * 
	 * 
	 * 
	 */

	//creemos propiedades de un objeto tipo concepto
	
	int propiedad1, propiedad2;
	
	//método constructor en el que los parámetros se denominan igual que los atributos del objeto.
	//Utilizamos this para evitar ambigüedades y para referenciar al atributo.
	public This (int propiedad1, int propiedad2) {
		this.propiedad1 = propiedad1;
		this.propiedad2 = propiedad2;
	}
	
	/* Con esto hemos conseguido 2 cosas: 
	 * 1º Hemos referenciado directamente al atributo dentro de nuestra propia clase, con lo cual,
	 * nuestro método no buscará "propiedad1" por todas las clases del programa, sino que irá a la
	 * memoria de ésta y buscará en ella "propiedad1". Así ahorramos tiempo y recursos.
	 * 2º Hemos evitado ambigüedad. si no lo hubiesemos hecho, estaríamos igualando propiedad1 consigo
	 * misma, no quedaría claro y daría problemas.
	 * 
	 * this también ayuda con el proceso de encapsulación, pues llamamos a la variable desde un método
	 * detro de su clase, y así podremos acceder a la propiedad encapsulada.
	 */
}
