package tematres.ejercicios;

import java.util.Scanner;
/**
 * Programa que solicita la longitud de un array para generarlo con valores aleatorios y que los ordena y muestra los valores ya ordenados
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class EjTresVeintiCinco {
	public static void main(String[] args) {
		//declaramos la variable num que será la longitud del array y la variable auxiliar que nos ayudará con la permutación
		int num, aux, contador=0;
		//abrimos flujo de entrada
		Scanner sc = new Scanner(System.in);
		//solicitamos longitud
		System.out.println("Introduce la longitud del array: ");
		//guardamos longitud en variable
		num = sc.nextInt();
		//inicializamos una variable para calcular el tiempo que tarda el programa en ejecutarse
		long tiempo = System.currentTimeMillis();
		//creamos el array con la longitud que solicitamos
		int[] array = new int[num];
		//usamos un bucle for para generar los numeros aleatorios y asignarlos a cada posición del array
		for(int i=0;i<num; i++) {
			array[i]=(int)Math.round(Math.random()*101);
		}
		//imprimo el array original para poder hacer la comparativa con el array final
		System.out.print("Array Original: ");
		for(int k=0;k<array.length;k++) {
			System.out.print(array[k] + " ");
		}
		//usamos un bucle for para que haga las pasadas necesarias
		for(int i=array.length-1; i>1;i--) {
			//usamos otros bucle for anidado para realizar la permutación de los valores. j siempre será menor a los números ya permutados
			for(int j=0;j<i;j++) {
				//usamos la estructura if/else para que solo entre si el valor a la derecha es inferior
				if(array[j]>array[j+1]) {
					//guardamos el valor del array en la posicion por la que vaya nuestro bucle (que irá desde el 0 hasta la longitud del array)
					aux = array[j];
					//permutamos la posición de la derecha con el que tenemos
					array[j] = array[j+1];
					//Asignamos a la posición de la derecha el valor de la izquierda, guardado previamente en el variable aux 
					array[j+1]=aux;
					//sumamos 1 al contador de cambios realizados
					contador++;
				}
			}
		}
		//usamos un bucle for para mostrar por consola los valores del array
		System.out.print("\nArray final: ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
		//cerramos el flujo de entrada
		sc.close();
		//inicializamos la variable del tiempo total transcurrido
		long tiempoFinal = System.currentTimeMillis();
		//Hacemos la resta del final menos el inicial y tenemos el tiempo transcurrido
		long total =tiempoFinal-tiempo;
		//mostramos la relación del grado de desordenación y el tamaño del array dentro del algoritmo, teniendo en cuenta que a mayor tamaño del array, probablemente, tendremos más cambios
		System.out.println("\n\nTiempo total que tarda en ejecutarse: " + total + " milisegundos\nNº de cambios realizados: " + contador);

		/* 
		Longitud del array: 
		5
		Array Original: 5 52 80 58 81 
		Array final: 5 52 58 80 81 

		Tiempo total que tarda en ejecutarse: 5 milisegundos
		Nº de cambios realizados: 1
		
---------------------------------------------------------		
		
		Longitud del array: 
		5
		Array Original: 75 58 1 19 64 
		Array final: 1 19 58 64 75 

		Tiempo total que tarda en ejecutarse: 7 milisegundos
		Nº de cambios realizados: 6

---------------------------------------------------------

		Longitud del array: 
		10
		Array Original: 18 69 55 44 80 14 37 92 55 14 
		Array final: 14 14 18 37 44 55 55 69 80 92 

		Tiempo total que tarda en ejecutarse: 7 milisegundos
		Nº de cambios realizados: 23


---------------------------------------------------------

		Longitud del array: 
		10
		Array Original: 63 11 94 79 63 57 31 84 22 51 
		Array final: 11 22 31 51 57 63 63 79 84 94 

		Tiempo total que tarda en ejecutarse: 8 milisegundos
		Nº de cambios realizados: 27

		
---------------------------------------------------------

		Longitud del array: 
		20
		Array Original: 45 57 84 77 24 85 20 38 22 53 14 78 68 92 1 86 38 77 59 84 
		Array final: 1 14 20 22 24 38 38 45 53 57 59 68 77 77 78 84 84 85 86 92 

		Tiempo total que tarda en ejecutarse: 6 milisegundos
		Nº de cambios realizados: 84


---------------------------------------------------------

		Longitud del array: 
		20
		Array Original: 29 79 59 56 8 49 73 48 51 91 53 2 93 62 79 9 5 30 40 53 
		Array final: 2 5 8 9 29 30 40 48 49 51 53 53 56 59 62 73 79 79 91 93 

		Tiempo total que tarda en ejecutarse: 8 milisegundos
		Nº de cambios realizados: 102


---------------------------------------------------------

		Longitud del array: 
		50
		Array Original: 57 53 93 87 43 83 80 32 10 49 45 59 45 9 38 90 10 86 40 61 1 44 24 41 80 37 52 92 74 94 21 39 59 8 15 84 52 4 2 44 90 57 24 100 17 16 79 69 7 4 
		Array final: 1 2 4 4 7 8 9 10 10 15 16 17 21 24 24 32 37 38 39 40 41 43 44 44 45 45 49 52 52 53 57 57 59 59 61 69 74 79 80 80 83 84 86 87 90 90 92 93 94 100 

		Tiempo total que tarda en ejecutarse: 7 milisegundos
		Nº de cambios realizados: 698


---------------------------------------------------------

		Longitud del array: 
		50
		Array Original: 15 7 71 97 84 82 46 66 79 35 45 70 45 27 87 10 66 38 53 59 61 100 49 84 50 62 50 75 10 43 92 42 56 38 20 41 18 52 80 47 88 75 38 17 86 42 58 15 50 21 
		Array final: 7 10 10 15 15 17 18 20 21 27 35 38 38 38 41 42 42 43 45 45 46 47 49 50 50 50 52 53 56 58 59 61 62 66 66 70 71 75 75 79 80 82 84 84 86 87 88 92 97 100 

		Tiempo total que tarda en ejecutarse: 7 milisegundos
		Nº de cambios realizados: 677

		
---------------------------------------------------------

		Podemos concluir que en el tiempo de ejecución del programa influye tanto el tamaño del array en cuestión, a mayor tamaño mayor tiempo, y también el número de cambios realizados y la 
		posición de éstos. Conclusión final: a mayor grado de desordenación y mayor longitud del array, mayor es el tiempo que el programa tarda en ordenarlo.
		 * 
		 * 
		 * 
		 * 
		 * */

	}
}

