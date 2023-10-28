package temauno.operadores;

import java.util.Scanner;
/**
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class ParImpar {

	public static void main(String[] args) {
		//1º Pedir un número por consola
		//2º Calcular si el número es par o impar
		//3º Mostrar "el número es par" o "el número es impar" según corresponda
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca un número: ");
		int num = sc.nextInt();
		//Anidamos operador ternario para decir también si el número es mayor o menor a 1000
		String calc = num%2==0?(num>=1000?"El nº es par y mayor o igual a 1000":"El nº introducido es par e inferior a 1000")
				:(num>=1000?"El nº es impar y mayor o igual a 1000":"El nº introducido es impar e inferior a 1000");
		System.out.println(calc);
		sc.close();
		

		
	}

}
