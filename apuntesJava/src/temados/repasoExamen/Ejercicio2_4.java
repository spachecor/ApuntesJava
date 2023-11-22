package temados.repasoExamen;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio2_4 {

	public static void main(String[] args) {
		/*Desarrolla un programa Java que solicite una frase con 4 palabras y que realice lo siguiente:

			- Debe calcular y mostrar el número de caracteres de cada palabra
			- Debe mostrar cada palabra empezando con mayúsculas las que no empiezan por mayúsculas y 
			- en minúsculas las que empiezan por mayúsculas.
			- Debe reemplazar la tercera palabra por la primera
			- Debe insertar entre la segunda y tercera palabra la fecha y hora actual.*/
		Scanner sc = new Scanner(System.in);
		
		//Primer apartado
		System.out.println("Introduce una frase con 4 palabras(separadas entre sí con un espacio): ");
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		String palabra1 = st.nextToken();
		String palabra2 = st.nextToken();
		String palabra3 = st.nextToken();
		String palabra4 = st.nextToken();
		System.out.println(String.format("La primera palabra contiene %d caracteres, la segunda palabra"
				+ " contiene %d caracteres, la tercera palabra contiene %d caracteres y la cuarta palabra"
				+ " contiene %d caracteres.", palabra1.length(), palabra2.length(),
				palabra3.length(), palabra4.length()));
		
		//Segundo apartado
		String palabraConver1 = (palabra1.substring(0, 1).equals(palabra1.substring(0, 1).toLowerCase()))?
				palabra1.substring(0, 1).toUpperCase().concat(palabra1.substring(1, palabra1.length())):
				palabra1.substring(0, 1).toLowerCase().concat(palabra1.substring(1, palabra1.length()));
		String palabraConver2 = (palabra2.substring(0, 1).equals(palabra2.substring(0, 1).toLowerCase()))?
				palabra2.substring(0, 1).toUpperCase().concat(palabra2.substring(1, palabra2.length())):
				palabra2.substring(0, 1).toLowerCase().concat(palabra2.substring(1, palabra2.length()));
		String palabraConver3 = (palabra3.substring(0, 1).equals(palabra3.substring(0, 1).toLowerCase()))?
				palabra3.substring(0, 1).toUpperCase().concat(palabra3.substring(1, palabra3.length())):
				palabra3.substring(0, 1).toLowerCase().concat(palabra3.substring(1, palabra3.length()));
		String palabraConver4 = (palabra4.substring(0, 1).equals(palabra4.substring(0, 1).toLowerCase()))?
				palabra4.substring(0, 1).toUpperCase().concat(palabra4.substring(1, palabra4.length())):
				palabra4.substring(0, 1).toLowerCase().concat(palabra4.substring(1, palabra4.length()));
		System.out.println(String.format("%s %s %s %s", palabraConver1, palabraConver2, palabraConver3, 
				palabraConver4));
		
		//Tercer apartado
		System.out.println(String.format("%s %s %s %s", palabra3, palabra2, palabra1, palabra4));
		
		//Cuarto apartado
		System.out.println(palabra1 + " " + palabra2 + " " + LocalDateTime.now() + " " + palabra3 + " " + palabra4);
		sc.close();
	}

}
