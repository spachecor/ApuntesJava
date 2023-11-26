package tematres.ejercicios;

import java.util.Scanner;

public class Ejercicio3_16 {

	public static void main(String[] args) {
		/* Desarrolla un programa Java que calcule el factorial de un número. El factorial de un número se obtiene multiplicando
		 * el propio número por el resultante de restar 1 a dicho número, hasta llegar a 1.

		Ejemplo: factorial de 5

		5!=5*4*3*2*1=120*/
		
		int num;
		long acumulador=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un nº para realizar su factorial");
		num = sc.nextInt();
		
		//usamos un bucle for para recorrer tantas posiciones como el nº introducido, e irle restando uno en cada ciclo. Delimitamos
		//que el número contador (i en este caso) sea menor o igual al dado y que sea siempre mayor que 0.
		for(int i = num;i<=num&&i>0;i--) {
			acumulador*=i;
		}
		System.out.println(acumulador);
		
		sc.close();
	}

}
