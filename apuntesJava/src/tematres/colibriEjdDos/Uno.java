package tematres.colibriEjdDos;

import java.util.Scanner;

/**
 * Programa que solicita un número y muestra su cuadrado. Repite esto hasta que el número introducido sea negativo.
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Uno {

	public static void main(String[] args) {
		//declaramos la variable que almacenará el numero pedido
		int num;
		//abrimos flujo de entrada
		Scanner sc = new Scanner(System.in);
		//solicitamos numero
		System.out.println("Introduzca un numero: ");
		//se hace la comprobación para que sea un numero
		if(sc.hasNextInt()) {
			//se almacena el numero 
			num=sc.nextInt();
			//mientras el numero sea 0 o mayor, se realizará el cuadrado y se volverá a pedir
			while(num>=0) {
				System.out.println((int)Math.pow(num, 2));
				System.out.println("Introduzca otro número");
				//en el caso de introducir algo que no sea un numero, nos sacará del bucle
				if(sc.hasNextInt())num=sc.nextInt();
				else {
					//avisa de que debe ser un numero y sale del bucle
					System.out.println("Debe ser un numero.");
					break;
				}
			}
		//si no introducimos un numero, nos lo dira			
		}else {
			System.out.println("Debe introducir un número");
		}
		System.out.println("Fin del programa");
		sc.close();
	}

}
