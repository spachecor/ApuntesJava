package tematres.ejercicios;

import java.util.Scanner;

/**
 * Programa que genera un numero aleatorio para que el usuario lo adivine en menos de tres intentos
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Ejercicio3_13 {

	public static void main(String[] args) {
		/* Desarrolla un programa para adivinar un número previamente asignado en código. Para ello se 
		 * tendrá que pedir un número N, y luego ir solicitando números indicando “mayor” o “menor” 
		 * según sea mayor o menor con respecto al número que hay que adivinar. El proceso termina 
		 * cuando el usuario acierta. El jugador podrá intentar acertar con tres intentos.*/
		
		Scanner sc = new Scanner(System.in);
		int aleatorio, num, contador=0;
		int max = 10;
		aleatorio = (int)Math.round(Math.random()*(max+1));
		
		do {
			System.out.println("Introduzca un número para adivinar el número secreto. Intento número "
					+ contador);
			num = sc.nextInt();
			if(aleatorio==num) {
				System.out.println("Felicidades! Número acertado!");
			}else {
				if(num>aleatorio) {
					System.out.println("Fallaste! el número es menor");
				}else {
					System.out.println("Fallaste! el número es mayor");
				}
			}
			contador++;
		}while(contador!=3);
		
		sc.close();
	}

}
