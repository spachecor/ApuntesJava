package tematres.ejercicios;

import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/** 
 * Solución Ejercicio 3.22. Programa que genera dos números aleatorios entre 200 y 3000 (ambos inclusive) y comprueba si son números
 * amigos.
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Ejercicio3_22 {

	public static void main(String[] args) {
		
		//para controlar el tiempo que tarda, utilizamos un objeto tipo LocalTime al inicio y otro al final
		LocalTime inicio = LocalTime.now();
		//declaramos las variables num1 y num2 que serán asignadas posteriormente con valores aleatorios; también inicializamos las 
		//variables almacenado1 y almacenado2 a 0 para guardar el valor de la suma de los divisores.
		int num1, num2, auxiliar,almacenado1, almacenado2;
		//inicializamos las constantes máximo y mínimo que serán el máximo y el mínimo de los números aleatorios generados
		final int MAX=3000, MIN=200;
		//inicializamos la variable valido para poder luego marcar que ya tenemos dos numeros amigos
		boolean valido=false;
		
		//usamos un bucle do.while para que entre al menos una vez, y para que salga cuando valido==true
		do {
			//reseteamos el valor de ambos almacenados en cada ciclo
			almacenado1=0;
			almacenado2=0;
			//generamos ambos números aleatorios entre 200 y 3000 (ambos inclusive)
			num1 = (int)Math.round(Math.random()*(MAX-MIN+1)+MIN);
			num2 = (int)Math.round(Math.random()*(MAX-MIN+1)+MIN);
			//comprobamos que ambos sean diferentes entre si, si no lo son, vuelve a empezar
			if(num1==num2) continue;
			//asignamos el valor de auxiliar a el mismo número menos 1, para que no comienze en el mismo número, pues si empieza en el
			//mismo número lo guardará tambień en almacenado1
			auxiliar=num1-1;
			//usamos un bucle do-while para que vaya sacando cuales son los divisores de num1
			do {
				//usamos if para averiguar si el numero almacenado en auxiliar es divisor de almacenado1
				if(num1%auxiliar==0)almacenado1+=auxiliar;
				//decrecemos el valor de auxiliar para que en cada ciclo valga uno menos, hasta llegar a 0
				auxiliar--;
				//solo saldrá cuando auxiliar sea cero
			}while(auxiliar!=0);
			//repetimos el proceso con num2
			auxiliar=num2-1;
			do {
				if(num2%auxiliar==0)almacenado2+=auxiliar;
				auxiliar--;
			}while(auxiliar!=0);
			//comprobamos con if si los divisores del num1 son igual al num2 y viceversa. si es que sí, sale del bucle, si no, vuelve a empezar
			if(almacenado1==num2&&almacenado2==num1)valido=true;
			
		}while(valido==false);
		
		//imprimimos resultados
		System.out.println(num1 + " y " + num2 + " son numeros amigos.");
		
		//llamamos al objeto del final
		LocalTime finall = LocalTime.now();
		//imprimimos el tiempo que ha tardado en horas, minutos y segundos usando ChronoUnit
		System.out.println("Ha tardado un total de: " + ChronoUnit.HOURS.between(inicio, finall) + " horas, " + 
		ChronoUnit.MINUTES.between(inicio, finall) + " minutos y " + ChronoUnit.SECONDS.between(inicio, finall) + " segundos.");
	}

}
