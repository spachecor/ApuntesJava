package temados.ejercicios;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Ejercicio para el uso de las clases LocalDate, LocalTime y LocalDateTime
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Ejercicio2_12_LD_LT_LDT {

	public static void main(String[] args) {
		/* Pide por consola el cumpleaños de un alumno y dile los días que han pasado desde su nacimiento.
		 * 
		 * Mostrar cuantos segundos quedan desde ahora hasta el fin del dia
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu fecha de cumple(yyyy-mm-dd): ");
		LocalDate nacimiento = LocalDate.parse(sc.nextLine());
		long nDias = ChronoUnit.DAYS.between(nacimiento, LocalDate.now());
		System.out.println("Llevas en el mundo un total de: " + nDias + " días.");
		
		LocalTime ahora = LocalTime.now();
		LocalTime finDia = LocalTime.of(23, 23, 59);
		long segFinDia = ChronoUnit.SECONDS.between(ahora, finDia);
		
		
	}

}
