package temauno.actividades;

import java.util.Scanner;

/**
 * Ejercicio de refuerzo y ampliación 8
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class RA8 {

	public static void main(String[] args) {
		
		//Programa que lea dos caracteres y compruebe si son dos letras minúsculas.
		char a, b;
		String comprobacion;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca un caracter: ");
		a = sc.next().charAt(0);
		System.out.println("Por favor, introduzca otro caracter: ");
		b = sc.next().charAt(0);
		comprobacion = ((a>='a' && a<='z') && (b>='a' && b<='z'))?"Son minúsculas":
			"Son mayúsculas u otro tipo de caracter";
		System.out.println(comprobacion);
		
		sc.close();
	}

}
