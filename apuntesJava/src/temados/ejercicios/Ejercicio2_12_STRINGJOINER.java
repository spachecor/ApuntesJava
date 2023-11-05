package temados.ejercicios;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Ejercicio para el uso de la clase StringJoiner
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Ejercicio2_12_STRINGJOINER {

	public static void main(String[] args) {
		/* En el aula 12 quieren meter en una lista una serie de planetas. La profesora quiere que
		 * los alumnos introduzcan por consola 3 planetas y luego otros 2. Para esto, la consola
		 * pedirá los planetas y luego los mostrará todos por consola unidos en una misma lista.
		 * 
		 */
		
		String uno, dos, tres, cuatro, cinco;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca primer planeta: ");
		uno = sc.nextLine();
		System.out.println("Introduzca segundo planeta: ");
		dos = sc.nextLine();
		System.out.println("Introduzca tercer planeta: ");
		tres = sc.nextLine();
		StringJoiner sj1 = new StringJoiner(" , ");
		sj1.add(uno);
		sj1.add(dos);
		sj1.add(tres);
		System.out.println("Introduzca cuarto planeta: ");
		cuatro = sc.nextLine();
		System.out.println("Introduzca quinto planeta: ");
		cinco = sc.nextLine();
		StringJoiner sj2 = new StringJoiner(" , ");
		sj2.add(cuatro);
		sj2.add(cinco);
		System.out.println("Los planetas introducidos son: " + sj1.merge(sj2));
		
		sc.close();
	}

}
