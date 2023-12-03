package tematres.ejercicios;

import java.util.Scanner;

public class Ejercicio3_10_multiplo3 {

	public static void main(String[] args) {
		//Pedir 5 números e indicar si alguno es múltiplo de 3
		
		int[] numeros = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<5; i++) {
			System.out.println("Introduzca un número: ");
			numeros[i] = sc.nextInt();
		}
		for(int i=0; i<5; i++) {
			if(numeros[i]%3==0)System.out.println(numeros[i] + " es múltiplo de 3.");
		}
		
		sc.close();
	}

}
