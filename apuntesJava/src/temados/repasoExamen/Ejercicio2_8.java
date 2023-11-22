package temados.repasoExamen;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio2_8 {

	public static void main(String[] args) {
		/* Crea un programa Java en el que pidas una fecha en consola como la siguiente 
		 * "12/10/2020 23:23:23", después aplica formato para que se muestra de las 3 formas siguientes: 

		Mon, Oct 12 2020 23:23:23
		Mon, Oct 12 2020
		10 12, 2020
		
		Calcula y muestra el tiempo transcurrido en milisegundos desde que se introduce la fecha a 
		formatear y se muestran todos los formatos pedidos.
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una fecha y hora en el siguiente formato: dd/MM/yyyy hh:mm:ss");
		String preFechaHora = sc.nextLine();
		//Tomamos referencia para calcular cuantos milisegundos tarda en ejecutar nuestro programa
		long tiempoTranscurrido = System.currentTimeMillis();		
		//Almacenamos la fecha y la hora separadas en un array
		String[] dividido = preFechaHora.split(" ");
		//Tomamos la fecha y la separamos por días, meses y años en otro array
		String[] fechaDividida = dividido[0].split("/");
		//Permutamos años por días y añadimos los nuevos separadores
		String fecha = fechaDividida[2]+"-"+fechaDividida[1]+"-"+fechaDividida[0];
		//Añadimos la fecha ya permutada con la hora junto al separados de ambas (la T)
		String fechaHora = fecha.concat("T").concat(dividido[1]);
		//pasamos la fecha y hora en formato cadena a un objeto de tipo LocalDateTime
		LocalDateTime fechaHoraDadas = LocalDateTime.parse(fechaHora);
		//Con el método estático del tipo de objeto DateTimeFormatter hacemos los 3 formateadores
		DateTimeFormatter formateador1 = DateTimeFormatter.ofPattern("EEE, MMM dd yyyy hh:mm:ss");
		DateTimeFormatter formateador2 = DateTimeFormatter.ofPattern("EEE, MMM dd yyyy");
		DateTimeFormatter formateador3 = DateTimeFormatter.ofPattern("MM dd, yyyy");
		//Aplicamos formateadores e imprimimos
		System.out.println(fechaHoraDadas.format(formateador1));
		System.out.println(fechaHoraDadas.format(formateador2));
		System.out.println(fechaHoraDadas.format(formateador3));
		//Mostramos el tiempo que ha tardado en ejecutarse nuestro programa en milisegundos restando
		//la referencia de los milisegundos de ahora con la anterior
		System.out.println("Tiempo transcurrido desde el inicio del programa hasta el final: " + 
		(System.currentTimeMillis()-tiempoTranscurrido) + " milisegundos.");
		
		sc.close();
	}

}
