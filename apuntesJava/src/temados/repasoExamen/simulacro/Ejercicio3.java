package temados.repasoExamen.simulacro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * Ejercicio en el que tomamos la fecha y hora actuales y la mostramos en el formato solicitado
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		/*3. Muestra la fecha y hora actual con el siguiente formato para la fecha dd_MM_yyyy, y para
		 * la hora: son las hh, mm minutos y ss segundos ((ce: b,c,d,f,h).*/
		
		//Obtenemos la fecha y hora actuales con un método estático de la clase LocalDateTime
		LocalDateTime ahora = LocalDateTime.now();
		//Generamos un formateador con el método estático DateTimeFormatter.ofPattern
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd_MM_yyyy,");
		//Aplicamos el formateador a la fecha y mostramos la hora con el método estático String.format
		System.out.println(ahora.format(formateador) + String.format(" son las %d, %d minutos y %d segundos",
				ahora.getHour(), ahora.getMinute(), ahora.getSecond()));
	}

}
