package temados.ejercicios;

import java.util.Scanner;

public class Ejercicio2_3_NumeroDecimal {

	public static void main(String[] args) {
		/*d) (NumeroDecimal.java) Pide un número decimal que tenga separador de miles y coma decimal (ejemplo:
		1.234,1234) y muestra en qué posición aparece el símbolo separador de miles (.) y el símbolo
		separador de decimales (,)*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un nº decimal que tenga separador de miles y coma decimal (ej: 1.234,1234)");
		String num = sc.nextLine();
		int posicionPunto = num.indexOf(".");
		int posicionComa = num.indexOf(",");
		System.out.println(posicionPunto>=0?(posicionComa>=0?"El punto está en la posición " + posicionPunto+1 + 
			", y la coma está en la posición " + posicionComa+1 + ".":"El número introducido no contiene coma, y su punto está en "
					+ posicionPunto+1 + "."):(posicionComa>=0?"El número introducido no contiene punto, y su coma está en "
							+ posicionComa+1 + ".":"El nº introducido no tiene ni coma ni punto"));
		
		
		
	}

}
