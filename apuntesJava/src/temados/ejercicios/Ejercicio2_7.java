package temados.ejercicios;

import java.util.Scanner;

public class Ejercicio2_7 {

	public static void main(String[] args) {
		 /* Desarrolla un programa Java, utilizando la plantilla de los recursos del tema, en el que se pidan
		  * dos números decimales por consola, con 3 cifras decimales cada uno. 
		 

		 Indica cuál de los dos números es mayor.

		 De uno de los 2 números, indica cuál es el entero menor o igual y más próximo. Indica también cuál 
		 es el entero mayor más próximo. 

		 Redondea dichos números al entero más próximo y muestra el producto de los mismos, además se tendrá 
		 que indicar si dicho producto es par o impar.*/
		
		double num1, num2, producto;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca dos números decimales con tres decimales cada uno: ");
		num1 = sc.nextDouble();
		System.out.println("Ahora el otro: ");
		num2 = sc.nextDouble();
		
		System.out.println("El nº " + Math.max(num1, num2) + " es el mayor de ambos.");
		
		System.out.println("Del primer nº introducido, el entero menor o igual más próximo es: " 
		+ Math.floor(num1) + ". Igualmente, el entero mayor más próximo es el: " + Math.ceil(num1) + ".");
		
		producto = Math.round(num1) * Math.round(num2);
		
		System.out.println(producto%2==0?String.format("El producto de ambos números resulta %.0f y es par.",
				producto):String.format("El producto de ambos números resulta %.0f y es impar.", producto));
		
		
	}

}
