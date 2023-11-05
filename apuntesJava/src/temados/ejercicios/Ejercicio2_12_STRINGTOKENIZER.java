package temados.ejercicios;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Ejercicio para el uso de la clase StringTokenizer
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Ejercicio2_12_STRINGTOKENIZER {
	public static void main(String[] args) {
		

	/* Se desea saber los alumnos que acuden a una excursión. Para ello, se pedirán los nombres por
	 * consola (en total 5 alumnos) y después se mostrarán de forma ordenada en consola.
	 * 
	 */
	String uno, dos, tres, cuatro, cinco, total;
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese el nombre el primer alumno: ");
	uno = sc.nextLine();
	System.out.println("Ingrese el nombre el segundo alumno: ");
	dos = sc.nextLine();
	System.out.println("Ingrese el nombre el tercer alumno: ");
	tres = sc.nextLine();
	System.out.println("Ingrese el nombre el cuarto alumno: ");
	cuatro = sc.nextLine();
	System.out.println("Ingrese el nombre el quinto alumno: ");
	cinco = sc.nextLine();
	total = uno + " " + dos + " " + tres + " " + cuatro + " " + cinco;
	StringTokenizer st = new StringTokenizer(total, " ");
	
	System.out.println("A la excursión van un total de " + st.countTokens() + " alumnos. Sus nombres son: "
			 + st.nextToken() + " , " + st.nextToken() + " , "  + st.nextToken() + " , "  
			+ st.nextToken() + " y "  + st.nextToken() + "." );
	sc.close();
	
	}
}
