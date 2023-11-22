package temados.repasoExamen.simulacro;

import java.time.ZoneId;
import java.time.ZonedDateTime;
/**
 * Ejercicio ne el que tomamos la fecha y hora actuales y las tenemos que regionalizar según nos piden
 * y mostrar
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		/* 		4. Desarrolla un programa Java que muestre la hora actual en los siguientes países (ce: e):

		Hongkong (zone id= Hongkong)
		Kiev (zone id= Europe/Kiev)
		Islas Canarias (zone id=Atlantic/Canary) */
		
		//Utilizamos el método estático .now() de la clase ZonedDateTime para tomar una nueva fecha y horas
		//con la zona horaria de cada sitio que le asignamos. Asignamos la zona horaria con el método
		//estático .of() de la clase ZoneId.
		ZonedDateTime hongkong = ZonedDateTime.now(ZoneId.of("Hongkong"));
		ZonedDateTime kiev = ZonedDateTime.now(ZoneId.of("Europe/Kiev"));
		ZonedDateTime canarias = ZonedDateTime.now(ZoneId.of("Atlantic/Canary"));
		//Utilizamos los métodos de instancia getXXX() para tomar las horas, minutos y segundos de nuestra
		//fecha y hora regionalizadas y utilizamos el método estático String.format() para mostrarlo a 
		//traves de un System.out.println.
		System.out.println(String.format("La hora actual en HongKong es: %d horas, %d minutos y %d "
				+ "segundos", hongkong.getHour(), hongkong.getMinute(), hongkong.getSecond()));
		System.out.println(String.format("La hora actual en Kiev es: %d horas, %d minutos y %d segundos", 
				kiev.getHour(), kiev.getMinute(), kiev.getSecond()));
		System.out.println(String.format("La hora actual en las Islas Canarias es: %d horas, "
				+ "%d minutos y %d segundos", canarias.getHour(), canarias.getMinute(),
				canarias.getSecond()));
	}

}
