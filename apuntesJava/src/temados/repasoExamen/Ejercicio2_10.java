package temados.repasoExamen;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio2_10 {

	public static void main(String[] args) {
		/* Desarrolla un programa Java que muestre la hora actual en algún país de los 6 continentes:

		Europa
		África
		América
		Asia
		Oceanía
		Antártida
		Utiliza al menos dos modos distintos para obtener la hora regionalizada. Debes utilizar la 
		instanciación de objetos y los métodos estáticos. Explica en las líneas de código dónde está 
		presente el uso de objetos y dónde el uso de miembros estáticos. */
	
		ZonedDateTime horaAmerica = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("hh:mm:ss");
		System.out.println("Hora en América " + horaAmerica.format(formateador));
		
		Instant instante = Instant.now();
		LocalTime horaAfrica = LocalTime.ofInstant(instante, ZoneId.of("Africa/Cairo"));
		System.out.println("Hora en África " + horaAfrica.format(formateador));
	}

}
