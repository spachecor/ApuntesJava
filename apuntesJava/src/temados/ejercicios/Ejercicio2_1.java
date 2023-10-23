package temados.ejercicios;

public class Ejercicio2_1 {
	/* 1- La programación orientada a objetos se basa en el Modelo de Objetos. Este modelo se
	 * fundamenta en el uso algunas capacidades. Enumera dichas capacidades y explica una de las más
	 * importantes (pon un ejemplo tuyo), y otra de menor importancia (3 puntos).
	 * 
	 * Las capacidades son las siguientes:
	 * ·4 carácterísticas principales:
	 * - Abstraer --> Es la capacidad que permite distinguir aquellas características fundamentales
	 * 				de un objeto que lo hacen diferente al resto, y que proporcionan límites 
	 * 				conceptuales bien definidos relativos a la perspectiva del que lo visualiza.
	 * - Encapsular --> Es la capacidad que permite mantener oculta la implementación de una
	 * 					abstracción para los usuarios de la misma. El objetivo de encapsular es la 
	 * 					ocultación de la implementación, para que ninguna parte de un sistema
	 * 					complejo dependa de como se ha implementado otra parte.
	 * - Modularizar --> Es la capacidad que permite dividir un programa en agrupaciones lógicas de 
	 * 					sentencias. A estas agrupaciones se las llama módulos. Las ventajas de la
	 * 					modularización son:
	 * 						- Facilidad de mantenimiento, diseño y revisión.
	 * 						- Aumento de la velocidad de compilación.
	 * 						- Mejora en la organización y en la reusabilidad.
	 * 						- Maximizar la coherencia (el código dentro de un módulo tiene que tener
	 * 						cohesión entre sí). ES DESEABLE ALTA COHESIÓN Y DÉBIL ACOPLAMIENTO.
	 * 						- Minimizar las dependencias entre módulos.
	 * 						- Controlar el tamaño de los módulos. Módulos pequeños aumentan la desor-
	 * 						ganización; módulos muy grandes aumentan los tiempos de compilación y 
	 * 						reducen su manejabilidad.
	 * 					En lenguajes como Java, se ha creado el concepto de paquete que permite un nº
	 * 					ilimitado de niveles de modularidad.
	 * - Jerarquizar --> Es la capacidad que permite ordenar abstracciones. Su principal ventaja
	 * 					consiste en que la organización de las abstracciones de un sistema de una 
	 * 					jerarquía permite detectar estructuras y comportamientos comunes y con ello
	 * 					simplificar el desarrollo. En el esquema de poo se definen 2 formas básicas
	 * 					de jerarquías:
	 * 						-Jerarquías entre clases e interfaces.
	 * 						-Jerarquías entre objetos.
	 * 					Las jerarquías entre objetos se pueden clasificar en 2 tipos de relaciones:
	 * 					relaciones de asociación y relaciones de dependencia.
	 * 					Las relaciones de asociación establecen relaciones entre objetos de forma
	 * 					que se establece una conexión entre ellos. Permite construir objetos 
	 * 					mediante la asociación de objetos menores.
	 * 					Las relaciones de dependencia dan lugar a relaciones del tipo "tal objeto usa
	 * 					tal otro objeto", por lo que también se conocen como relaciones de uso. Estas
	 * 					relaciones se distinguen de las de asociación porque el ámbito y el tiempo de
	 * 					uso de un objeto desde otro está mucho más limitado. (La relación entre coche
	 * 					y gps es de asociación, porque un coche no necesita el gps para ser un coche; 
	 * 					sin embargo, la relación entre un coche y las ruedas es de dependencia, porque
	 * 					el coche necesita las ruedas para ser un coche.)
	 * 
	 * ·3 carácterísticas secundarias:
	 * - Tipo --> Es una caracterización precisa asociada a un conjunto de objetos. En poo, los objetos
	 * 			que comparten una misma interfaz se dice que tienen el mismo tipo. El tipado protege de
	 * 			lo errores que se pueden cometer al mezclar abstracciones. Los lenguajes pueden clasi.
	 * 			ficarse en dos grupos respecto a las restricciones que impone el tipo:
	 * 				- Lenguajes con tipado fuerte, en los que no es poible meclar variables de tipos
	 * 				diferentes (ej: Java).
	 * 				- Lenguajes con tipado débil, en los que es posible mezcla vriables de diferentes
	 * 				tipos en un mismo tipo.
	 * - Concurrencia --> Es la capacidad que permite la ejecución simultánea de varias secuencias de 
	 * 					instrucciones.
	 * - Persistencia --> Es la capacidad que permite que la existencia de los datos transcienda en el
	 * 					tiempo y en el espacio. Hay 6 tipos:
	 * 						- Expresiones: Cuya vida no supera el ámbito de una línea de código
	 * 						- Variables locales: Cuya vida se circunscribe a la vida de una función.
	 * 						- Variables globales: Que existen mientras se ejecuta un programa.
	 * 						- Datos que persisten de una ejecución a otra (guardado en un fichero para
	 * 							que el programa lo pueda recuperar al abrirse de nuevo).
	 * 						- Datos que sobreviven a una versión de un progrma (ej: cuando el programa
	 * 							se actualiza, pero se puede seguir utilizando lo previamente guardado).
	 * 						- Datos que sobreviven cuando ya no existen los programas, los sitemas
	 * 							operativos e incluso los ordenadores en los que fueron creados (normal-
	 * 							mente copias de seguridad).
	 * 
	 *
	 * 2- ¿Qué es una instancia de una clase? ¿Cómo se crea una instancia en Java? Utiliza ejemplos
	 * propios en las respuestas (2 puntos)
	 * 
	 * La instancia de una clase es cuando se agisna memoria a la variable del tipo del objeto que se
	 * instancia.
	 * 
	 * Se crea con la palabra reservada new.
	 * 
	 * Ej: Persona persona1 = new Persona();
	 * En este ejemplo hemos creado una instancia del objeto persona con la palabra reservaba new y
	 * llamando al constructor. En este momento, la variable persona1 ya tiene asignado un espacio
	 * en memoria. 
	 *
	 * 3- La palabra reservada this se usa en muchos lenguajes de POO, podrías explicar para qué se
	 * usa en Java y poner algún ejemplo tuyo (2 puntos).
	 * 
	 * Es usa para referenciar a la propia instancia a la cual pertenece y para evitar ambigüedades.
	 * Ej: public Persona(int edad, String colorPiel, String sexo){
	 * 	this.edad=edad;
	 * 	this.colorPiel=colorPiel;
	 * 	this.sexo=sexo;
	 * }
	 *
	 * 4- ¿Cuáles son los miembros instanciables de una clase Java? ¿Hay miembros no instanciables?
	 * En caso afirmativo, ¿cómo se crea un miembro no instanciable? Utiliza algún ejemplo tuyo para
	 * que tu respuesta sea más clara (3 puntos).
	 * 
	 * Los miembros instanciables de una clase Java son aquellos que deben de ser instanciados/
	 * creados para poder utilizar sus diferentes métodos y funciones.
	 * 
	 *  Sí, hay miembros no instanciables, son lo estáticos.
	 *  
	 *  Un miembro no instanciable es estático, esto quiere decir, que serán comunes a todos los objetos
	 *  de un mismo tipo de objeto, y podrán ser modificados por todos los objetos del mismo tipo. Un 
	 *  ejemplo de esto es un contador de objetos instanciamos.
	 *  
	 *  Para ello, haríamos lo siguiente:
	 *  - En la clase del tipo de objeto, crearíamos la siguiente variable estática:
	 *  	private static int numPersonas;
	 *  - Después, en el constructor de Persona, la integraríamos como contador:
	 *  	public Persona(){
	 *  		Persona.numPersonas++; //usaremos este método en vez de utilizar el this, porque this
	 *  							// no se puede utilizar con variables estáticas.
	 *  		//Estamos sumando 1 a numPersonas cada vez que se instancia un nuevo objeto de tipo
	 *  		//persona
	 *  	}
	 *  	public static int setnumPersonas(){
	 *  		return Persona.numPersonas;//con la palabra reservada return devolvermos el valor de 
	 *  									//numPersonas.
	 *  	}
	 */
}
