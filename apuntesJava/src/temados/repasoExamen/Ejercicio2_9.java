package temados.repasoExamen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2_9 {

	public static void main(String[] args) {
		/* Desarrolla un programa Java en el que se pida una fecha por consola y se obtenga lo siguiente:

		Mes de la fecha
		Año de la fecha
		Último día del año de la fecha
		Número de días para finalizar el año desde la fecha
		Todo lo anterior lo debes mostrar por consola.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una fecha en el siguiente formato: dd/MM/yyyy ");
		String cadena = sc.next();
		//Almacenamos la fecha en un LocalDate
		LocalDate fecha = LocalDate.of
				(Integer.valueOf(cadena.substring(cadena.length()-4, cadena.length())), 
						Integer.valueOf(cadena.substring(3, 5)),
						Integer.valueOf(cadena.substring(0, 2)));
		//Imprimimos y usamos el método de instancia getMonth() más el método .getDisplayName para mostrar
		//en el idioma del sistema.
		System.out.println("El mes de la fecha introducida es el: " + 
						fecha.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault()));
		
		//Con .getYear() obtenemos el año de la fecha introducida
		System.out.println("El año de la fecha introducida es el: " + fecha.getYear());
		
		//Usamos la clase estática TemporalAdjusters para obtener el último día del año en cuestión y 
		//lo modificamos con un formateador
		DateTimeFormatter formateador = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println("El último día del año de la fecha es el: " +
		fecha.with(TemporalAdjusters.lastDayOfYear()).format(formateador));
		
		//Utilizamos ChronoUnit para averiguar los días entre la fecha y el fin de año del año de la fecha
		//Podríamos haber usado period, pero no es necesario
		System.out.println("Desde la fecha introducida hasta el fin de año del mismo año de la fecha hay"
				+ " un total de: " + 
				ChronoUnit.DAYS.between(fecha, fecha.with(TemporalAdjusters.lastDayOfYear())) + " días.");

		sc.close();
		

	}

}
