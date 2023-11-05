package temados.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio para el uso de la clase StringBuilder
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Ejercicio2_12_STRINGBUILDER {

	public static void main(String[] args) {
		/* Se desea un programa que comience con una frase predefinida "Hola alumno cualquiera". Se 
		 * aumentará la longitud del String y después se le pedirá el nombre al alumno y se incluirá 
		 * justo detrás.
		 * Después, se eliminará la palabra "hola" y se añadirá detrás del nombre del alumno "¿qué tal?"
		 * Por último, se optimizará la capacidad potencial de la cadena y se mostrará la cadena final
		 * junto con la cadena invertida y su longitud final.
		 */
		
		StringBuilder alumno = new StringBuilder("Hola alumno cualquiera");
		String nombre;
		alumno.setLength(50);
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		nombre = sc.nextLine();
		alumno.replace(alumno.lastIndexOf(" "), alumno.length(), " " + nombre);
		alumno.delete(0, 4);
		alumno.insert(alumno.length(), "¿qué tal?");
		alumno.trimToSize();
		
		System.out.println(alumno + " " + alumno.reverse());
		sc.close();
		
	}

}
