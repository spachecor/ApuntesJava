package tematres.ejercicios;

import java.util.Scanner;
/**
 * Solucion propuesta para la actividad 3.17. El programa pide cifras del 0 al 9 y genera con las mismas un numero de 5 cifras que se
 * entiende que será el número de la loteria de navidad
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Ejercicio3_17 {

	public static void main(String[] args) {
		/* Realiza un programa que simule ser un sorteo de lotería. Debe pedir por pantalla 5 números entre el 0 y el 9
		 * (se debe validar esto) y cada uno pertenece a un fragmento de la cifra final (El primero será las decenas de millar,
		 * el segundo unidades de millar… y el último las unidades) y debe terminar construyendo el número de lotería premiado
		 * y mostrándolo por consola*/
		
		//una variable para contar numeros de las cifras correctos.
		int numCorrectos=0;
		//una variable para guardar la cifra introducida
		int cifra=0;
		//una variable donde guardar el numero de la loteria
		String numLoteria="";
		//se abre el flujo de entrada
		Scanner sc = new Scanner(System.in);
		//bucle while para solicitar los numeros
		while(numCorrectos<5) {
			//se piden los numeros
			System.out.println("Introduzca un numero entre 0 y 9");
			//se guarda el numero introducido por el usuario
			cifra = sc.nextInt();
			//se comprueba que el numero esté comprendido entre 0 y 9
			if(cifra>-1 && cifra<10) {
				//si se cumple, se concatena el numero obtenido a la izquierda
				numLoteria+=cifra;
				//se aumentan los numeros correctos. Si no lo hacemos, bucle infinito
				numCorrectos++;
			}
		}
		//se muestra el numero de la loteria
		System.out.println(numLoteria);
		
		//se cierra el flujo de entrada
		sc.close();
	}

}
