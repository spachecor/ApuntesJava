package temauno.actividades;

import java.util.Scanner;

/**
 * Ejercicio de refuerzo y ampliación 9
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class RA9 {

	public static void main(String[] args) {
		//Programa que lea tres números enteros H, M, S que contienen hora, minutos y segundos
		//respectivamente, y comprueba si la hora que indican es una hora válida.
		
		int h, m, s;
		String comprobacion_h, comprobacion_m, comprobacion_s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca una hora (hh)");
		h = sc.nextInt();
		System.out.println("Por favor, introduzca unos minutos (mm)");
		m = sc.nextInt();
		System.out.println("Por favor, introduzca unos segundos (ss)");
		s = sc.nextInt();
		comprobacion_h = (h>=0 && h<24)?"correcta":"incorrecta";
		comprobacion_m = (m>=0 && h<60)?"correctos":"incorrectos";
		comprobacion_s = (s>=0 && s<60)?"correctos":"incorrectos";
		System.out.println("La hora es " + comprobacion_h + ", los minutos son " + comprobacion_m +
				", y los segundos son " + comprobacion_s + ".");
		
		sc.close();
	}

}
