package temauno;

import java.util.Scanner;

public class HolaMundo {
	//Variables de clase o globales
	int edad; //Las variables no pueden estar duplicadas, pero nace y muere en esta zona
	
	public static void main(String[] args) {
		
		
		//Variables locales
		/*int edad, altura; //En este punto, nace y muere en el main
		System.out.println("Hola mundo!");*/
		
		/*int altura, radio;
		final double pi = 3.1415927;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca la altura del cilindro.");
		altura = sc.nextInt();
		System.out.println("Por favor, introduzca el radio del cilindro.");
		radio = sc.nextInt();
		System.out.println("El volumen del cilindro es: " + (pi*radio*radio*altura));*/
		
		String cadena="Hola";
		String nombreTipo = cadena.getClass().getName();
		System.out.println(nombreTipo);
		System.out.println(cadena instanceof String);
		System.out.println(System.getProperty("user.dir")+"/apuntesJava/src/img/JavaFX_Logo.png");
		
		
		
		
	}
}
