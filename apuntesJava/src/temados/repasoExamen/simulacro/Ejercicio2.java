package temados.repasoExamen.simulacro;

import java.util.Scanner;
/**
 * Ejercicio para hallar el número de Armstrong
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		/*2. El número 153 es un número de 'Armstrong':  
		 * 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ) (ce: b,c,d,f,h)
		 
		 Escribe un programa Java que pida un número entero (entre 100 y 199, no hay que comprobarlo)
		  y compruebe si el número introducido es un número de Armstrong.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entre 100 y 199: ");
		int num = sc.nextInt();
		//Utilizamos una serie de métodos estáticos de la clase Math, en concreto, Math.multiplyExact para
		//hacer la multiplicación de los valores. Posteriormente comprobamos usando el ternario e imprimimos
		//resultado
		System.out.println(Math.multiplyExact(Math.multiplyExact(num/100, num/100), num/100)+
				Math.multiplyExact(Math.multiplyExact((num/10)%10, (num/10)%10), (num/10)%10)+
				Math.multiplyExact(Math.multiplyExact(num%10, num%10), num%10)==num?
				"Es un número de Armstrong":"No es un número de Armstrong");
		sc.close();
	}

}
