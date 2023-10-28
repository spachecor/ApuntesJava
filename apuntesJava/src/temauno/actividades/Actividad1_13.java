package temauno.actividades;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

/**
 * Ejercicio 1.13.1, en el que tenemos:
 * 	- Un prgrama que nos dice el número de días para el fin del año.
 * 	- Un programa que nos dice el nombre del mes en el que estamos.
 * 	- Un programa que nos dice el nombre del día de la semana en el que estamos.
 * 	- Un programa que nos dicel el tiempo tanscurrido desde el 01/01/1970
 * 	- Un programa que comprueba si el año de la fecha es bisiesto.
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Actividad1_13 {

	public static void main(String[] args) {
		
		// - Número de días para el fin de año:
		
		int ahora, finDeAno;
		//Obtenemos el número de días que llevamos actualmente
		ahora = LocalDate.now().getDayOfYear();
		//Obtenemos el número de días totales a fin de año
		finDeAno = LocalDate.of(2023, 12, 31).getDayOfYear();
		//Imprimimos haciendo la resta
		System.out.println("Quedan " + (finDeAno-ahora) + " días para que finalice el año.");
		
		// - Nombre del mes:
		
		Month mes;
		String nombre;
		
		//Primero obtenemos el mes de la fecha actual
		mes = LocalDate.now().getMonth();
		
		/*Acto seguido, como tenemos que dar el nombre el mes en español, utilizamos un String y aplicamos el método 
		getDisplayName()(de la clase Month) para obtener el nombre y especificar que es en español con "new Locale
		("es", "ES").*/
		nombre = mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
		//Imprimimos
		System.out.println("Actualmente estamos en " + nombre);
		
		// -Nombre del día de la semana
		
		DayOfWeek semana;
		String nombreSemana;
		//Hacemos lo mismo que en el apartado anterior, pero con la semana
		semana = LocalDate.now().getDayOfWeek();
		nombreSemana = semana.getDisplayName(TextStyle.FULL, new Locale ("es", "ES"));
		
		System.out.println("Actualmente estamos a " + nombreSemana);
		
		// -Siglo al que pertenece
		
		String preSiglo, siglo;
		
		preSiglo = String.valueOf(LocalDate.now().getYear());
		siglo = preSiglo.substring(0,2);
		System.out.println("Actualmente estamos en el siglo " + ((Integer.parseInt(siglo))+1));
		
		// -Tiempo transcurrido desde el 1 de Enero de 1970, en días, meses y años
		
		LocalDate antiguo;
		antiguo = LocalDate.of(1970, 01, 01); //asignar fecha 1/1/1970
		System.out.println("Han pasado " + ChronoUnit.DAYS.between(antiguo, LocalDate.now()) + 
				" días desde el " + antiguo + "; " 
				+ ChronoUnit.MONTHS.between(antiguo, LocalDate.now()) +
				" meses desde el " + antiguo + "; y " +
				ChronoUnit.YEARS.between(antiguo, LocalDate.now()) + " años desde el " + antiguo);
			/*Imprimimos directamente, utilizando el paquete java.time.temporal.ChronoUnit para obtener los días, meses
			 * y años transcurridos entre la fecha actual y la fecha 1/1/1970*/
		
		// -Comprobar si el año de la fecha es bisiesto
		
		int fecha;		
		Scanner sc = new Scanner(System.in);//inicializamos flujo de entrada
		System.out.println("Analicemos si el año es bisiesto, por favor, introduce un año: (yyyy)");
		fecha = sc.nextInt();	//se pide y almacena el año con Scanner	
		System.out.println((fecha%4)==0?(((fecha%100)==0)?(((fecha%400)==0)?
				"Es bisiesto":"No es bisiesto"):"Es bisiesto"):"No es bisiesto");
			/*Se imprime anidando 3 operadores ternarios para hacer la comprobación en la cual:
			 * - se mútiplo de 4
			 * - no sea múltiplo de 100
			 * - si es múltiplo de 100, que también lo sea de 400
			 * Si todo se cumple, el número será bisiesto.*/ 	
		
		//EJEMPLO USANDO .isLeapYear()
		//LocalDate fechas = LocalDate.now();
		//System.out.println((fechas.isLeapYear())?"Es bisiesto":"No es bisiesto");
		
		sc.close();
		
		
		
		
		
		
		
	}

}
