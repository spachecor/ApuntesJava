package temaseis;

import java.util.Scanner;

/**
 * Ejercicio de Arrays primero. Se crea un programa Java que guarde un array de diez números enteros que se leen por teclado
 * y se recorre el array y se calcula cuántos números son positivos, cuántos negativos y cuántos cero.
 * @author selene
 * @version 1.0
 */
public class EjercicioArraysUno {

	public static void main(String[] args) {		
		//inicializamos el array de enteros con capacidad para 10
		int array[] = new int[10];
		int positivo = 0, negativo = 0, cero = 0;
		//abrimos el flujo de entrada
		Scanner sc = new Scanner(System.in);
		//usamos un bucle for para recorrer el array y llenarlo de valores introducidos por consola
		for(int i = 0;i < array.length;i++) {
			System.out.println(String.format("Introduce el %dº número", i+1));
			//controlamos que solo ingresen números, en caso contrario, se recogerá una excepción que se controlará con su try/catch correspondiente
			try {
				array[i] = sc.nextInt();
			}catch (RuntimeException e) {
				//en caso de no introducir un nº, sale un mensaje
				System.out.println("Has introducido un carácter diferente a un número, vuelve a intentarlo.");
				//se le resta uno al contador porque cuando vuelva a iniciar el ciclo se sumará uno
				i--;
				//reseteamos el scanner
				sc.next();
				continue;
			}
			
			
		}
		//utilizamos un bucle for para recorrer el array y revisar si el nº es 0, positivo o negativo
		for(int i = 0;i < array.length;i++) {
			//dependiendo de como sea, se aumenta según que contador
			if(array[i]==0) {
				cero++;
			}else if(Math.abs(array[i])==array[i]) {
				positivo++;
			}else {
				negativo++;
			}
		}
		//imprimimos el resultado
		System.out.println(String.format("El resultado es:\nPositivos: %d\nNegativos: %d\nCeros: %d", positivo, negativo, cero));
		//cerramos el flujo de entrada
		sc.close();
	}

}
