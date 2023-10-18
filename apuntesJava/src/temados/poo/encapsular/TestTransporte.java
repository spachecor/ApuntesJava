package temados.poo.encapsular;

public class TestTransporte {
	public static void main(String args[]) {
		//inicializamos una variable de tipo Trnasporte
		Transporte transporte = new Transporte();
		transporte.setMarca("Ford"); //nos saltamos la encapsulación utilizando el método setter.
	
		/*	Encapsular es la capacidad que permite mantener oculta la implementación de una
		 * abstracción para los usuarios de la misma. El objetivo de encapsular es la ocultación
		 * de la implementación, para que ninguna parte de un sistema complejo dependa de cómo se ha
		 * implementado otra parte. Los modificadores de acceso sirven para encapsular.
		 * La abstracción y la encapsulación son complementarias. Mientras la primera se centra en el
		 * comportamiento observable, la segunda lo hace en cómo se construe ese comportamiento.
		 * La encapsulación oculta los detalles de implementación de una abstracción.
		 * La encapsulación hace que no se pueda acceder a la lógica interna de un comportamiento (ej:
		 * motor, sabemos que está y qué hace, pero no lo podemos ver ni modificar.).
		 * 
		 */
		
		/*MODIFICADORES DE ACCESO:
		 * 
		 * -Public: Permite acceder al elemento desde cualquier clase, independientemente de que esta
		 * pertenezca o no al paquete donde se encuentra el elemento.
		 * -Protected: Indica que los elementos sólo pueden ser accedidos desde su mismo paquete (como
		 * ocurre con default) y desde cualquier clase que extienda la clase en que se encuentra,
		 * independientemente de si esta se encuentra en el mismo paquete o no.
		 * -Default: El elemento puede ser accedido sólo desde las clases que pertenezcan al mismo
		 * paquete (pero no desde cualquier clase que extienda la clase en que se encuentra, independiente-
		 * mente de si esta se encuenta en el mismo paquete o no).
		 * -Private: Es el modificador más restrictivo y especifica que lo elementos que lo utilizan sólo
		 * pueden ser accedidos desde la clase donde se encuentran.
		 * 
		 * Resumen:
		 * Public --> desde: La misma clase + Otra clase del mismo paquete + Subclase de otro paquete + 
		 * 						Otra clase de otro paquete.
		 * Protected --> desde: La misma clase + Otra clase del mismo paquete + Subclase de otro paquete.
		 * Default --> desde: La misma clase + Otra clase del mismo paquete.
		 * Private --> desde: La misma clase.
		 * 
		 */
		
	}

}
