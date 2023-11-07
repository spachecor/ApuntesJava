package temados.simulacroT2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		/*3. Muestra la fecha y hora actual con el siguiente formato para la fecha dd_MM_yyyy, y para
		 * la hora: son las hh, mm minutos y ss segundos ((ce: b,c,d,f,h).*/
		LocalDateTime ahora = LocalDateTime.now();
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd_MM_yyyy");
		System.out.println(ahora.format(formateador) + " y son las " + ahora.getHour() + ", "
				+ ahora.getMinute() + " minutos y " + ahora.getSecond() + " segundos");
	}

}
