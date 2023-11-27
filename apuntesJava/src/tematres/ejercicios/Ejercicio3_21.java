package tematres.ejercicios;

import java.util.Scanner;

/**
 * Solución al ejercicio 3.21. Programa que solicita el numero del dni y que calcula cual es la letra que corresponde al numero 
 * introducido. Después, devuelve la letra.
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Ejercicio3_21 {

	public static void main(String[] args) {
		
		//declaramos las variables dni:para guardar el dni introducido; divi:para realizar la división entre 23; multi: para realizar la
		//multiplicacion por 23; y resto para guardar el resto de la diferencia entre multi y dni
		int dni, divi, multi, resto;
		//almacenamos una constante con el 23, para no usar literales
		final int DIVISOR = 23;
		//inicializamos una variable String con cadena vacía para almacenar la letra
		String resultado="";
		//abrimos el flujo de entrada
		Scanner sc = new Scanner(System.in);
		//solicitamos el numero
		System.out.println("Introduce el número del DNI");
		//guardamos el numero en la variable creada para ello
		dni = sc.nextInt();
		//tomamos un array de restos para poder buscar la posición del resto que obtengamos
		int[]restos= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
		//tomamos un array de las letras que le corresponden según la posición previamente buscada en el array anterior
		String[]conversion= {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		//comprobamos con un if/else que la longitud sea 8
		if(String.valueOf(dni).length()==8) {
			//realizamos la division
			divi=dni/DIVISOR;
			//realizamos la multiplicacion
			multi=divi*DIVISOR;
			//restamos la diferencia
			resto=dni-multi;
			//guardamos la letra en la variable creada para ello
			resultado+=conversion[restos[resto]];
		}else {
			//mensaje si no se introduce la longitud correcta
			System.out.println("Número incorrecto, inténtelo de nuevo.");
		}
		//se devuelve el resultado
		System.out.println(resultado + ", quedaría tal que: " + dni + resultado);
		sc.close();
	}

}
