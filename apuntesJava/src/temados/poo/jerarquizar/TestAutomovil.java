package temados.poo.jerarquizar;

public class TestAutomovil {

	public static void main(String args[]) {
		Rueda rueda1 = new Rueda();
		Rueda rueda2 = new Rueda();
		Rueda rueda3 = new Rueda();
		Rueda rueda4 = new Rueda();
		
		//automovil1 no tiene gps
		Automovil automovil1 = new Automovil(rueda1, rueda2, rueda3, 4);//relación de dependencia con rueda, lo necesita 
																		//para existir
		Gps gps = new Gps();//relación de asociación con gps, no lo necesita, es complementario
		
		
	}
	
	/* Jerarquizar es la capacidad que permite ordenar abstracciones. Su principal ventaja consiste en que la organización de
	 * las abstracciones de un sistema en una jerarquía permite detectar estructuras y comportamientos comunes y con ello
	 * simplificar el desarrollo. En el esquema de poo se definen 2 formas básicas de jerarquías:
	 * 	- Jerarquías entre clases e interfaces.
	 * 	- Jerarquías entre objetos.
	 * Las jerarquías se pueden clasificar en 2 tipos de relaciones: RELACIONES DE ASOCIACIÓN Y RELACIONES DE DEPENDENCIA.
	 * -RELACIONES DE ASOCIACIÓN: Se establecen relaciones estructurales entre objetos de forma que se establece una conexión
	 * entre ellos. Este tipo de relaciones permite construir mediante la asociación de otros objetos menores. Los lenguajes
	 * orientados a objetos facilitan estas relaciones permitiendo que cualquier clase pueda ser a su vez una propiedad dentro
	 * de otra clase. (Son aquellas que no se necesitan para existir, como el automóvil y el gps, donde el automóvil puede
	 * existir sin el gps, pero puede llevarlo y ser una propiedad de automóvil).
	 * - RELACIONES DE DEPENDENCIA: Dan lugar a relaciones del tipo "tal objeto usa tal otro objeto" por lo que también se 
	 * conocen como relaciones de uso. Estas relaciones se distinguen de las relaciones de asociación porque el ámbito y el
	 * tiempo de uso de un objeto desde otro está mucho más limitado. (Son aquellas las cuales dependen 100%. Es decir, por
	 * ejemplo, un automóvil no es un automóvil si no tiene ruedas o si no tiene motor, DEPENDEN de estos objetos, no sólo son 
	 * propiedades que pueden tener o no)
	 * 
	 * La gran diferencia entre relaciones de asociación y dependencia es que un objeto que tiene dependencia de otro objeto no
	 * puede existir sin ese objeto.
	 * 
	 */
}
