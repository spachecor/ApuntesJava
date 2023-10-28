package temauno.actividades;

import java.util.Scanner;

/**Ejercicio 1.10 en el que se pide un programa que lea un carácter por teclado y compruebe
 * si es una letra mayúscula.
 * 
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Actividad10 {

	public static void main(String[] args) {
		
		String comparable;
		
		//inicio Scanner para abrir el flujo de entrada
		Scanner sc = new Scanner(System.in);
		
		//imprimo en pantalla un mensaje para que el usuario introduzca una letra
		System.out.println("Por favor, introduzca una letra: ");
		
		//recojo la letra que el usuario introduce usando el scanner
		comparable = sc.next();
		
		//utilizo un operador ternario dentro de un System.out.print() para comparar y decidir
		//si es mayúscula o minúscula
		System.out.println(comparable.toUpperCase()==comparable?"La letra " + comparable + " es mayúscula.":"La letra "
		+ comparable + " es minúscula.");

		
		//OTRA FORMA
		char comparable2;
		//inicio Scanner para abrir el flujo de entrada
		Scanner sc2 = new Scanner(System.in);
		//imprimo en pantalla un mensaje para que el usuario introduzca una letra
		System.out.println("Por favor, introduzca una letra: ");
		//recojo la letra que el usuario introduce usando el scanner
		comparable2 = sc2.next().charAt(0);//Se lee una cadena de caracteres y se lee el caracter en 1º posición
		//utilizo un operador ternario dentro de un System.out.print() para comparar y decidir
		//si es mayúscula o minúscula
		System.out.println((comparable2 >=65 && comparable2 <=90) || (comparable2 >=97 && comparable2
				<=122)?(comparable2 >=65 && comparable2 <=90?"La letra es mayúscula":"La letra es minúscula"):
					"No es un carácter válido, por favor, introduzca una letra mayúscula o minúscula");/*Usamos conversión
		implícita, porque java prefiere INT y hace directamente la conversión. */
		
		//System.out.println(Character.isUpperCase(comparable)?"Mayúscula":"Minúscula"); Lo dejamos como ejemplo
		sc.close();
		sc2.close();
		
	}

}
