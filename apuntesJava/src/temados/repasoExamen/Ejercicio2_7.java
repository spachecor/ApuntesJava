package temados.repasoExamen;

import java.util.Scanner;

public class Ejercicio2_7 {

	public static void main(String[] args) {
		/*  Desarrolla un programa Java, utilizando la plantilla de los recursos del tema, en el que se
		 * pidan dos números decimales por consola, con 3 cifras decimales cada uno. 

		-Indica cuál de los dos números es mayor.

		-De uno de los 2 números, indica cuál es el entero menor o igual y más próximo. Indica también 
		cuál es el entero mayor más próximo. 

		-Redondea dichos números al entero más próximo y muestra el producto de los mismos, además se 
		tendrá que indicar si dicho producto es par o impar.
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dos números con tres cifras decimales cada uno: ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		//Primer apartado
		System.out.println("El número mayor es: " + Math.max(num1, num2));
		
		//Segundo apartado
		System.out.println(String.format("El entero menor o igual y más próximo es el %d y el entero"
				+ " mayor más próximo es el %d", Math.round(Math.min(num1, num2)), 
				Math.round(Math.max(num1, num2))));
		
		//Tercer apartado
		System.out.println(String.format("El producto redondeado de %f y %f es %d. Además, el producto es"
				+ " %s", num1, num2, Math.multiplyFull((int)Math.round(num1), (int)Math.round(num2)), 
				(Math.multiplyFull((int)Math.round(num1), (int)Math.round(num2))%2==0)?"par.":"impar."));
		
		sc.close();
	}

}
