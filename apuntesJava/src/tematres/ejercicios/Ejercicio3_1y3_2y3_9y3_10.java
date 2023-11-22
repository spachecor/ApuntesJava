package tematres.ejercicios;

import java.util.Scanner;
/**
 * Ejercicios varios
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Ejercicio3_1y3_2y3_9y3_10 {

	public static void main(String[] args) {
		/*3.1- Escribe un programa que pida 3 n enteros y muestre qué n es mayor*/
		Scanner sc = new Scanner(System.in);//abrimos el flujo de entrada
		System.out.println("Introduzca 3 números enteros por favor: ");//Solicitamos los 3 números
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();//Recogemos los 3 numeros
		
		/*System.out.println("El número mayor es: " + Math.max(Math.max(num1, num2), num3));*///forma con clase math
		
		//Primero comprobamos que num1 sea mayor o igual que num2 y numn3
		if (num1>=num2 && num1>=num3) {
			System.out.println(String.format("El número %d es el mayor", num1));
		}//Después hacemos lo mismo con num2
		else if (num2>=num1 && num2>=num3){
			System.out.println(String.format("El número %d es el mayor", num2));
		}//Si no es ninguna, num3 sería el mayor
		else {
			System.out.println(String.format("El número %d es el mayor", num3));
		}
		
		
		/* 3.2- Escribe un programa que pida 2 números decimales, con 3 decimales y compruebe si los 2 numeros introducidos tienen los
		 * mismos decimales. En dicho programa debe mostral por consola "Decimales iguales" y sino "Decimales distintos"*/
		
		System.out.println("Introduzca 2 números decimales con 3 decimales cada uno: ");
		double num4 = sc.nextDouble();
		double num5 = sc.nextDouble();
		if (num4-Math.floor(num4)==num5-Math.floor(num5)) {
			System.out.println("Decimales iguales");
		}else {
			System.out.println("Decimales distintos");
		}
		
		/* 3.9- Realiza un programa que muestre en un menú de opciones 8 operaciones matemáticas básicas, relacionadas con 
		 * operadores matemáticos o con funciones. Solicita al usuario que introduzca por pantalla los valores necesarios para
		 * cada cálculo. Debes incorporar una opción adicional (la novena) para salir del programa.
		 * Los resultados de cada cálculo se muestran por pantalla. */
		
		int op1, op2, eleccion=9;
		final int SUMA = 1, RESTA = 2, MULTIPLICACION = 3, DIVISION = 4, NMAYOR = 5, NMENOR = 6, PRIMELEVSEG = 7,
				SEGELEVPRIM = 8, SALIR = 9;
		System.out.println("Introduce 2 números antes de acceder al menú: ");
		op1 = sc.nextInt();
		op2 = sc.nextInt();
		
		//usamos un bucle do-while para repetir el menú hasta que el usuario introduzca un 9 (salir)
		do {
			System.out.println("Elige una opción del siguiente menú(marcando el n corrrespondiente): \n 1-Suma \n 2-Resta \n "
					+ "3-Multiplicación \n 4-División \n 5-Número mayor \n 6-Número menor \n 7-El primero elevado al segundo"
					+ " \n 8-Segundo elevado al primero \n 9-Salir del menú ");
			
			eleccion = sc.nextInt();
			
		//Montamos un switch en el que tenemos las 9 opciones, incluyendo salir del menú (la 9) y un default que nos dirá
		//que lo hagamos de nuevo si el número no está comprendido entre 1 y 9
		switch(eleccion) {
		case SUMA:
			System.out.println("El resultado es: " + (op1+op2)+"\n");
			break;
		case RESTA:
			System.out.println("El resultado es: " + (op1-op2)+"\n");
			break;
		case MULTIPLICACION:
			System.out.println("El resultado es: " + (op1*op2)+"\n");
			break;
		case DIVISION:
			System.out.println("El resultado es: " + (op1/op2)+"\n");
			break;
		case NMAYOR:
			System.out.println("El resultado es: " + (Math.max(op1, op2))+"\n");
			break;
		case NMENOR:
			System.out.println("El resultado es: " + (Math.min(op1, op2))+"\n");
			break;
		case PRIMELEVSEG:
			System.out.println("El resultado es: " + (Math.pow(op1, op2))+"\n");
			break;
		case SEGELEVPRIM:
			System.out.println("El resultado es: " + (Math.pow(op2, op1))+"\n");
			break;
		case SALIR:
			break;
		default:
			System.out.println("Opción incorrecta, pulse 0+intro para continuar: ");
			sc.nextInt();
		}
		
		}while(eleccion!=9);
		
		System.out.println("Has salido del menú");
		
		
		/* 3.10- Escribe un programa que pida un número entero y muestre su tabla de multiplicar */
		
		int tabla;
		System.out.println("Introduce un número para mostrar su tabla de multiplicar: ");
		tabla = sc.nextInt();
		for(int contador=0; contador<=10;contador++) {
			System.out.println(String.format("%d * %d = %d", tabla, contador, tabla*contador));
		}
		
		/* Mostrar por consola todos los números pares existentes entre 1 y un número dado*/
		
		System.out.println("Introduzca un número para mostrar los pares desde 1 hasta el dado");
		int nDado = (sc.nextInt()+1);
		for(int i = 0;nDado!=i;i++) {
			if(i%2==0)System.out.println(i);
		}
		sc.close();
	}

}
