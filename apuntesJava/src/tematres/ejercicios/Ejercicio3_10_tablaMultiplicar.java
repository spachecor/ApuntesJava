package tematres.ejercicios;

import java.util.Scanner;

public class Ejercicio3_10_tablaMultiplicar {
	
	public static void main(String[] args) {
		/* Escribir un programa que pida un número entero y muestre su tabla de multiplicar.*/
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique el número del que desee la tabla de multiplicar: ");
		num = sc.nextInt();
		
		for (int i = 0; i<11; i++) {
			System.out.println(num + " x " + i + " = " + num*i);
		}
		
		sc.close();
	}
	
}
