package temauno;

import java.util.Scanner;
/**
 * Práctica con la clase java.util.Scanner
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class PracticaScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu edad");
		int edad = sc.nextInt();
		System.out.println("Tu edad es de " + edad);
		
		System.out.println("Intruduce tu nombre");
		String nombre = sc.next();
		System.out.println("Tu nombre es " + nombre);
		
		int opcion = 3;
		System.out.println("Elige una opción: 1.Alta 2.baja 3.Salir");
		opcion = sc.nextInt();
		System.out.println(opcion);
		sc.close();
		
	}

}
