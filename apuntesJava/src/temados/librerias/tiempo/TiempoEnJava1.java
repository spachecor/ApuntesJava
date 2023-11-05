package temados.librerias.tiempo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TiempoEnJava1 {

	public static void main(String[] args) {
		
		/*El paquete java.time incluye muchas clases, pero las básicas son:
		 * 
		 *-LocalDate: representa las fechas sin la hora y nos facilita su manejo para declararlas,
		 *sumar y restar fechas y compararlas. 
		 *
		 *-LocalTime: idéntica a la anterior pero para el manejo de horas, sin ninguna fecha asociada,
		 *pudiendo así compararlas, sumar o restar tiempo a las mismas...
		 *
		 *-LocalDateTime: combinación de las dos anteriores, que permite hacer lo mismo con fechas y
		 *horas simultáneamente.
		 *
		 *-Instant: se usa para almacenar un punto determinado en el tiempo
		 **/
		
		 //FROM, OF, PARSE Y WITH DADO EN CLASE
		 
		 //from se utiliza para hacer conversión entre diversos tipos. Ocurre pérdida de información.
		 LocalDateTime ahora = LocalDateTime.now();
		 LocalTime horaAhora = LocalTime.from(ahora);
		 System.out.println(horaAhora);
		 
		 //of se utiliza para 
		 LocalDate navidad = LocalDate.of(2015, 12, 25); //nos da un objeto del tipo LocalDate con .of()
		 System.out.println(navidad);
		 
		 //parse transforma la cadena de caracteres que se le pasa como parámetro del tipo correspondiente
		 LocalTime reloj = LocalTime.parse("22:45:03");
		 System.out.println(reloj);
		 
		 //with
		 LocalTime nuevaHora = reloj.withHour(9);
		 System.out.println(nuevaHora); //Modifica la hora, si son las 23, ahora son las 9.
		 
		 Scanner sc = new Scanner(System.in);
		 int opcionMenu = 3;
		 System.out.println("Introduzca una opción: 1-3");
		 opcionMenu = sc.nextInt();
		 System.out.println(opcionMenu);
		 sc.close();
		 
		 /*PARTES DE UNA FECHA O UNA HORA:
			 * 
			 * Gracias al método getXXX() de estas clases es posible extraer cualquier parte de una fecha u hora.*/
			
			//Ejemplo
			 System.out.println("Actualmente, vamos por el segundo " + LocalTime.now().getSecond() 
					 + " del minuto " + LocalTime.now().getMinute() + " de la hora " + LocalTime.now().getHour()
					 + " del día " + LocalDate.now().getDayOfMonth() + " del mes " + LocalDate.now().getMonth()
					 + " del año " + LocalDate.now().getYear());
			 
			 /*TRANSFORMANDO FECHAS Y HORAS
			  * 
			  * Según la clase que manejemos tendremos una serie de métidos para añadir o quitar intervalos
			  * al dato:
			  * */
			 
			 /*Para LocalDate: 
			  * - plusDays()/minusDays(): sumar o restar días a la fecha.
			  * - playWeeks()/minusWeeks(): ídem con semanas.
			  * - plusMonths()/minusMonths(): ídem con meses.
			  * - plusYears()/minusYears():ídem con años.*/
			 
			 /*Para LocalTime:
			  * - plusNanos()/minusNanos(): sumar o restar nanosegundos.
			  * - plusSeconds()/minusSeconds(): ídem con segundos.
			  * - plusMinutos()/minusMinutes(): ídem con minutos.
			  * - plusHours()/minusHours(): ídem con horas.*/
			 
			 //TRUCO: realmente siempre es plusXXXX() y minusXXXX().
			 
			 //Ejemplo:
			 System.out.println(LocalDate.now().plusDays(20));
			 
			 //CHRONOUNIT para extraer periodo y manipular fechas y horas
			 
			 //ChronoUnit.DAYS.between(obj temporal1, obj temporal2) - Devuelve un long
			 //Calcula la cantidad de tiempo entre dos objetos temporales. DAYS (o cualquier otra
			 //especificación es opcional, si no se introduce, nos dará el periodo completo).
			 long x =ChronoUnit.HOURS.between(LocalDateTime.of(LocalDate.of(1999, 03, 20),
					 LocalTime.of(10, 50)), LocalDateTime.now());
			 System.out.println(x);
/*-------------------------------------------------------------------------------------------------*/

			 
			 
		 
	}

}
