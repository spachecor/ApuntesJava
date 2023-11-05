package temados.librerias.tiempo;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TimepoEnJava2 {

	public static void main(String[] args) {

		 //APLICAR FORMATO PERSONALIZADO CON DATATIMEFORMATTER
		 
		 /*Crearemos un formato personalizado para una fecha introducida por consola en los siguiente
		  * tres formatos: 
		  * 
		  * Mon, Oct 12 2020 23:23:23
		  * Mon, Oct 12 2020
		  * 10 12, 2020*/
		 
		 String fechaHora, formato1, formato2, formato3;
		 LocalDateTime fechaHoraCompleta;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Introduzca una fecha y una hora en el siguiente"
		 		+ " formato(2007-03-20T10:50:51): ");
		 fechaHora = sc.nextLine();
		 fechaHoraCompleta = LocalDateTime.parse(fechaHora);//Ya tenemos nuestra fecha y hora en 
		 //un formato adecuado.
		 //HACEMOS EL 1º FORMATEADOR
		 formato1 = "EEE, MMM dd yyyy hh:mm:ss";//Definimos el formato. (EEE día en la semana, ej, lunes)
		 DateTimeFormatter formateador1 = DateTimeFormatter.ofPattern(formato1);//Aplicamos el formato en 
		 //un objeto DateTimeFormatter con un .ofPattern(formato)
		 System.out.println(fechaHoraCompleta.format(formateador1));//aplicamos al objeto fecha y hora el 
		 //nuevo formateador configurado.
		 //SIGUIENTE FORMATEADOR
		 formato2 = "EEE, MMM dd yyyy";
		 DateTimeFormatter formateador2 = DateTimeFormatter.ofPattern(formato2);
		 System.out.println(fechaHoraCompleta.format(formateador2));
		 //ÚLTIMO FORMATEADOR
		 formato3 = "LL dd, yyyy";
		 DateTimeFormatter formateador3 = DateTimeFormatter.ofPattern(formato3);
		 System.out.println(fechaHoraCompleta.format(formateador3));
		 
/*-------------------------------------------------------------------------------------------------*/
		 
		 //APLICACIÓN DEL PAQUETE TEMPORALADJUSTERS - ESTÁTICO
		 
		 //Permite modificar objetos temporales
		 
		 LocalDate ahora = LocalDate.now();
		 LocalDate ahora1 = ahora.with(TemporalAdjusters.firstDayOfMonth());
		 //Igual todas sus variedades
		 LocalDate ahora2 = ahora.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		 //Igual al anterior con nextOrSame, previous y prviousOrSame
		 
/*-------------------------------------------------------------------------------------------------*/
		 //OBTENER LA HORA REGIONALIZADA CON INSTANT + ZONEID + LOCALTIME
		 
		 Instant instante = Instant.now();//Obtenemos el instante de ahora mismo
		 LocalTime horaEuropea = LocalTime.ofInstant(instante, ZoneId.of(ZoneId.SHORT_IDS.get("ECT")));
		 
		 
		 //OBTENER LA HORA REGIONALIZADA CON ZONEDDATETIME
		 
		 ZonedDateTime horaAfrica = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		 //Opcional darle formato con DateTimeFormatter, viene con fech y hora
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 System.out.println(horaAfrica);
		 
		 
		 
	}

}
