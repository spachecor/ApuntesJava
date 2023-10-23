package temados.ejercicios.ejercicio2_3;

import java.util.Scanner;

public class Caracter {

	public static void main(String[] args) {
		/*c) (Caracter.java) Pide un número entero por consola (para probar debes introducir un valor
		 * entre 0 y 255) y muestra el carácter que le corresponde.*/
		
		int num1;
		char car;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un nº entre 0 y 255");
		num1 = sc.nextInt();
		car = (char) num1;
		System.out.println(String.format("Caracter: %c", car));
		
		/* - %c para char
		 * - %s para cadena de caracteres
		 * - %d para enteros
		 * - %f para coma flotante (%n,f para decir cuantos decimales mostrar ej: %.3f)
		 * */
	}

}
