package temados.repasoExamen;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio2_11 {

	public static void main(String[] args) {
		/* Obtener el número de días transcurridos desde tu fecha de nacimiento al 31 de Dic. de 2020
		 *  (inclusive)
		 *  
		 *  Pedir el año, el mes y el día de vuestra fecha de nacimiento y obtener un objeto de tipo 
		 *  fecha. Después mostrar la fecha en un formato como el del siguiente ejemplo: Jun 23 1984
		 *  
		 *  Obtener la hora UTC actual (Greenwich) y regionalizarla para que se corresponda con la hora 
		 *  de España.*/
		
		//Primer apartado
		LocalDate fechaDada = LocalDate.of(2022, 12, 31);
		LocalDate fechaCumple = LocalDate.of(1999, 03, 20);
		System.out.println("Han pasado un total de " + ChronoUnit.DAYS.between(fechaCumple, fechaDada)
		+ " días.");
		
		//Segundo apartado
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu fecha de nacimiento en le siguiente formato: dd/mm/yyyy");
		String nacimiento = sc.next();
		LocalDate fecha = LocalDate.of(Integer.valueOf(nacimiento.substring(6)), 
				Integer.valueOf(nacimiento.substring(3, 5)), Integer.valueOf(nacimiento.substring(0, 2)));
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("MMM dd yyyy");
		System.out.println(fecha.format(formateador));
		sc.close();
		
		//Tercer apartado
		ZonedDateTime green = ZonedDateTime.now(ZoneId.of("Greenwich"));
		ZonedDateTime espana = ZonedDateTime.of(green.toLocalDateTime(), ZoneId.of("Europe/Madrid"));
		
	}

}
