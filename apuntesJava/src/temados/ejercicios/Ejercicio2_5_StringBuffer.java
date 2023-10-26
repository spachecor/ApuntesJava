package temados.ejercicios;

/**
 * Ejercicio 2.4.2 sobre StringBuffer
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Ejercicio2_5_StringBuffer {
	public static void main(String[] args) {
		/*Modifica la plantilla Java que hay en los recursos de este tema para que realice lo siguiente:

			a) Crear un StringBuffer con la cadena "Hola Caracola" y mostrarla por consola.

			b) Mostrar por consola su capacidad y longitud.

			c) Partiendo de la cadena anterior y usando los métodos de StringBuffer modificar la cadena para
			que pase a ser "Hay Caracolas" y mostrarla por consola.

			d) Partiendo de la cadena anterior y usando los métodos de StringBuffer modificar la cadena para
			que pase a ser "Hay 5000 Caracolas" y mostrarla por consola. El número entero 5000 debe estar almacenado en un int inicialmente.

			e) Partiendo de la cadena anterior y usando los métodos de StringBuffer modificar la cadena para
			que pase a ser "Hay 5000 Caracolas en el mar" y mostrarla por consola.

			f) Almacenar en un String los últimos 4 caracteres del StringBuffer resultante y mostrar ese
			String por consola.

			g) Mostrar por  consola  la capacidad y longitud del StringBuffer final.*/
		
		//Apartado a)
		StringBuffer sbCaracola = new StringBuffer("Hola Caracola");
		System.out.println(sbCaracola);
		
		//Apartabo b)		
		System.out.println("Su capacidad potencial es: " + sbCaracola.capacity() + " y la longitud es de: "
				+ sbCaracola.length());
		
		//Apartado c)
		System.out.println(sbCaracola.replace(0, sbCaracola.length(), "Hay Caracolas"));
		
		//Apartado d)
		System.out.println(sbCaracola.insert(4, "5000 "));
		
		//Apartado e)
		System.out.println(sbCaracola.append(" en el mar"));
		
		//Apartado f)
		String sbSubstring = sbCaracola.substring(sbCaracola.length()-4, sbCaracola.length());
		System.out.println(sbSubstring);
		
		//Apartado g)
		System.out.println("La capacidad potencial final es de: " + sbCaracola.capacity() + " y la longitud "
				+ "es de: " + sbCaracola.length());
		
	}

}

