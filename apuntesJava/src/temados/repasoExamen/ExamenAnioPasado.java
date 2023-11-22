package temados.repasoExamen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Scanner;

public class ExamenAnioPasado {

	public static void main(String[] args) {
		//Desarrolla un programa Java en el que obtenga lo siguiente (5 puntos, ce: b,c,d,h):
		//Solicita una fecha por consola y muestra lo siguiente:
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una fecha con el siguiente formato: dd/MM/yyyy");
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha = LocalDate.parse(sc.next(), formateador);	
			
		//Nombre del mes de la fecha
		System.out.println(String.format("El mes de la fecha introducida es %s", 
				fecha.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault())));
		
		//Nombre del día, dos semanas y un día, después de la fecha 
		LocalDate fecha2 = fecha.plusWeeks(2).plusDays(1);
		System.out.println(String.format("El nombre del día es %s, y el número dentro del año %d.", 
				fecha2.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()), fecha2.getDayOfYear()));
		
		//Nombre del último día del año de la fecha
		DateTimeFormatter formateador2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println("El último día del año de la fecha es: " + 
		fecha.with(TemporalAdjusters.lastDayOfYear()).format(formateador2));
		
		//Número de días para finalizar el año desde la fecha
		System.out.println(String.format("Número de días para finalizar el año desde la fecha "
				+ "introducida: %d días.", 
				ChronoUnit.DAYS.between(fecha, fecha.with(TemporalAdjusters.lastDayOfYear()))));
		
		//Debes obtener y mostrar las siguientes características:
		//Símbolo separador de ficheros y carpetas en el sistema (Por ejemplo, en Windows es \)
		System.out.println(System.getProperty("file.separator"));
		
		//Directorio de instalación de Java
		System.out.println(System.getProperty("java.home"));
		
		//Versión de la máquina virtual
		System.out.println(System.getProperty("java.vm.version"));
		
		//Rutas donde se almacenan los ficheros .class en el sistema
		System.out.println(System.getProperty("java.class.path"));
		
		sc.close();
	}

}
