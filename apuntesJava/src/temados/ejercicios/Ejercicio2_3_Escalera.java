package temados.ejercicios;

public class Ejercicio2_3_Escalera {

	public static void main(String[] args) {
		
		/*Desarrolla lo que se pide a continuación en un programa Java diferente, usa la plantilla que
		 * hay en los recursos. Cada programa estará representado por una clase con un nombre único y
		 * válido.

	a) (Escalera.java) Muestra en consola una escalera con los números del 1 al 5. La escalera se
	construirá mostrando en consola los números precedidos por un número variable de caracteres. Por
	ejemplo:

		1


			2


				3


					4


						5
	*/
		
		String str = "12345";
		System.out.println(str.substring(0,1) + "\n\t" + str.substring(1,2) + "\n\t\t" +
		str.substring(2,3) + "\n\t\t\t" + str.substring(3,4) + "\n\t\t\t\t" + str.substring(4,5));
	}

}
