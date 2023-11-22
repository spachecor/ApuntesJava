package temados.repasoExamen.simulacro;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Ejercicio7 {

	public static void main(String[] args) {
		/* 7. Resuelve lo que se pide a continuación (ce: e):

			-Muestra la hora actual incluyendo los milisegundos
			-¿Qué día de la semana será el último día del año?
			-Muestra tu edad exacta: años, meses, días
			-Muestra los días que has vivido hasta hoy (inclusive)*/
		
		//Apartado 1
		LocalTime ahora = LocalTime.now();
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("hh:mm:ss:");
		System.out.println(ahora.format(formateador)+""+ahora.toString().substring(9,13));
		
		//Apartado 2
		LocalDate hoy = LocalDate.now();
		DateTimeFormatter formateador2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(hoy.with(TemporalAdjusters.lastDayOfYear()).format(formateador2));
		
		//Apartado 3
		Period periodo = Period.between(LocalDate.of(1999, 03, 20), hoy);
		System.out.println(String.format("Ahora mismo tengo %d años, %d meses y %d días.", periodo.getYears()
				, periodo.getMonths(), periodo.getDays()));
		
		//Apartado 4
		System.out.println(String.format("He vivido un total de %d días",
				ChronoUnit.DAYS.between(LocalDate.of(1999, 03, 20), hoy)));
	}

}
