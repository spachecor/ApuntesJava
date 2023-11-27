package tematres.ejercicios;

import java.util.Scanner;
/**
 * Ejercicio 3.16. Programa que pide un numero al usuario y devuelve el factorial del mismo
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Ejercicio3_16 {

	public static void main(String[] args) {
		/* Desarrolla un programa Java que calcule el factorial de un número. El factorial de un número se obtiene multiplicando
		 * el propio número por el resultante de restar 1 a dicho número, hasta llegar a 1.

		Ejemplo: factorial de 5

		5!=5*4*3*2*1=120*/
		//variable para almacenar el numero introducido
		int num;
		//variable para guardar el numero resultante. Tiene valor inicial 1 y no 0 porque cualquier cosa por 0 es 0
		long acumulador=1;
		//abrimos flujo de entrada
		Scanner sc = new Scanner(System.in);
		//solicitamos numero
		System.out.println("Introduce un nº para realizar su factorial");
		//almacenamos numero en la variable asignada
		num = sc.nextInt();
		//si el numero introducido es 0, el factorial es 0
		if(num==0) {
			acumulador=0;
		}else {
			//usamos un bucle for para recorrer tantas posiciones como el nº introducido, e irle restando uno en cada ciclo. Delimitamos
			//que el número contador (i en este caso) sea menor o igual al dado y que sea siempre mayor que 0.
			for(int i = num;i<=num&&i>0;i--) {
				acumulador*=i;
			}
		}
		
		System.out.println(acumulador);
		
		sc.close();
	}

}
