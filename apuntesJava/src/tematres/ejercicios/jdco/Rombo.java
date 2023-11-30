package tematres.ejercicios.jdco;

import java.util.Scanner;

public class Rombo {

	public static void main(String[] args) {
		int lado,medio;
		Scanner entrada = new Scanner(System.in);
		//Pide por consola el la longitud del lado del triangulo a mostrar
		System.out.println("Introduce la longitud del lado del triangulo a dibujar: ");
		lado = entrada.nextInt();
		//se obtiene la columna central del triángulo
		medio = lado-1;
		// Bucle que recorre cada fila de la parte superior del rombo
		for (int fila=0; fila<lado;fila++) {
			// Bucle que recorre cada columna de la fila actual
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
	        }
	        System.out.print("\n");          
		}
        // Dibuja la parte inferior del rombo
		// Bucle que recorre cada fila de la parte inferior del rombo
        for (int fila = lado - 2; fila >= 0; fila--) {
        	// Bucle que recorre cada columna de la fila actual
            for (int columna = 0; columna < lado * 2 - 1; columna++) {
            	// Si la columna está en el rango correcto para dibujar el rombo
                if (columna >= medio - fila && columna <= medio + fila) {
                	// Si la columna es par, imprime "$"
                    if ((columna - (medio - fila)) % 2 == 0)
                        System.out.print("$");
                    else
                        System.out.print(" ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        entrada.close();
	}
}
