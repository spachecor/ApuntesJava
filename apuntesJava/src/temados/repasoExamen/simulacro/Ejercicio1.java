package temados.repasoExamen.simulacro;

import java.util.Scanner;
/**Ejercicio que pide una cadena y la devuelve en forma de espejo
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		/*1. Escribir un programa Java que solicite una cadena de caracteres y la devuelva invertida con
		 *  efecto espejo, esto es, se concatena a la palabra original su inversa, compartiendo la última
		 *   letra, que hará de espejo, por lo que la palabra obtenida se lee igual hacia adelante que hacia
		 *    atrás (ce: b,c,d,f,h).

		La palabra debe empezar con mayúsculas y terminar en mayúsculas, los demás caracteres deben estar en 
		minúsculas.
		
		Ejemplo: HolaloH*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una cadena de caracteres: ");
		//Metemos la cadena en un objeto instanciado de tipo StringBuffer para poderla manipular
		StringBuffer cadena = new StringBuffer(sc.nextLine());
		//Extraemos la primera parte de la cadena, utilizando una serie de métodos de instancia propios
		//de la clase string
		String primeraParte = cadena.substring(0,1).toUpperCase().concat(cadena.substring(1,cadena.length()-1).toLowerCase());
		//Damos la vuelta a la cadena con el método de instancia .reverse() de la clase StringBuffer
		cadena.reverse();
		//Hacemos exáctamente lo mismo con la segunda
		String segunda = cadena.substring(0, cadena.length()-1).toLowerCase()
				.concat(cadena.substring(cadena.length()-1, cadena.length()).toUpperCase());
		//Concatenamos ambas partes e imprimimos
		System.out.println(primeraParte.concat(segunda));
		sc.close();
	}

}
