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
		int num, aux;
		//abrimos flujo de entrada
		Scanner sc = new Scanner(System.in);
		//solicitamos longitud
		System.out.println("Introduce la longitud del array: ");
		//guardamos longitud en variable
		num = sc.nextInt();
		//creamos el array con la longitud que solicitamos
		int[] array = new int[num];
		//usamos un bucle for para generar los numeros aleatorios y asignarlos a cada posición del array
		for(int i=0;i<num; i++) {
			array[i]=(int)Math.round(Math.random()*101);
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
				}
			}
		}
		//usamos un bucle for para mostrar por consola los valores del array
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
		//cerramos el flujo de entrada
		sc.close();
	}
}































/* Desarrolla un programa Java en el que generes un array de enteros de un tamaño pedido por consola. El array contendrá valores aleatorios entre 1 y 100 inclusives generados automáticamente. Después ordena dicho array de manera ascendente y muéstralo por consola. 

A continuación se muestra un ejemplo gráfico del proceso de ordenación para un array de 6 elementos.
 * 
 * //variable para almacenar el tamaño del array a ordenar
 */

//variable para el array de enteros con números aleatorios

//variable para almacenar el valor de la posición del array que se va a modificar para que no se pierda

//pide el tamaño del array
//inicializa el array de enteros con números aleatorios entre 1 y 100 inclusives

//ordena el array
//el bucle externo fija el número de pasadas que se realizarán para ordenar el bucle

//el bucle interno fija los índices de los elementos del array que se van a comparar y ordenar si corresponde

//el número más a la derecha debe ser menor que el número

//más a la izquierda, si es mayor o igual no se hace nada

//se guarda el número más a la derecha para no perderlo

//se pone el número más a la izquierda (que es mayor) en la posición del número más a la derecha

//se recupera el valor del número más a la derecha

//y se pone en la posición más a la izquierda ya que era menor


//se muestra el array ordenado*/