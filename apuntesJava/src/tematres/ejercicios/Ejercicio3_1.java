package tematres.ejercicios;

import java.util.Scanner;

public class Ejercicio3_1 {

	public static void main(String[] args) {
		/*Escribe un programa que pida 3 números enteros y muestre qué número es el mayor*/
		
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		num1 = sc.nextInt();
		System.out.println("Introduce otro número: ");
		num2 = sc.nextInt();
		System.out.println("Introduce el último número: ");
		num3 = sc.nextInt();
		
		if(num1>=num2&&num1>=num3) {
			System.out.println(String.format("El número %d es el mayor.", num1));
		}else if(num2>=num1&&num2>=num3) {
			System.out.println(String.format("El número %d es el mayor.", num2));
		}else {
			System.out.println(String.format("El número %d es el mayor.", num3));
		}
			
		sc.close();
	}

}
