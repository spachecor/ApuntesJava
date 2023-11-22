package temados.repasoExamen.simulacro;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/* 6. Se quiere cifrar palabras mediante un método parecido al cifrado César. Para ello se 
		 * dispone de los caracteres del alfabeto y una secuencia de caracteres del mismo tamaño que el 
		 * alfabeto pero con orden aleatorio (ce: b,c,d,f,h).

			alfabeto: abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ

			secuencia para cifrado: ñopqrsabcdefghijklmnABCDEFGHIJtuvwKLMNÑOPQRSTUVWXYZxyz

		Pide una palabra de 5 caracteres como máximo, cífrala con la secuencia de cifrado anterior y 
		muestrala por consola.
		
		Ejemplo de cifrado:

		Sin cifrar -> Cifrada

		Java        -> MñCñ
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra de como máximo 5 caracteres: ");
		String cadena = sc.next();
		String alfabeto = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		String cifrado = "ñopqrsabcdefghijklmnABCDEFGHIJtuvwKLMNÑOPQRSTUVWXYZxyz";
		
		System.out.println((cadena.length()==1)?
				String.valueOf(cifrado.charAt(alfabeto.indexOf(cadena.charAt(0)))):
					(cadena.length()==2)?
							String.valueOf(cifrado.charAt(alfabeto.indexOf(cadena.charAt(0))))
							.concat(String.valueOf(cifrado.charAt(alfabeto.indexOf(cadena.charAt(1))))):
					(cadena.length()==3)?
							String.valueOf(cifrado.charAt(alfabeto.indexOf(cadena.charAt(0))))
							.concat(String.valueOf(cifrado.charAt(alfabeto.indexOf(cadena.charAt(1)))))
							.concat(String.valueOf(cifrado.charAt(alfabeto.indexOf(cadena.charAt(2))))):
					(cadena.length()==4)?
							String.valueOf(cifrado.charAt(alfabeto.indexOf(cadena.charAt(0))))
							.concat(String.valueOf(cifrado.charAt(alfabeto.indexOf(cadena.charAt(1)))))
							.concat(String.valueOf(cifrado.charAt(alfabeto.indexOf(cadena.charAt(2)))))
							.concat(String.valueOf(cifrado.charAt(alfabeto.indexOf(cadena.charAt(3))))):
					(cadena.length()==5)?
							String.valueOf(cifrado.charAt(alfabeto.indexOf(cadena.charAt(0))))
							.concat(String.valueOf(cifrado.charAt(alfabeto.indexOf(cadena.charAt(1)))))
							.concat(String.valueOf(cifrado.charAt(alfabeto.indexOf(cadena.charAt(2)))))
							.concat(String.valueOf(cifrado.charAt(alfabeto.indexOf(cadena.charAt(3)))))
							.concat(String.valueOf(cifrado.charAt(alfabeto.indexOf(cadena.charAt(4))))):
					"Cadena demasiado larga.");
							
		sc.close();
	}

}
