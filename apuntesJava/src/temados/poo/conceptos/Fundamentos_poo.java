package temados.poo.conceptos;

public class Fundamentos_poo {
	
	/*La poo se basa en el Modelo de Objetos. este modelo se fundamenta en el uso de 7 capacidades,
	 * 4 de las cuales se consideran fundamentales y 3 secundarias:
	 * 
	 * Las capacidades principales son:
	 * 
	 * -Abstraer (explicada en otro paquete)
	 * -Encapsular (explicada en otro paquete)
	 * -Modularizar (explicada en otro paquete)
	 * -Jerarquizar (explicada en otro paquete)
	 * 
	 * Las capacidades secundarias son:
	 * 
	 * -Tipo --> 
	 * 			· Es una caracterización precisa asociada a un conjunto de objetos. En poo, los objetos que comparten una misma
	 * 			interfaz se dice que tienen el mismo tipo. El tipado protege los errores que se pueden cometer al mezclar
	 * 			abstracciones.(ej: todos los coches son vehículos pero no todos los vehículos son coches)
	 * 			Los lenguajes pueden clasificarse en 2 grupos respecto a las restricciones que impone el tipo:
	 * 				-Lenguajes con TIPADO FUERTE, los que que no es posible mezclar variables de tipos diferentes (ej:java)
	 * 				-Lenguaje con tipado débil, en los que es mosible mezclar variables de diferentes tipos en un mismo tipo
	 * 				(ej: javascript, todo con var o let y const)
	 * 
	 * -Concurrencia -->
	 * 			· Es la capacidad que permite la ejecución simultánea de varias secuencias de instrucciones. Hay problemas que
	 * 			se resuelven más facilmente si se dispone de esta capacidad. Básicamente, es simultaneidad, algo que ocurre
	 * 			de manera común. (ej: como en un cruce de vehículos, donde todos quieren pasar a la vez).
	 * 
	 * -Persistencia -->
	 * 			· Es la capacidad que permite que la existencia de los datos transcurra en el tiempo y en el espacio (el tiempo
	 * 			que están los objetos en la memoria).
	 * 			Podemos clasificar los datos en relación a su vida en 6 tipos:
	 * 				-Expresiones: su vida no supera el ámbito de una línea de código.
	 * 				-Variables locales: su vida se circunscribe a la vida de la función.
	 * 				-Variables globales: existen mientras se ejecuta un programa.
	 * 				-Datos que persisten de una ejecución a otra(ej: guardado en un fichero, para que el programa lo pueda
	 * 				recuperar al abrirse de nuevo).
	 * 				-Datos que sobreviven a una versión de un programa(ej: cuando un programa se actualiza, pero se puede 
	 *				seguir utilizando lo previamente guardado).
	 *				-Datos que sobreviven cuando ya no existen los programas, los sistemas operativos e incluso los ordenadores
	 *				en los que fueron creados(ej: normalmente copias de seguridad).
	 *-----------------------------------LOS 3 PRIMEROS LOS MÁS IMPORTANTES-----------------------------------------------------
	 * 
	 * ---------------------------------------------------------------------------------------------
	 * 
	 * NOTA:
	 * 
	 * -Estado de objeto: está representado por los valores de sus propiedades en un momento
	 * determinado y pueden variar.
	 * 
	 * -Información del estado del objeto: las características del objeto en el tiempo. Va cambiando
	 * de estado. (ej: botella de agua, puede estar abierta, cerrada, tener más o menos líquido
	 * dentro, etc..)
	 * 
	 * - Propiedades, características y atributos: es lo mismo. El comportamiento puede cambiar el
	 * estado de los objetos. Los objetos se comunican entre sí con mensajes, y debido a esto, un
	 * objeto puede cambiar el estado de otro objeto. Los objetos también responden.
	 * 
	 * ---------------------------------------------------------------------------------------------
	 * 
	 * OBJETOS E INSTANCIAS
	 * 
	 * LAS VARIABLES GLOBALES SIEMPRE SON PROPIEDADES DE LA CLASE
	 * LAS VRIABLES LOCALES NO SON PROPIEDADES DE LA CLASE
	 * 
	 * INSTANCIA --> Respresentación en memoria de un objeto en un momento correcto
	 * 
	 * Al utilizar el operador new se crea una nueva instancia del tipo de objeto indicado y se asigna
	 * memoria a la variavle del tipo de objeto. En ese momento se llama a un método especial denomi-
	 * nado constructor.
	 * 
	 * CONSTRUCTOR --> Método especial para crear e inicialiar una nueva instancia de un tipo objeto.
	 * Pueden tener distinto número de parámetros (sobrecarga), lo que permite que le nuevo objeto a
	 * crear tenga un estado inicial determinado.
	 * 
	 * Los parámetros o argumentos son una forma de intercambiar información con el método. Pueden
	 * servir para introducir datos para ejecutar el método (entrada) o para obtener o modificar
	 * datos tras su ejecución (salida).
	 * 
	 * La gestión en memoria de Java es dinámica y automática, cuando se crea un nuevo objeto Java
	 * se le asigna la cantidad de memoria necesaria de forma automática. Por otro lado, tampoco es
	 * necesario liberar la memoria ocupada por los objetos, Java lo hace automáticamente con la 
	 * ayuda del Garbage Collection (recolector de basura). Java busca periódicamente objetos en 
	 * memoria que no están siendo utilizados y los elimina para liberar memoria.
	 * 
	 * Un tipo de objeto represneta el modelo para crear objetos, pero son los objetos con los que
	 * podemos trabajar.
	 * LOS OBJETOS OCUPAN MEMORIA Y TIENEN ESTADO.(La memoria que ocupa un objeto tiene una memoria 
	 * variable, es decir, que no solo ocupa en la memoria el peso de sus datos, sino que tambien
	 * pesa el comportamiento.
	 * 
	 * ¿Cómo crear un objeto?
	 * - Declarar una variable que pueda referenciar al objeto en cuestión.
	 * 		//Point point1;
	 * - Crear el objeto y asociarlo a la veriable. Se realiza con la sentencia new y lleva implíci-
	 * to llamar al método constructor para que inicialice el objeto.
	 * 		//point1 = new Point();
	 * 
	 * ¿Cómo se destruye un objeto?
	 * En java, no existe ninguna forma explícita para destruir un objeto, simplemente cuando un
	 * objeto queda huérfano (no tiene ninguna referencia) se destruye. Esta labor la realiza el
	 * Garbage Collector (recolector de basura) de forma automática.
	 * Una vez creados los OBJETOS es posible PASARLES MENSAJES, o INVOCAR MÉTODOS, para solicitar
	 * una acción. El objeto establece a qué método le corresponde el mensaje recibido.
	 * 
	 * ---------------------------------------------------------------------------------------------
	 * 
	 * 
	 * 
	 * Tipos de parámetros:
	 * 
	 * - Parámetros de entrada: Son aquellos que son introducidos en la función para realizar una 
	 * 							operación "X"
	 * - Parámetros de entrada-salida: XXX SERÁ VISTO TODO MÁS ADELANTE
	 * - Parámetros de salida: Son aquellos que son devueltos por parte de la función
	 * 
	 * 
	 * 
	 */
	
}
