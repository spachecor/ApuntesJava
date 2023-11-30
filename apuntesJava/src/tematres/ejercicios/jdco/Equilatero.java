package tematres.ejercicios.jdco;

import java.util.Scanner;
/**
 * 3.12. Dibuja un triángulo equilátero con el símbolo $ (ce: b,c,h) pintando el $ en lados 
 * correspodiente para que cada lado tenga el mismo numero de $ en cada lado
 * @author juandomingo
 * @version 1.0
 */
public class Equilatero {
/*
 * Dibuja un triángulo equilátero utilizando el símbolo $, se debe pedir al usuario la 
 * longitud del lado, si la longitud es 5, el triángulo mostrará en cada lado 5 símbolos $.
 */
	public static void main(String[] args) {
		int lado,medio;
		Scanner entrada = new Scanner(System.in);
		//Pide por consola el la longitud del lado del triangulo a mostrar
		System.out.println("Introduce la longitud del lado del triangulo a dibujar: ");
		lado = entrada.nextInt();
		//se obtiene la columna central del triángulo
		medio = lado-1;
		for (int fila=0; fila<lado;fila++) {
			for (int columna=0; columna<lado*2-1; columna++) {	
				//se imprimen $ si la columna está comprendida entre valores
				//que van desde la posición del punto medio más menos la fila actual
				if(columna>=medio-fila && columna<=medio+fila ) {
					  // Si la columna es par, imprime "$", de lo contrario imprime un espacio
	                if ((columna - (medio - fila)) % 2 == 0)
	                    System.out.print("$");
	                else
	                    System.out.print(" ");
	            } else {
	                System.out.print(" ");
	            }
	        }entrada.close();
	        System.out.print("\n");
		}
	}	
}
