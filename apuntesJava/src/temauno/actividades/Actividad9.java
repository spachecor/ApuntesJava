package temauno.actividades;

import java.util.Scanner;

/**Ejercicio 1.9, en el que se pide que se desarrolle un código ya dado para obtener un programa
 * que solicite 2 números y nos diga cuál es el mayor y cuál es el menor. Ha sido mejorado 
 * añadiendo la opción de que también nos diga si es igual.
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Actividad9 {

	public static void main(String[] args) {

		int numero1, numero2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número entero: ");

		numero1 = sc.nextInt();

		System.out.println("Introduce un número entero: ");

		numero2 = sc.nextInt();
		
		System.out.println(numero1<numero2?numero2 + " es mayor que " + numero1:numero2 + " es menor o igual que " 
		+ numero1);
		
		sc.close();
	}

}