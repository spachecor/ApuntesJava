package temados.ejercicios;

import java.util.Scanner;

public class Ejercicio2_3_Caracter {
	public static void main(String[] args) {
		/*c) (Caracter.java) Pide un número entero por consola (para probar debes introducir un valor
		 * entre 0 y 255) y muestra el carácter que le corresponde.*/
		
		int num1;
		char car;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un nº entre 0 y 255");
		num1 = sc.nextInt();
		System.out.println(String.format("Caracter: %c", num1));
		sc.close();
		
		
		/* - %c para char
		 * - %s para cadena de caracteres
		 * - %d para enteros
		 * - %f para coma flotante (%n,f para decir cuantos decimales mostrar ej: %.3f)
		 * */
	}

}
