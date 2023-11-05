package temados.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio para el uso de la clase String
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Ejercicio2_12_STRING {

	public static void main(String[] args) {
		
		/* Se quiere saber cuál es el identificador de cada alumno de un centro, sabiendo que éste está
		 * compuesto por la primera letra del nombre, las tres primeras del primer apellido y las tres
		 * primeras del segundo más la longitud de su nombre (sin espacios).
		 * 
		 */
		
		String nombreCompleto, codigo;
		String [] nombreSeparado;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca el nombre y apellidos del alumno: ");
		nombreCompleto = sc.nextLine();//Almacenamos el nombre en una variable
		nombreSeparado = nombreCompleto.split(" ");//separamos nombre y apellidos para trabajar con ellos
		codigo = (nombreSeparado[0].substring(0, 1).toLowerCase())
				.concat(nombreSeparado[1].substring(0,3).toLowerCase())
				.concat(nombreSeparado[2].substring(0,3).toLowerCase()) 
				+ String.valueOf(nombreSeparado[0].length()+nombreSeparado[1].length()+nombreSeparado[2].length());
		System.out.println(String.format("El código del alumno es: %s", codigo));
		
		
		
		
		
		
		sc.close();
	}

}
