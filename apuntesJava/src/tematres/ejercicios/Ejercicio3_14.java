package tematres.ejercicios;

import java.util.Scanner;

public class Ejercicio3_14 {

	public static void main(String[] args) {
		/*Desarrolla un programa Java que calcule el máximo común divisor de dos números enteros 
		 * solicitados por consola.*/

		int num1, num2, auxiliar;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primero número: ");
		num1 = sc.nextInt();
		System.out.println("Introduzca el segundo número: ");
		num2 = sc.nextInt();
		
		while(num2!=0) {//Se comprueba si num2 es 0, pues si es 0 significa que num1 
			auxiliar = num2;//guardamos el valor del segundo num en la variable auxiliar
			num2 = num1%auxiliar;//hacemos num1%num2 pero usando el auxiliar y guardamos el resultado del
			//módulo en la propia variable num2
			num1 = auxiliar;//asignamos a num1 el valor del auxiliar, que en caso de que la operación anterior
			//de 0, num1 será el valor del MCD
		}

		System.out.println("El MCD entre ambos números es el: " + num1);
		
		/* EXPLICACIÓN:
		 * 
		 * Primero tomamos ambos números por consola, y después: 
		 * 	1- Se asigna el valor de num2 a el auxiliar
		 * 	2- Se hace el módulo entre num1 y num2 usando el auxiliar en vez de num2, y guardando el resultado
		 * 		en num2.
		 * 	3- Se asigna a num1 eol valor de num2(que es el valor de num2)
		 * 	4- Se comprueba si num2=0, pues cuando num2=0, el MCD será num1.
		 * 	5- Si num2!=0, entramos de nuevo en el bucle, si asignamos al auxiliar el valor actual de num2.
		 * 
		 * */
	
		sc.close();
	}

}
