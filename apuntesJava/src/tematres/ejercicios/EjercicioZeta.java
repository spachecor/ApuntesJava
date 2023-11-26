package tematres.ejercicios;

import java.util.Scanner;

public class EjercicioZeta {

	public static void main(String[] args) {
		//Dibuja una zeta con asteriscos (ancho y largo proporcionado por el usuario)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el ancho-largo de la z y z invertida(al ser cuadrada, con el mismo número tenemos tanto ancho como largo).");
		int medida= sc.nextInt();
		
		//Z NORMAL
		//Generamos dos auxiliares que definirán la posición a colorear en referencia a la fila y columna donde nos encontremos
		int auxFila = 1;
		int auxColum = medida-2;
		
		//Usamos un bucle for para seleccionar la fila donde vamos a buscar la columna a pintar; anidamos un otro bucle for dentro del primero, que será
		//el que seleccione en que columna estamos. Filas =i, Columnas=j	
		for (int i = 0; i<medida; i++) {
			for(int j = 0; j<medida; j++) {
				//le decimos que pinte siempre toda la fila de arriba y abajo
				if(i==0||i==medida-1) {
					System.out.print("* ");
				}else {
					//Si no está ni arriba ni abajo, usamos los auxiliares para determinar donde vamos a pintar. En este caso, si auxiliares coinciden con
					//columnas y filas, se pinta, si no, no. 
					//Podemos observar que para la z el valor de la fila aumenta y el de la columna disminuye, y que no se pinta nunca ni en la primera 
					//columna ni en la última, por lo que siempre empezamos a una columna más a la derecha e izquierda.
					if(!(i==0||i==medida-1)&&(auxFila==i&&auxColum==j)) {
						System.out.print("* ");
						auxColum--;
						auxFila++;
					}else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
		
		//INVERTIR LA Z
		//Al invertirla podemos ver que las columnas y las filas coinciden a la hora de pintar(salvo la primera y ultima fila que van pintadas siempre. En este
		//caso, pintamos cuando i==j. No necesitaremos los auxiliares.
		
		for (int i = 0; i<medida; i++) {
			for(int j = 0; j<medida; j++) {
				if(i==0||i==medida-1) {
					System.out.print("* ");
				}else {
					if(!(i==0||i==medida-1)&&(i==j)) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
		sc.close();
		//refuerzo, hacer la pirámide y el rombo
	}

}
