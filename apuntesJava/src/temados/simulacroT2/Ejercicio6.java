package temados.simulacroT2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		/* 6. Se quiere cifrar palabras mediante un método parecido al cifrado César. Para ello se dispone de los caracteres
		del alfabeto y una secuencia de caracteres del mismo tamaño que el alfabeto pero con orden aleatorio (ce: b,c,d,f,h).

		alfabeto: abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ

		secuencia para cifrado: ñopqrsabcdefghijklmnABCDEFGHIJtuvwKLMNÑOPQRSTUVWXYZxyz

		Pide una palabra de 5 caracteres como máximo, cífrala con la secuencia de cifrado anterior y muestrala por consola.
		Ejemplo de cifrado:

		Sin cifrar -> Cifrada

		Java        -> MñCñ
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una palabra de como máximo 5 caracteres: ");
		String cadena = sc.next();
		String abc = new String("abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ");
		String cifrado = new String("ñopqrsabcdefghijklmnABCDEFGHIJtuvwKLMNÑOPQRSTUVWXYZxyz");
		System.out.println(String.format("La cadena cifrada queda de la siguiente forma: %c%c%c%c%c",
				cifrado.charAt(abc.indexOf(cadena.substring(0,1))), 
				cifrado.charAt(abc.indexOf(cadena.substring(1,2))),
				cifrado.charAt(abc.indexOf(cadena.substring(2,3))),
				cifrado.charAt(abc.indexOf(cadena.substring(3,4))),
				cifrado.charAt(abc.indexOf(cadena.substring(4)))));
	}

}
