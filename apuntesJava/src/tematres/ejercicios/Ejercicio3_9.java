package tematres.ejercicios;

import java.util.Scanner;

public class Ejercicio3_9 {

	public static void main(String[] args) {
		/*Realiza un programa que muestre en un menú de opciones 8 operaciones matemáticas básicas, 
		 * relacionadas con operadores matemáticos o con funciones. Solicita al usuario que introduzca 
		 * por pantalla los valores necesarios para cada cálculo. Debes incorporar una opción adicional 
		 * (la novena) para salir del programa.
		 
			Los resultados de cada cálculo se muestran por pantalla.*/
		
		final int SUMA=1, RESTA=2, MULTI=3, DIV=4, EXP=5, RAIZ=6, DECREMENTO=7, INCREMENTO=8, SALIR=9;
		int opcion=9, num1, num2, resultado1, resultado2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca 2 valores, primer valor: ");
		num1 = sc.nextInt();
		System.out.println("Segundo valor: ");
		num2 = sc.nextInt();
		
		do {
			System.out.println("Introduce la opción en menú: ");
			System.out.println("************************************");
			System.out.println("1- SUMAR");
			System.out.println("************************************");
			System.out.println("2- RESTAR EL SEGUNDO AL PRIMERO");
			System.out.println("************************************");
			System.out.println("3- MULTIPLICAR");
			System.out.println("************************************");
			System.out.println("4- DIVIDIR EL SEGUNDO AL PRIMERO");
			System.out.println("************************************");
			System.out.println("5- EXPONENTE DEL SEGUNDO SOBRE EL PRIMERO");
			System.out.println("************************************");
			System.out.println("6- RAIZ CUADRADA DE CADA UNO");
			System.out.println("************************************");
			System.out.println("7- DECREMENTO DE CADA UNO");
			System.out.println("************************************");
			System.out.println("8- INCREMENTO DE CADA UNO");
			System.out.println("************************************");
			System.out.println("9- SALIR");
			System.out.println("************************************");
			opcion = sc.nextInt();
			switch (opcion) {
			case SUMA:
				resultado1 = num1+num2;
				System.out.println("El resultado es: " + resultado1);
				System.out.println("Pulse 0 + intro para volver al menú");
				sc.nextInt();
				break;
			case RESTA:
				resultado1 = num1-num2;
				System.out.println("El resultado es: " + resultado1);
				System.out.println("Pulse 0 + intro para volver al menú");
				sc.nextInt();
				break;
			case MULTI:
				resultado1 = Math.multiplyExact(num1, num2);
				System.out.println("El resultado es: " + resultado1);
				System.out.println("Pulse 0 + intro para volver al menú");
				sc.nextInt();
				break;
			case DIV:
				resultado1 = num1/num2;
				System.out.println("El resultado es: " + resultado1);
				System.out.println("Pulse 0 + intro para volver al menú");
				sc.nextInt();
				break;
			case EXP:
				resultado1 = (int)Math.pow(num1, num2);
				System.out.println("El resultado es: " + resultado1);
				System.out.println("Pulse 0 + intro para volver al menú");
				sc.nextInt();
				break;
			case RAIZ:
				resultado1 = (int)Math.sqrt(num1);
				resultado2 = (int)Math.sqrt(num2);
				System.out.println("El resultado 1 es: " + resultado1);
				System.out.println("El resultado 2 es: " + resultado2);
				System.out.println("Pulse 0 + intro para volver al menú");
				sc.nextInt();
				break;
			case DECREMENTO:
				resultado1 = num1--;
				resultado2 = num2--;
				System.out.println("El resultado 1 es: " + resultado1);
				System.out.println("El resultado 2 es: " + resultado2);
				System.out.println("Pulse 0 + intro para volver al menú");
				sc.nextInt();
				break;
			case INCREMENTO:
				resultado1 = num1++;
				resultado2 = num2++;
				System.out.println("El resultado 1 es: " + resultado1);
				System.out.println("El resultado 2 es: " + resultado2);
				System.out.println("Pulse 0 + intro para volver al menú");
				sc.nextInt();
				break;
			case SALIR:
				break;
			default:
					System.out.println("Opción no válida. Por favor, pulse 0 para volver al menú.");
					sc.nextInt();
				break;				 
			}
		}while(opcion!=9);
		
		System.out.println("Has salido del menú.");
		
		
		
		sc.close();
	}

}
