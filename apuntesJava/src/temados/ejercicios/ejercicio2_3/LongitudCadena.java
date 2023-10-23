package temados.ejercicios.ejercicio2_3;

import java.util.Scanner;

public class LongitudCadena {

	public static void main(String[] args) {
		
		/*b) (LongitudCadena.java) Pide una cadena de texto por consola, después muestra la longitud de la
		cadena, quita (si los hay) todos los espacios en blanco antes y al final del texto. Vuelve a mostrar
		la longitud de la cadena. Muestra también el número de caracteres en blanco que has quitado. */

			int longitud;
			String cadena, cadena2;
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca una cadena(con un espacio antes y otro después)");
			cadena = sc.nextLine();
			longitud = cadena.length();
			System.out.println("La cadena introducida mide: " + longitud);
			cadena2 = cadena.trim();
			System.out.println("La cadena sin espacios delante y detrás mide " + cadena2.length());
			System.out.println("Se han eliminado un total de " +
			(cadena.length()-cadena.trim().length()) + " espacios.");
			
			
			
			
			
			
			
			
			
			sc.close();
	}

}
