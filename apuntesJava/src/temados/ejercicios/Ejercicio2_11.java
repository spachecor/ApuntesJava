package temados.ejercicios;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio2_11 {
	public static void main(String[] args) {
		
		/* 1- Obtener el número de días transcurridos desde tu fecha de nacimiento al 31 de Dic. de 2020 (inclusive)
		 * 
		 * 2- Pedir el año, el mes y el día de vuestra fecha de nacimiento y obtener un objeto de tipo fecha. Después
		 * mostrar la fecha en un formato como el del siguiente ejemplo: Jun 23 1984
		 * 
		 * 3- Obtener la hora UTC actual (Greenwich) y regionalizarla para que se corresponda con la hora de España.
*/
		
		//1º ejercicio
		
		LocalDate nacimiento, tope, otraFecha;
		long dias;
		
		nacimiento = LocalDate.of(1999, 03, 20);
		tope = LocalDate.of(2020, 12, 31);
		dias = ChronoUnit.DAYS.between(nacimiento, tope);//muestra 7957
		
		//2º ejercicio
		
		LocalDate cumple;
		String formato;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu fecha de nacimiento (yyyy-mm-dd)");
		cumple = LocalDate.parse(sc.nextLine());
		formato = "MMM dd yyyy";
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern(formato);
		System.out.println("Tu fecha de nacimiento es: " + cumple.format(formateador));
		sc.close();
		
		//3º ejercicio
		
		ZoneId green = ZoneId.of("UTC-0");//tomamos la zona horaria del meridiano de greenwich
		ZonedDateTime greenwich = ZonedDateTime.now(green);//generamos la hora de ahora regionalizada en greenwich
		ZoneId spa = ZoneId.of("UTC-2");//tomamos la zona horaria de españa (invierno)
		ZonedDateTime spain = ZonedDateTime.of(greenwich.toLocalDate(), greenwich.toLocalTime(), spa);//introducimos la fecha y hora de 
		//greenwich y la zona horaria de españa para obtener la fecha y hora que teníamos pero regionalizada en españa
		
		
	}

}
