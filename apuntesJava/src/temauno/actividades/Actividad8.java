package temauno.actividades;

import java.util.Scanner;

/**Ejercicio 1.8, en el que se nos piden tres programas, uno que lea dos números por teclado y 
 * los muestre por pantalla, otro que lea un nombre y lo muestre en pantalla y otro que lea un 
 * número entero por teclado y obtenga y muestre por pantalla el doble y el triple de ese número.
 * 
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Actividad8 {

	public static void main(String[] args) {
		
		//1. Programa Java que lea dos números enteros por teclado y los muestre por pantalla.

		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca dos números enteros: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("Los números introducidos son: " + num1 + " y " + num2);
		
		//2. Programa Java que lea un nombre y muestre por pantalla
		
		String nombre;
		System.out.println("Introduzca un nombre por favor: ");
		nombre = sc.next();
		System.out.println("El nombre introducido es: " + nombre + ".");
		
		//3. Escribe un programa Java que lee un número entero por teclado y obtiene y muestra
		//por pantalla el doble y el triple de ese número.
		
		int dobleTriple;
		System.out.println("Introduzca un número entero para ofrecerle el doble y el triple del mismo");
		dobleTriple = sc.nextInt();
		System.out.println("El doble de " + dobleTriple + " es: " + (dobleTriple*2) + ", y su triple es: " + (dobleTriple*3));
		
		sc.close();

	}

}
