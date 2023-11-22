package temados.repasoExamen;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio2_3 {

	public static void main(String[] args) {
		/* Desarrolla lo que se pide a continuación en un programa Java diferente, usa la plantilla 
		 * que hay en los recursos. Cada programa estará representado por una clase con un nombre único
		 *  y válido.
		 

			a) (Escalera.java) Muestra en consola una escalera con los números del 1 al 5. La escalera
			 se construirá mostrando en consola los números precedidos por un número variable de 
			 caracteres. Por ejemplo:

				1


					2


						3


							4


								5

			b) (LongitudCadena.java) Pide una cadena de texto por consola, después muestra la longitud
			 de la cadena, quita (si los hay) todos los espacios en blanco antes y al final del texto.
			 Vuelve a mostrar la longitud de la cadena. Muestra también el número de caracteres en 
			 blanco que has quitado.

			c) (Caracter.java) Pide un número entero por consola (para probar debes introducir un valor
			entre 0 y 255) y muestra el carácter que le corresponde.

			d) (NumeroDecimal.java) Pide un número decimal que tenga separador de miles y coma decimal
			(ejemplo: 1.234,1234) y muestra en qué posición aparece el símbolo separador de miles (.)
			y el símbolo separador de decimales (,)*/
		
		
		//Apartado a: 
		
		//Instanciamos un objeto de tipo stringtokenizer llamando a uno de sus constructores
		StringTokenizer st = new StringTokenizer("1 2 3 4 5", " ");
		
		//Usamos el método estático String.format para mostrar por consola junto a un System.out.println
		//nuestra escalera.
		System.out.println(String.format("%s\n\t%s\n\t\t%s\n\t\t\t%s\n\t\t\t\t%s",
				st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken()));
		
		//Apartado b: 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduce una cadena de texto: ");
		String cadena = sc.nextLine();
		//Utilizamos el médoto de instancia st.length() para obtener la longitud de la cadena, junto al
		//método estático String.format para mostrarlo
		System.out.println(String.format("La longitud original de la cadena es: %d", cadena.length()));
		//Volvemos a mostrar el resultado con el método estático String.format, y obtenemos la cadena
		//sin espacios al inicio y al final usando el método de instancia .trim(), que elimina los 
		//espacios en blanco al inicio y al final de una cadena. Finalmente mostramos la longitud usando
		//de nuevo el método de instancia .length()
		System.out.println(String.format("La longitud tras eliminar los espacios en blanco antes "
				+ "y después de la cadena es: %d", cadena.trim().length()));
		//Por último, utilizamos los mismo métodos antes mencionados para realizar una resta entre
		//la longitud original de la cadena y la longitud final de la cadena, dando los espacios en 
		//blanco eliminados, y mostramos en consola, de nuevo,  con el método estático String.format
		System.out.println(String.format("El número de espacios en blanco eliminados es de %d espacios."
				, cadena.length()-cadena.trim().length()));
		
		//Apartado c: 
		System.out.println("Introduce un número entre el 0 y el 255: ");
		int num1 = sc.nextInt();
		sc.nextLine();//Lo metemos para evitar fallos posteriores con el Scanner
		//Usamos el método estático String.format para mostrar el resultado como carácter en vez de como 
		//un número. Para ello, en vez de usar %d para mostrarlo, usamos %c, que es para caracteres
		System.out.println(String.format("El caracter que le corresponde al número introducido es: %c"
				, num1));
		
		//Apartado d: 
		System.out.println("Introduce un número decimal que tenga separador de miles(.) y coma decimal (,)");
		String num2 = sc.nextLine();
		//Obtenemos el separador decimal del sistema usando estáticamente DecimalFormat
		char simboloDecimal = ((DecimalFormat)DecimalFormat.getInstance(Locale.getDefault()))
				.getDecimalFormatSymbols().getDecimalSeparator();
		//Obtenemos el separador de miles del sistema usando estáticamente DecimalFormat
		char simboloMil = ((DecimalFormat)DecimalFormat.getInstance(Locale.getDefault()))
				.getDecimalFormatSymbols().getGroupingSeparator();
		//Utilizamos el operador ternario para poder condicionar nuestra respuesta según el número
		//introducido. Usamos los métodos de instancia .indexOf() y .lastIndexOf() para obetener la 
		//posición en la que está cada separador. Después, vamos metiendo condiciones en el operador
		//ternario hasta obtener la comprobación y la impresión de los resultados.
		System.out.println((num2.lastIndexOf(simboloMil)>=0&&num2.indexOf(simboloDecimal)>=0)?
				String.format("El separador de miles está en la posición %d y la coma separadora de "
						+ "decimales está en la posición %d", num2.lastIndexOf(simboloMil),
						num2.indexOf(simboloDecimal)):(num2.lastIndexOf(simboloMil)>=0)?
						String.format("El separador de miles está en la posición %d y no hay coma "
						+ "separadora.", num2.lastIndexOf(simboloMil)):(num2.indexOf(simboloDecimal)>=0)?
						String.format("El separador de decimales está en la posición %d y no hay "
						+ "separador de miles.", num2.indexOf(simboloDecimal)):"No hay ni separador de"
						+ " miles ni separador de decimales.");
		
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
		sc.close();
	}

}
