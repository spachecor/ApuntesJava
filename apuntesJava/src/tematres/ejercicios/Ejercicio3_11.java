package tematres.ejercicios;

import java.util.Scanner;

public class Ejercicio3_11 {

	public static void main(String[] args) {
		/*Averiguar si un número es perfecto*/
		
		int num, resultado=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número:");
		num = sc.nextInt();
		
		for(int i=1;i<num;++i) {
			if(num%i==0) {
				resultado += i;
			}
		}

		if(resultado==num) {
		System.out.println(resultado + " es un número perfecto");
		}else {
			System.out.println(num + " no es un número perfecto");
		}
		
		
		sc.close();
	}
	

}
