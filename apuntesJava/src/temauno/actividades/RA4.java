package temauno.actividades;

/**
 * Ejercicio de refuerzo y ampliación 4
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class RA4 {

	public static void main(String[] args) {
		
		int n, a, b, c, d, m, r1, r2, r3, r4, r5, r6, r7;
		String r8;
		n = 123;
		a = 12;
		b = 5;
		c = 16;
		d = 8;
		m = 56;
		
		/*Escribe las expresiones algorítmicas equivalentes para cada uno de los siguientes enunciados:

1.  El doble de un número N
2.  El triple de un número N
3.  Seis veces la diferencia de dos números enteros A y B
4.  La diferencia entre el producto de A por B y la suma de C más D
5.  La mitad de la última cifra de un número entero A
6.  La suma de los dígitos de un número entero N de 3 cifras
7.  La suma de la última cifra de los números enteros N y M
8.  Comprobar si un número entero N es múltiplo de 2 y de 3 */
		
		//1.  El doble de un número N
		
		r1 = 2*n;
		System.out.println("El doble de " + n + " es: " + r1);
		
		//2.  El triple de un número N
		
		r2 = 3*n;
		System.out.println("El triple de " + n + " es; " + r2);
		
		//3.  Seis veces la diferencia de dos números enteros A y B
		
		r3 = 6*(a-b);
		System.out.println("Seis veces la diferencia de dos números enteros A y B" + r3);
		
		//4.  La diferencia entre el producto de A por B y la suma de C más D
		
		r4 = (a*b)-(c+d);
		System.out.println("La diferencia entre el producto de A por B y la suma de C más D es: " + r4);
		
		//5.  La mitad de la última cifra de un número entero A
		
		
		r5 = (a%10)/2;
		System.out.println("La mitad de la última cifra de un número entero A: " + r5);
		
		//6.  La suma de los dígitos de un número entero N de 3 cifras
		
		r6 = (n/100)+((n/10)%10)+(n%10);
		System.out.println("La suma de los dígitos de un número entero N de 3 cifras: " + r6);
		
		//7.  La suma de la última cifra de los números enteros N y M
		
		r7 = (n%10)+(m%10);
		System.out.println("La suma de la última cifra de los números enteros N y M: " + r7);
		
		//8.  Comprobar si un número entero N es múltiplo de 2 y de 3
		
		r8 = (n%2==0 && n%3==0)?" Es múltiplo de 2 y de 3(simultáneamente).":
			" No es mútiplo de 2 y de 3(simultáneamente).";
		System.out.println(n + r8);
		
	}

}
