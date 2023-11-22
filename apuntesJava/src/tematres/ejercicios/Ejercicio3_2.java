package tematres.ejercicios;

import java.util.Scanner;

public class Ejercicio3_2 {

	public static void main(String[] args) {
		/* Escribe un programa que pida 2 números decimales, con 3 decimales, y compruebe si los 2 
		 * números introducidos tienen los mismos decimales. En dicho caso el programa debe mostrar 
		 * por consola ‘Decimales iguales’ y sino ‘Decimales distintos’.*/
		
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número decimal, con tres decimales");
		num1 = sc.nextInt();
		System.out.println("Introduce otro número decimal, con tres decimales");
		num2 = sc.nextInt();
		
		if(num1-Math.floor(num1)==num2-Math.floor(num2)) {
			System.out.println("Decimales iguales");
		}else {
			System.out.println("Decimales distintos");
		}
		
		sc.close();
	}

}
