package temados.simulacroT2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*2. El número 153 es un número de 'Armstrong':  
		 * 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ) (ce: b,c,d,f,h)
		 
		 Escribe un programa Java que pida un número entero (entre 100 y 199, no hay que comprobarlo)
		  y compruebe si el número introducido es un número de Armstrong.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un nº entre 100 y 199: ");
		int num = sc.nextInt();
		System.out.println(Math.pow(num/100, 3)+Math.pow((num/10)%10, 3)+Math.pow(num%10, 3)==num?
				"Es un nº de Armstrong":"No es un nº de Armstrong");		
		sc.close();
	}

}
