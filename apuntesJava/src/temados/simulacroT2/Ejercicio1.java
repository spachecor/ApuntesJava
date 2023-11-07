package temados.simulacroT2;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[]args) {
	/*1. Escribir un programa Java que solicite una cadena de caracteres y la devuelva invertida con
	 *  efecto espejo, esto es, se concatena a la palabra original su inversa, compartiendo la última
	 *   letra, que hará de espejo, por lo que la palabra obtenida se lee igual hacia adelante que hacia
	 *    atrás (ce: b,c,d,f,h).

	La palabra debe empezar con mayúsculas y terminar en mayúsculas, los demás caracteres deben estar en 
	minúsculas.
	
	Ejemplo: HolaloH*/
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduzca una cadena de caracteres por favor: ");
	StringBuffer cadena = new StringBuffer(sc.nextLine().toLowerCase());
	cadena.replace(0, 1, cadena.substring(0, 1).toUpperCase());	
	System.out.println(cadena.toString().concat(cadena.reverse().substring(1, cadena.length())));
	
	sc.close();
	}

}
