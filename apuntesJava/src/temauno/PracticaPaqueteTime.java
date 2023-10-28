package temauno;


/*Podemos usar import java.time.*;. Con esto, estamos importando todo lo que contenga java.time,
 * y, aunque parezca una ventaja, es peor, porque referenciamos más de lo que necesitamos y hacemos
 * que nuestro programa sea más pesado.*/

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.util.Scanner;

/**
 * Expplicación y ejemplos del paquete java.time
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class PracticaPaqueteTime {

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
		
/*-------------------------------------------------------------------------------------------------*/
		
		/*CONSTRUYENDO FECHAS Y HORAS CON JAVA.TIME:
		 * 
		 * Existen tres métodos importantes para el manejo de fechas:
		 *  - now(): crea instancias nuevas a partir de la fecha y hora actual.
		 *  - of(): contruye fechas y horas a partir de sus partes(lo que introduzcas).
		 *  - with(): modifica la fecha u hora actual en función del parámetro que se le pase, con
		 *  alguna contidad (año, día, hora...) o u otro tipo de ajustes.
		 *  
		 *  
		 * 
		 * 
		 * */
		
		/*Ejemplo con now()*/
		System.out.println("La fecha actual es: " + LocalDate.now());
		System.out.println("La hora actual es: " + LocalTime.now());
		System.out.println("La fecha y hora actuales son: " + LocalDateTime.now());
		System.out.println("El instante actual es: " + Instant.now());
		System.out.println("La fecha y hora actuales según zona horaria son: " + ZonedDateTime.now());

		/*Ejemplo con of()*/
		System.out.println("La fecha de mi cumpleaños es el " + LocalDate.of(1999, Month.MARCH, 20));
		//Cuidado al meter meses tenemos que hacerlo con Month.MES
		System.out.println("La hora exacta es " + LocalDateTime.of(2023, Month.SEPTEMBER, 26, 19, 40));
		
/*-------------------------------------------------------------------------------------------------*/

		/*PARTES DE UNA FECHA O UNA HORA:
		 * 
		 * Gracias al método getXXX() de estas clases es posible extraer cualquier parte de una fecha u hora.*/
		
		//Ejemplo
		 System.out.println("Actualmente, vamos por el segundo " + LocalTime.now().getSecond() 
				 + " del minuto " + LocalTime.now().getMinute() + " de la hora " + LocalTime.now().getHour()
				 + " del día " + LocalDate.now().getDayOfMonth() + " del mes " + LocalDate.now().getMonth()
				 + " del año " + LocalDate.now().getYear());
		 
/*-------------------------------------------------------------------------------------------------*/
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
		 
/*-------------------------------------------------------------------------------------------------*/

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
		 opcionMenu = sc.nextInt();
		 System.out.println(opcionMenu);
		 sc.close();
		 
		 
		 
		 

	}

}
