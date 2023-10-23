package temados.ejercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio2_4 {
	public static void main(String[] args) {
		/*Desarrolla un programa Java que solicite una frase con 4 palabras y que realice lo siguiente:

			1-. Debe calcular y mostrar el número de caracteres de cada palabra
			2-. Debe mostrar cada palabra empezando con mayúsculas las que no empiezan por mayúsculas y en minúsculas las
			que empiezan por mayúsculas.
			3-. Debe reemplazar la tercera palabra por la primera
			4-. Debe insertar entre la segunda y tercera palabra la fecha y hora actual.*/
		
		String frase, cad1, cad2, cad3, cad4;
		String[] palabras;
		boolean comp1, comp2, comp3, comp4;
		
		//Primer apartado
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca una frase con 4 palabras: ");
		frase = sc.nextLine();
		palabras = frase.split(" ");
		System.out.println(palabras[0].length() + " " + palabras[1].length() + " " + palabras[2].length()
				+ " " + palabras[3].length());
		
		//Segundo apartado
		comp1 = palabras[0].substring(0, 1).equals(palabras[0].substring(0, 1).toUpperCase());
		comp2 = palabras[1].substring(0, 1).equals(palabras[1].substring(0, 1).toUpperCase());
		comp3 = palabras[2].substring(0, 1).equals(palabras[2].substring(0, 1).toUpperCase());
		comp4 = palabras[3].substring(0, 1).equals(palabras[3].substring(0, 1).toUpperCase());
		
		cad1 = comp1==true?(palabras[0].substring(0, 1).toLowerCase().concat(palabras[0].substring(1, palabras[0].length())))
				:(palabras[0].substring(0, 1).toUpperCase().concat(palabras[0].substring(1, palabras[0].length())));
		cad2= comp2==true?(palabras[1].substring(0 ,1).toLowerCase().concat(palabras[1].substring(1, palabras[1].length())))
				:(palabras[1].substring(0, 1).toUpperCase().concat(palabras[1].substring(1, palabras[1].length())));
		cad3 = comp3 == true?palabras[2].substring(0, 1).toLowerCase().concat(palabras[2].substring(1, palabras[2].length()))
				:palabras[2].substring(0, 1).toUpperCase().concat(palabras[2].substring(1, palabras[2].length()));
		cad4 = comp4==true?palabras[3].substring(0, 1).toLowerCase().concat(palabras[3].substring(1, palabras[3].length()))
				:palabras[3].substring(0, 1).toUpperCase().concat(palabras[3].substring(1, palabras[3].length()));
		
		System.out.println(cad1 + " " + cad2 + " " + cad3 + " " + cad4);
		
		//Tercer apartado
		
		System.out.println(palabras[0] + " " + palabras[1] + " " +
		palabras[2].replaceAll(palabras[2], palabras[0]) + " " + palabras[3]);
		
		//Cuarto apartado
		
		System.out.println(frase.substring(0, frase.indexOf(palabras[2])) + LocalDate.now() + " " +
		palabras[2] + " " + palabras[3]);
		
		
		
		
		
		
		
		

	
	}

}
