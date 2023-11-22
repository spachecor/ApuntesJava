package temados.repasoExamen;

public class Ejercicio2_5 {

	public static void main(String[] args) {
		/* a) Crear un StringBuffer con la cadena "Hola Caracola" y mostrarla por consola.

		 * b) Mostrar por consola su capacidad y longitud.

		 * c) Partiendo de la cadena anterior y usando los métodos de StringBuffer modificar la cadena 
		 * para que pase a ser "Hay Caracolas" y mostrarla por consola.

		 * d) Partiendo de la cadena anterior y usando los métodos de StringBuffer modificar la cadena 
		 * para que pase a ser "Hay 5000 Caracolas" y mostrarla por consola. El número entero 5000 debe 
		 * estar almacenado en un int inicialmente.

		 * e) Partiendo de la cadena anterior y usando los métodos de StringBuffer modificar la cadena 
		 * para que pase a ser "Hay 5000 Caracolas en el mar" y mostrarla por consola.

		 * f) Almacenar en un String los últimos 4 caracteres del StringBuffer resultante y mostrar ese 
		 * String por consola.

		 * g) Mostrar por  consola  la capacidad y longitud del StringBuffer final.*/
		
		//Apartado a
		StringBuffer sb = new StringBuffer("Hola Caracola");
		System.out.println(sb);
		
		//Apartado b
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		//Apartado c
		System.out.println(sb.replace(0, sb.indexOf(" "), "Hay").insert(sb.length(), "s"));
		
		//Apartado d
		int num = 5000;
		System.out.println(sb.insert(sb.indexOf(" "), " " + String.valueOf(num)));
		
		//Apartado e
		System.out.println(sb.insert(sb.length(), " en el mar"));
		
		//Apartado f
		String almacen = sb.substring(sb.length()-4);
		System.out.println(almacen);
		
		//Apartado g
		System.out.println(String.format("La capacidad final del StringBuffer es %d y la longitud final"
				+ " es %d.", sb.capacity(), sb.length()));
		
	}

}
