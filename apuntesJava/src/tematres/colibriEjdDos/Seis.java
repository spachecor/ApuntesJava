package tematres.colibriEjdDos;

import java.util.Scanner;

/**
 * Programa que pide números hasta que se teclee un 0, después muestra la suma de todos los números introducidos.
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Seis {

	public static void main(String[] args) {
		//Declaramos variable que almacenará el numero. Inicializamos con valor 0 tambien una variable para almacenar los valores sumados.
		int num, acumulador=0;
		//Abrimos flujo de entrada
		Scanner sc = new Scanner(System.in);
		System.out.println("Juego: Introduce numeros y se irán sumando uno con el siguiente y así sucesivamente hasta que introduzcas el 0");
		
		do {
			 //Asignamos num con valor 1 para asegurar que tendrá un valor y que no saldrá del bucle hasta que no se introduzca el 0
			num=1;
			//pedimos num
			System.out.println("Introduce un numero: ");
			//comprobamos que num sea numero
			if(sc.hasNextInt()) {
				//almacenamos num
				num=sc.nextInt();
				//sumamos num al acumulador
				acumulador +=num;
			}else {
				//avisamos de que el numero se ha introducido mal
				System.out.println("Debes introducir un numero.");
				//reseteamos flujo de entrada
				sc.next();
			}
			//sólo sale del bucle cuando num=0
		}while(num!=0);
		//imprimimos los valores sumados en acumulador
		System.out.println("La suma de los valores introducidos es: "+acumulador);
	}

}
