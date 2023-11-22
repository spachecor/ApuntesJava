package tematres.ejercicios;

import java.util.Scanner;
public class Ejercicios3_4 {

	public static void main(String[] args) {
		/* Escribe un programa que pida un número entero por consola comprendido entre 1000 y 99000. 
		 * A partir del número introducido se mostrará el número de unidades de mil, centenas, decenas 
		 * y unidades.*/
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entre 1000 y 99000");
		num=sc.nextInt();
		System.out.println(String.format("El número está compuesto por: %d miles, "
				+ "%d centenas, %d decenas y %d unidades.", num/1000, (num%1000)/100, (num%100)/10, num%10));
		sc.close();
	}

}
