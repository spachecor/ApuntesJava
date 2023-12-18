package proyecto;

import java.util.Scanner;

/**
 * Entrada del programa. Se solicita al usuario quién es y qué desea hacer, y según lo que escoja se le 
 * redirige en una dirección u otra
 * @author selene
 * @version 1.0
 */
public class Main {

	public static void main(String[] args) {
		int rol, opcion;
		Scanner sc = new Scanner(System.in);
		System.out.println("Es usted: \n1- Administrador \n2- Usuario");
		rol = sc.nextInt();
		System.out.println("Desea usted acceder a: \n1- Zona animal \n2- Zona Tienda \n3- Zona donaciones"
				+ " \n4- Salir");
		opcion = sc.nextInt();
	}

}
