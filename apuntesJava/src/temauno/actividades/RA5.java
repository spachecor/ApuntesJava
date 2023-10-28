package temauno.actividades;

/**
 * Ejercicio de refuerzo y ampliación 5
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class RA5 {

	public static void main(String[] args) {
		//Resolver una ecuación de 2º grado

		int a, b, c, cRaiz, resultado1, resultado2;
		String comprobacion;
		a = 1;
		b = 2;
		c = -3;
		
		cRaiz = ((int) Math.pow(b, 2))-(4*a*c);
		resultado1 = (int) (((-b) + Math.sqrt(cRaiz))/(2*a));
		resultado2 = (int) (((-b) - Math.sqrt(cRaiz))/(2*a));
		comprobacion = (cRaiz>=0)?"Los resultados son: " + resultado1 + " y " + resultado2:
			"No tiene solución";
		System.out.println(comprobacion);
	}

}
