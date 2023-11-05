package temados.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio para el uso de la clase Math
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Ejercicio2_12_MATH {

	public static void main(String[] args) {
		/* Se quiere resolver un problema simple. 
		 * 1º se pedirá por consola un nº con dos cifras decimales. Se quiere que se redondee a la alta y 
		 * a la baja.
		 * 2º ahora se pedirán dos números y se mostrará por consola el mayor
		 * 3º con los nºs de antes, se elevará el primero al segundo y obtendremos la raiz cuadrada de
		 * este resultado
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca dos cifras con dos decimales cada una: ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		System.out.println("Redondeo a la alta: " + Math.ceil(num1) + " y el redondeo a la baja : "
				+ Math.floor(num2));
		
		System.out.println("Introduzca dos números enteros: ");
		double num3 = sc.nextDouble();
		double num4 = sc.nextDouble();
		System.out.println(Math.max(num3, num4) + " es el mayor");
		
		System.out.println("El resultado del 3º apartado es: " + Math.pow(num3, num4) + " y " 
				+ Math.sqrt(Math.pow(num3, num4)));
		
		
		sc.close();
	}

}
