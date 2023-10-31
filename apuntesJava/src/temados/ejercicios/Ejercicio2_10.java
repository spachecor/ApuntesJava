package temados.ejercicios;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio2_10 {
	public static void main(String[] args) {
		
		/*Desarrolla un programa Java que muestre la hora actual en algún país de los 6 continentes:

		Europa
		África
		América
		Asia
		Oceanía
		Antártida
		
		Utiliza al menos dos modos distintos para obtener la hora regionalizada. Debes utilizar la
		instanciación de objetos y los métodos estáticos. Explica en las líneas de código dónde está presente
		el uso de objetos y dónde el uso de miembros estáticos.*/
		
		//PRIMERO: Hora actual en Europa --------------------------------------------------------------------
		
		//1º forma: Instanciando objeto de tipo Instant
		Instant instante = Instant.now();//Sacamos el instante de ahora mismo (miembro estatico)
		LocalTime ahoraEnEuropa = LocalTime.ofInstant(instante, ZoneId.of(ZoneId.SHORT_IDS.get("ECT")));
		//Obtenemos un objeto LocalTime a partir del instante obtenido anteriormente y de la zona horaria
		//definida dentro del ZoneId.of
		
		//2º forma: Usando miembro estático del tipo de objeto ZoneId, ZonedDateTime y DateTimeFormatter
		ZoneId europa = ZoneId.of("Europe/Paris");//Establecemos una zona horaria
		ZonedDateTime horaEuropa = ZonedDateTime.now(europa);//Sacamos la fecha y hora actuales pero ligadas
		//a una zona horaria, en este caso, la definida en la linea anterior
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("hh:mm:ss a");//Damos un formato para mostrar
		//solo la hora
		System.out.println("Hora en Europa: " + ahoraEnEuropa + " y " + horaEuropa.format(formato));
		//Dentro del println aplicamos el format para ver correctamente la hora en la zona horaria elegida
		
		//SEGUNDO: Hora actual en África --------------------------------------------------------------------
		
		//1º forma: Instanciando objeto de tipo Instant
		LocalTime ahoraEnAfrica = LocalTime.ofInstant(instante, ZoneId.of(ZoneId.SHORT_IDS.get("CAT")));
		
		//2º forma: Usando miembro estático del tipo de objeto ZoneId, ZonedDateTime y DateTimeFormatter
		ZoneId africa = ZoneId.of("Africa/Harare");
		ZonedDateTime horaAfrica = ZonedDateTime.now(africa);
		System.out.println("Hora en África: " + ahoraEnAfrica + " y " + horaAfrica.format(formato));
		
		//TERCERO: Hora actual en América -------------------------------------------------------------------
		
		//1º forma: Instanciando objeto de tipo Instant
		LocalTime ahoraEnAmerica = LocalTime.ofInstant(instante, ZoneId.of(ZoneId.SHORT_IDS.get("PST")));
		
		//2º forma: Usando miembro estático del tipo de objeto ZoneId, ZonedDateTime y DateTimeFormatter
		ZoneId america = ZoneId.of("America/Los_Angeles");
		ZonedDateTime horaAmerica = ZonedDateTime.now(america);
		System.out.println("Hora en América: " + ahoraEnAmerica + " y " + horaAmerica.format(formato));
		
		//CUARTO: Hora actual en Asia
		
		//1º forma: Instanciando objeto de tipo Instant
		LocalTime ahoraEnAsia = LocalTime.ofInstant(instante, ZoneId.of(ZoneId.SHORT_IDS.get("CTT")));
		
		//2º forma: Usano miembro estático del tipo de objeto ZoneId, ZonedDateTime y DateTimeFormatter
		ZoneId asia = ZoneId.of("Asia/Shanghai");
		ZonedDateTime horaAsia = ZonedDateTime.now(asia);
		System.out.println("Hora en Asia: " + ahoraEnAsia + " y " + horaAsia.format(formato));
		
		//QUINTO: Hora actual en Oceanía --------------------------------------------------------------------
		
		//1º forma: Instanciando un objeto tipo Instant
		LocalTime ahoraEnOceania = LocalTime.ofInstant(instante, ZoneId.of(ZoneId.SHORT_IDS.get("AET")));
		
		//2º forma: Usando miembro estanciable del tipo de objeto ZoneId, ZonedDateTime y DateTimeFormatter
		ZoneId oceania = ZoneId.of("Australia/Sydney");
		ZonedDateTime horaOceania = ZonedDateTime.now(oceania);
		System.out.println("Hora en Oceanía: " + ahoraEnOceania + " y " + horaOceania.format(formato));
		
		//SEXTO: Hora actual en la Antártida ----------------------------------------------------------------
		
		//1º forma: Instanciando un objeto de tipo Instant
		LocalTime ahoraEnAntartida = LocalTime.ofInstant(instante, ZoneId.of(ZoneId.SHORT_IDS.get("AGT")));
		
		//2º forma: Usando miembro estático del tipo objeto ZoneId, ZonedDateTime y DateTimeFormatter
		ZoneId antartida = ZoneId.of("America/Argentina/Buenos_Aires");
		ZonedDateTime horaAntartida = ZonedDateTime.now(antartida);		
		System.out.println("Hora en la Antártida(a la altura de argentina: " + ahoraEnAntartida + " y " +
		horaAntartida.format(formato));
	}

}
