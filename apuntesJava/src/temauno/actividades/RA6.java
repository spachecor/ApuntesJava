package temauno.actividades;

import java.util.Scanner;

/**
 * Ejercicio de refuerzo y ampliación 6
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class RA6 {

	public static void main(String[] args) {
		//Programa que lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud
		//de la hipotenusa según el teorema de Pitágoras. 
		
		int cat1, cat2, hipotenusa;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca el valor de uno de los catetos: ");
		cat1 = sc.nextInt();
		System.out.println("Por favor, introduzca el valor del otro cateto: ");
		cat2 = sc.nextInt();
		hipotenusa = (int) (Math.sqrt(Math.pow(cat1, 2)+Math.pow(cat2, 2)));
		System.out.println("La hipotenusa vale: " + hipotenusa);
		
		sc.close();
		
	}

}
