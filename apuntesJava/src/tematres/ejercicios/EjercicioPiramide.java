package tematres.ejercicios;

import java.util.Scanner;
/**
 * Solución al ejercicio 3.12. Se pide la longitud de un lado al usuario y se dibuja la pirámide con la longitud que éste dice
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class EjercicioPiramide {

	public static void main(String[] args) {
		//se abre el flujo de entrada
		Scanner sc = new Scanner(System.in);
		//se solicita la longitud
		System.out.println("Introduzca lo longitud del lado del triángulo");
		//se recoje el número que aporta el usuario
		int medida = sc.nextInt();
		//se calcula el ancho que tendrá el triángulo
		int medidaColum=(medida*2)-1;
		//int max = (medidaColum/2)+1;
		//int min = (medidaColum/2)-1;
		//se calcula donde irán los $ del medio
		int pares = (medidaColum/2)+1;
		//se usa un bucle for para recorrer la matriz por las filas
		for(int i = 0; i<medida; i++) {
			//se usa un bucle for para recorrer la matriz por las columnas
			for(int j = 0; j<medidaColum; j++) {
				//usamos if/else para pintar la última fila
				if(j==pares&&i%2==0&&!(i==medida-1)) {
					System.out.print("$");
					//ponemos espacios en los huecos vacíos
				}else System.out.print(" ");
				//usamos if para pintar los $ del medio
				if(i==medida-1&&j<pares) {
					System.out.print("$");
				}
				
				
			}
			//se añade salto de línea al final de cada columna
			System.out.println();
		}
		//se cierra el flujo de entrada
		sc.close();
	}
}
