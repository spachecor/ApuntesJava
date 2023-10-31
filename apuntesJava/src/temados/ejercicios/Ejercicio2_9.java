package temados.ejercicios;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2_9 {
	public static void main(String[] args) {
		
		/*Desarrolla un programa Java en el que se pida una fecha por consola y se obtenga lo siguiente:

		Mes de la fecha
		Año de la fecha
		Último día del año de la fecha
		Número de días para finalizar el año desde la fecha
		
		Todo lo anterior lo debes mostrar por consola.*/
		
		String fecha;
		LocalDate localDate, fechaFinAnio;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una fecha en el siguiente formato: yyyy-mm-dd");
		fecha = sc.nextLine();
		localDate = LocalDate.parse(fecha);
		
		//PRIMERO: mes de la fecha
		System.out.println(localDate.getMonth().getDisplayName(TextStyle.FULL, new Locale("es", "ES")));
		
		//SEGUNDO: año de la fecha
		System.out.println(localDate.getYear());
		
		//TERCERO: último día del año de la fecha
		fechaFinAnio = localDate.with(TemporalAdjusters.lastDayOfYear());
		System.out.println(fechaFinAnio);
		
		//CUARTO: nº de días para finalizar el año desde la fecha
		System.out.println("Quedan " + (fechaFinAnio.getDayOfYear()-localDate.getDayOfYear()) +
				" días hasta el fin de año desde la fecha introducida");
		
		sc.close();
	}

}
