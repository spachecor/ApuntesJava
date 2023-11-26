package tematres.ejercicios;

import java.util.Scanner;

public class ConversorDecimal_Hexadecimal {

	public static void main(String[] args) {
		///Pide un nº decimal y lo convierte en hexadecimal
		
		long auxiliar, resto;
		long numDecimal;
		//inicializamos una variable tipo String que contendrá el num hexadecimal según lo vayamos introduciendo
		String numHexadecimal ="";
		//creamos un array de valores que contenga los posibles valores que puede tomar el resto con el cambio a hexadecimal
		final char[] VALORES = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un nº para pasarlo a hexadecimal");
		numDecimal = sc.nextLong();
		//guardamos el nº decimal en una variable auxiliar
		auxiliar = numDecimal;
		
		//usamos un bucle while para que se vaya repitiendo siempre y cuando la variable auxiliar sea inferior a 0
		while(auxiliar>0) {
			//tomamos el modular 16 del auxiliar (es el resto que daría la división entre el auxiliar y 16)
			resto = auxiliar%16;
			//guardamos en nuestra variable numHexadecimal el nuevo valor, que será el resto sustituido por su valor en el array VALORES
			numHexadecimal = VALORES[(int)resto] + numHexadecimal;
			//dividimos el auxiliar entre 16 para volver a comenzar(si la división diese 0, porque fuese la última, no volvería a entrar en el bucle. Si la
			//división da cero significa que el resto obtenido anteriormente ha sido menor a 16)
			auxiliar/=16;
		}
		//imprimimos
		System.out.println(numHexadecimal);
		
		sc.close();
    }

		
}


