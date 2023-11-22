package tematres.ejercicios;

import java.util.Scanner;

public class Ejercicio3_3 {

	public static void main(String[] args) {
		/* Escribe un programa que pida 3 números enteros por consola y los muestre ordenados de 
		 * mayor a menor*/

		int num1, num2, num3, max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		num1 = sc.nextInt();
		System.out.println("Introduce otro número: ");
		num2 = sc.nextInt();
		System.out.println("Introduce el último número: ");
		num3 = sc.nextInt();
		max = (int)Math.max(Math.max(num1, num2), num3);
		
        if (max==num1) {
            if(num2>=num3) {
                System.out.println(num1 + " > " + num2 + " > " + num3);
            }else{
                System.out.println(num1 + " > " + num3 + " > " + num2);
            }
        }else if(max==num2) {
            if(num1>=num3) {
                System.out.println(num2 + " > " + num1 + " > " + num3);
            }else {
                System.out.println(num2 + " > " + num3 + " > " + num1);
            }
        }else if(max==num3) {
            if(num1>=num2) {
                System.out.println(num3 + " > " + num1 + " > " + num2);
            }else {
                System.out.println(num3 + " > " + num2 + " > " + num1);
            }
        }
		
		sc.close();
	}
}