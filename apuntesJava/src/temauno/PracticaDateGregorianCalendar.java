package temauno;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PracticaDateGregorianCalendar {

	public static void main(String[] args) {
		
		/*Usando la clase Date:
		 * 
		 * Primero importamos java.util.Date, después debemos crear una instancia de un objeto Date
		 *invocando su constructor. Por último, mostramos la fecha y hora del sistema por consola
		 *usando un System.out.print(), donde introduciremos el objeto que hemos instanciado
		 *previamente.*/
		Date fecha = new Date ();
		System.out.println(fecha);
		
		/*Tenemos diversas funciones que podemos utilizar de la clase Date, como esta, que nos dice
		 *el año en el que estamos (hay que sumarle 1900). De todas formas, la clase Date cada vez se
		 *utiliza menos y este tipo de funciones ya están en deshuso.*/
		int anio = fecha.getYear();
		System.out.println(anio + 1900);

		/*Usando la clase GregorianCalendar:
		 * 
		 *Primero importamos las clases Calendar y GregorianCalendar, después creamos la instancia de 
		 *un objeto GregorianCalendar. Luego creamos una variable int llamada mes donde ejecutamos
		 *"calendario.set(Calendar.MONTH)". Con esto conseguimos el mes en el que nos encontramos 
		 *actualmente. Finalmente lo mostramos en pantalla.*/
		GregorianCalendar calendario = new GregorianCalendar();
		int mes = calendario.get(Calendar.MONTH);
		System.out.println(mes);

	}

}