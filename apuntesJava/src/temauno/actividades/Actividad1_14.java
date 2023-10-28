package temauno.actividades;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

/**
 * Ejercicio 1.14 en el cual deben de resolverse una serie de apartados con programas. Los enunciados son los siguientes:
 * 	10- Comprobar si la primera cifra de un número entero N de 3 cifras es impar.
 * 	11- Comprobar si la primera cifra de un número entero N de 4 cifras es par.
 * 	12- Comprobar si una variable A de tipo carácter contiene una letra mayúscula.
 * 	13- Comprobar si una variable A de tipo carácter contiene una letra mayúscula o minúscula.
 * 	14- Comprobar si una variable A de tipo carácter no contiene una letra mayúscula.
 * 	15- Comprobar si una variable A de tipo carácter no contiene una letra mayúscula o minúscula.
 * 	16- Comprobar si el contenido de la variable N termina en 0 ó 7.
 * 	17- Comprobar si el contenido de la variable precio es igual o mayor que 10€ y menor que 50€.
 * 	18- Sumar el dígito más a la derecha de N al propio valor de N. Por ejemplo, si N contiene el valor 463 después
 * 		de la operación contendrá el valor 466 (463+3).
 * 	19- Comprobar si un número entero N de cuatro cifras es capicúa. Un número capicúa si se puede leer igual de derecha
 * 		a izquierda que de izquierda a derecha.
 * 	20- Una variable entera M contiene un número de mes. Comprobar si corresponde a un mes de 30 días.
 * 	21- Quitarle a un número entero N su última cifra. Supondremos que N tiene más de una cifra. Por ejemplo, si N contiene
 * 		el valor 123 después de la operación contendrá el valor 12.
 * 	22- Quitarle a un número entero N de 5 cifras su primera cifra. Por ejemplo, si N contiene el valor 12345, después de
 * 		la operación contendrá el valor 2345.
 * 	23- Comprobar si una valiable C de tipo char contiene un dígito. (Carácter entre 0 y 9)
 * 	24- Dada dos variables enteras N y M de cuatro cifras, sumar las cifras de N y guardar la suma en la variable X, sumar las
 * 		cifras M y guardar la suma en la variable Y. Finalmente, guarda en la variable Z la suma de X e Y.
 * 	25- Con DN, MN y AN día, mes y año de nacimiento de una persona y DA, MA, AA día, mes y año actual, escribe la expesión	
 * 		algorítmica que compruebe si tiene 18 años cumplidos.
 * 
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Actividad1_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//10- Comprobar si la primera cifra de un número entero N de 3 cifras es impar.
		/*int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un nº entero de 3 cifras: ");
		n = Integer.parseInt(sc.next().substring(0,1));
		System.out.println((n%2!=0)?"Es impar":"Es par");*/
		
		//OTRA SOLUCIÓN::
		/*
		 *System.out.println((n/100)%2==0)?:"El 1º nº es par":"El 1º nº es impar");
		 *CUANDO DIVIDIMOS ENTRE 100, NO GUARDA DECIMALES(INT), ASÍ QUE TOMAMOS EL 1º Nº */
		
		//11- Comprobar si la primera cifra de un número entero N de 4 cifras es par.
		/*int n2;
		System.out.println("Introduzca un nº de 4 cifras");
		n2=Integer.parseInt(sc.next().substring(0, 1));
		System.out.println((n2%2==0)?"Es par":"Es impar");*/
		
		//12- Comprobar si una variable A de tipo carácter contiene una letra mayúscula.
		
		/*char a;
		System.out.println("Introduzca una letra mayúscula");
		a = sc.next().charAt(0);
		System.out.println((a>=65 && a<=90)?"Contiene una letra mayúscula":"No contiene una letra" +
		" mayúscula");*/
		
		//13- Comprobar si una variable A de tipo carácter contiene una letra mayúscula o minúscula.
		
		/*char a2;
		System.out.println("Introduzca una letra mayúscula o minúscula");
		a2 = sc.next().charAt(0);
		System.out.println((a2>=65 && a2<=90)?"La letra es mayúscula":(a2>=97 && a2<=122)?
				"Es minúscula":"Carácter inválido");*/
		
		//14- Comprobar si una variable A de tipo carácter no contiene una letra mayúscula.
		
		/*char a3;
		System.out.println("Introduzca una letra para comprobar si es mayúscula");
		a3 = sc.next().charAt(0);
		System.out.println(!(a3>=65 && a3<=90)?"Minúscula u otro tipo de carácter":"Es mayúscula");*/
		
		//15- Comprobar si una variable A de tipo carácter no contiene una letra mayúscula o minúscula.

		/*char a4;
		System.out.println("Introduzca un carácter diferente a una letra mayúscula o minúscula");
		a4 = sc.next().charAt(0);
		System.out.println((a4>=65 && a4<=90 || a4>=97 && a4<=122)?"La letra es mayúscula o minúscula."
				:"El carácter es diferente a una letra minúscula o mayúscula.");*/
		
		//16- Comprobar si el contenido de la variable N termina en 0 ó 7.
		
		/*String n3;
		char resultado;
		System.out.println("Introduce un nº terminado en 0 o en 7");
		n3 = sc.next();
		resultado = n3.charAt(n3.length()-1);
		System.out.println((n3.charAt(n3.length()-1))=='0' || (n3.charAt(n3.length()-1))=='7'?
				(((n3.charAt(n3.length()-1))=='0')?n3 + " termina en 0":n3 + " termina en 7"):
					n3 + " no termina ni en 0 ni en 7");*/
		
		//17- Comprobar si el contenido de la variable precio es igual o mayor que 10€ y menor que 50€.
		
		/*int precio;
		System.out.println("Introduzca el precio");
		precio = sc.nextInt();
		System.out.println((precio>=10 && precio<50)?"El precio es mayor o igual a 10€ y menor a 50€"
				:"El precio es inferior a 10€ o superior o igual a 50€.");*/
		
		/*18- Sumar el dígito más a la derecha de N al propio valor de N. Por ejemplo, si N contiene
		el valor 463 después de la operación contendrá el valor 466 (463+3).*/
		
		/*String n4;
		int medida;
		System.out.println("Introduzca un nº:");
		n4 = sc.next();
		medida = n4.length();
		System.out.println((Integer.parseInt(n4) + (Integer.parseInt(n4.substring(medida-1, medida)))));*/
		
		/*19- Comprobar si un número entero N de cuatro cifras es capicúa. Un número capicúa si se puede leer igual de derecha
		 * a izquierda que de izquierda a derecha.*/
	
		/*int n5, unidad, decena, centena, millar;
		System.out.println("Introduzca un nº capicúa de 4 cifras.");
		n5 = sc.nextInt();
		System.out.println((n5/1000)==(n5%10) && ((n5%1000)/100)==((n5%100)/10)?
				"Es capicúa":"No es capicúa");
		/*millar = n5/1000;
		centena = (n5%1000)/100;
		decena = (n5%00)/10;
		unidad = n5%10;*/
		
		//20- Una variable entera M contiene un número de mes. Comprobar si corresponde a un mes de 30 días.
		
		/*int m;
		System.out.println("Introduzca el mes (en números, mm)");
		m = sc.nextInt();
		System.out.println(m==4?"Abril, tiene 30 días.":m==6?"Junio, tiene 30 días.":
			m==9?"Septiembre, tiene 30 días":m==11?"Nomviebre, tiene 30 días.":"El mes no tiene 30 días");*/
		
		/*21- Quitarle a un número entero N su última cifra. Supondremos que N tiene más de una cifra.
		Por ejemplo, si N contiene el valor 123 después de la operación contendrá el valor 12.*/
		
		/*String n6;
		System.out.println("Introduzca un nº con dos cifras o más.");
		n6 = sc.next();
		System.out.println("Resultado = " + n6.substring(0, (n6.length()-1)));*/
		
		/*22- Quitarle a un número entero N de 5 cifras su primera cifra. Por ejemplo, si N contiene
		el valor 12345, después de la operación contendrá el valor 2345.*/
		
		/*String n7;
		System.out.println("Introduzca un nº de 5 cifras.");
		n7 = sc.next();
		System.out.println("El resultante sería = " + n7.substring(1,n7.length()));*/
		
		//23- Comprobar si una valiable C de tipo char contiene un dígito. (Carácter entre 0 y 9)
		
		/*char c;
		System.out.println("Introduzca un dígito entre el 0 y el 9 (ambos inclusive");
		c = sc.next().charAt(0);
		System.out.println((c>=48 && c<=57)?"Su dígito está comprendido entre 0 y 9":
			"Dígito introducido incorrecto, inténtelo de nuevo.");*/
		//Más recomendable hacerlo con Character.isDigit(c); porque no a todos los sitios donde vaya el programa van a utilizar la
		//misma tabla ASCII, esto es MUY IMPORTANTE, isDigit() al no necesitarla no habrá problemas de codificación
		
		/*24- Dada dos variables enteras N y M de cuatro cifras, sumar las cifras de N y guardar la suma 
		en la variable X, sumar las cifras M y guardar la suma en la variable Y. Finalmente, guarda en la
		variable Z la suma de X e Y.*/
		
		/*String n8, m2;
		int x, y, z;
		System.out.println("Introduzca un nº de 4 cifras por favor");
		n8 = sc.next();
		System.out.println("Introduzca otro nº de 4 cifras por favor");
		m2 = sc.next();
		x = (Integer.parseInt(n8.substring(3, 4)))+(Integer.parseInt(n8.substring(2, 3))) + (Integer.parseInt(n8.substring(2, 3)))
				+ (Integer.parseInt(n8.substring(1, 2)));
		y = (Integer.parseInt(m2.substring(3, 4)))+(Integer.parseInt(m2.substring(2, 3))) + (Integer.parseInt(m2.substring(2, 3)))
				+ (Integer.parseInt(m2.substring(1, 2)));
		z = x+y;
		System.out.println("Resultado = " + z);*/
		
		
		/*25- Con DN, MN y AN día, mes y año de nacimiento de una persona y DA, MA, AA día, mes y año actual, escribe la expesión	
		algorítmica que compruebe si tiene 18 años cumplidos. */
		
		/*LocalDate nacimiento;
		int diaNac, mesNac, anioNac;
		
		System.out.println("Introduzca su día de cumpleaños(dd)");
		diaNac = sc.nextInt();
		System.out.println("Introduzca su mes de cumpleaños(mm)");
		mesNac = sc.nextInt();
		System.out.println("Introduzca su día de cumpleaños(aaaa)");
		anioNac = sc.nextInt();
		nacimiento = LocalDate.of(anioNac, mesNac, diaNac);
		
		System.out.println(ChronoUnit.YEARS.between(nacimiento, LocalDate.now())<18?"Menor de edad":
			"Mayor de edad");*/
		
		sc.close();
  		
		
		
		
		
	}

}
