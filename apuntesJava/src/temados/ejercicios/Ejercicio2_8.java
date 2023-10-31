package temados.ejercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio2_8 {
	public static void main(String[] args) {
		//Crea un programa Java en el que pidas una fecha en consola como la siguiente "12/10/2020 23:23:23",
		//después aplica formato para que se muestra de las 3 formas siguientes: 

			//Mon, Oct 12 2020 23:23:23
			//Mon, Oct 12 2020
			//10 12, 2020
		
		//Calcula y muestra el tiempo transcurrido en milisegundos desde que se introduce la fecha a
		//formatear y se muestran todos los formatos pedidos.
		
		long milisegundos1, milisegundos2, milisegundosFin ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una fecha en el siguiente formato: dd/MM/yyyy hh:mm:ss");
		String fecha = sc.nextLine();
		milisegundos1 = System.currentTimeMillis();//OJO, COLOCAR DESPUÉS DE ALMACENAR LA VARIABLE PARA QUE NO CUENTE DE MÁS
		
		//PRIMERO (Mon, Oct 12 2020 23:23:23)
		
		//Hagámoslo de forma personalizada: (Mon, Oct 12 2020 23:23:23)
		String formato1 = "EEE, MMM dd yyyy hh:mm:ss";//Se define el formato
		DateTimeFormatter primerFormato = DateTimeFormatter.ofPattern(formato1);//Se crea el formato con la definición anterior
		
		LocalDate fechaEj1 = LocalDate.of(Integer.parseInt(fecha.substring(6,10)), Integer.parseInt(fecha.substring(3, 5)),
				Integer.parseInt(fecha.substring(0,2)));//Sacamos la fecha en un LocalDate
		
		LocalTime horaEj1 = LocalTime.of(Integer.parseInt(fecha.substring(11, 13)), Integer.parseInt(fecha.substring(14, 16)),
				Integer.parseInt(fecha.substring(17, 19)));//Sacamos la hora en un LocalTime
		
		//Aplicamos el formato a la fecha y hora obtenidas anteriormente de las introducidas
		System.out.println(primerFormato.format(LocalDateTime.of(fechaEj1, horaEj1)));
		
		//SEGUNDO (Mon, Oct 12 2020)
		
		//Ahora lo hacemos tomando únicamente la fecha que nos introduce el usuario
		String formato2 = "EEE, MMM dd yyyy";///Definimos formato
		DateTimeFormatter segundoFormato = DateTimeFormatter.ofPattern(formato2);//Creamos formateador
		
		LocalDate fechaEj2 = LocalDate.of(Integer.parseInt(fecha.substring(6,10)), Integer.parseInt(fecha.substring(3,5)),
				Integer.parseInt(fecha.substring(0,2)));//Sacamos la fecha en un LocalDate
		
		//Aplicamos el formato a la fecha obtenida anteriormente de la introducida
		System.out.println(segundoFormato.format(fechaEj2));
		
		//TERCERO (10 12, 2020)
		
		String formato3 = "LL dd, yyyy";//Definimos formato
		DateTimeFormatter tercerFormato = DateTimeFormatter.ofPattern(formato3);//Creamos formateador
		
		LocalDate fechaEj3 = LocalDate.of(Integer.parseInt(fecha.substring(6,10)), Integer.parseInt(fecha.substring(3,5)),
				Integer.parseInt(fecha.substring(0,2)));//Sacamos la fecha en un LoalDate
		
		//Aplicamos el formato a la fecha obtenida anteriormente a la introducida
		System.out.println(tercerFormato.format(fechaEj3));
		
		//ÚLTIMO APARTADO: tiempo transcurrido en milisegundos desde que se introduce la fecha a formatear y se muestran todos los
		//formatos pedidos.
		
		milisegundos2 = System.currentTimeMillis();
		milisegundosFin = milisegundos2-milisegundos1;
		System.out.println("Toda la ejecución ha tardado un total de " + milisegundosFin + " milisegundos.");
		
		sc.close();//Cerramos el flujo de entrada 

	}

}
