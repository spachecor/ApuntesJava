package temauno.examen;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Examen del tema uno. Programa en el que se resolverán una serie de problemas.
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class ExamenT1 {

	public static void main(String[] args) {

		//6. Sumar el dígito más a la izquierda de un número entero al propio valor de dicho número.
		//Por ejemplo, si el número contiene el valor 463 después de la operación contendrá el valor 467 ( 463 + 4 ).
		//El número introducido debe tener como mínimo 3 dígitos y como máximo 6. Si se introduce un número que no tiene
		//el tamaño anterior no se hará ninguna operación y se mostrará en consola 'El número introducido debe tener entre
		//3 y 6 dígitos' (1,5 puntos: e)
		
		
		int numero;//declaramos variable
		numero = 123;//asignamos valor
		String extraccion;
		extraccion = String.valueOf(numero).substring(0, String.valueOf(numero).length()-(String.valueOf(numero).length()-1));
		System.out.println((String.valueOf(numero).length()>=3 && String.valueOf(numero).length()<=6)?
				"El resultado es: " + (numero+Integer.parseInt(extraccion)):"El número introducido debe tener entre 3 y 6 dígitos");
		//Hacemos la comprobación con ternario e imprimimos. Hemos utilizado String.valueof(numero).length() para hayar
		//la longitud del número y poder saber si es la correcta.
		
		
		
		/*7. Solicita la fecha de nacimiento de una persona (2,5 puntos: f). Muestra lo siguiente:

	- En caso de no tener 18 años, mostrar los años, meses y días que le faltan

	- En caso de tener 18 años o más, mostrar los años, meses y días transcurridos desde que cumplió los 18 años
	 a la fecha actua.*/
		
		LocalDate nacimiento, ahora, cumple18;//declaramos
		long dias2, meses2, anios;
		Scanner sc = new Scanner(System.in);//iniciamos el flujo de entrada
		System.out.println("Introduce tu fecha de nacimiento(yyyy-mm-dd): ");//solicitamos fecha de nacimiento
		nacimiento = LocalDate.parse(sc.next());//guardamos fecha de nacimiento en variable
		ahora = LocalDate.now();//guardamos fecha actual en variable
		cumple18= nacimiento.plusYears(18);//Guardamos la fecha en la que cumplirá 18 años
		dias2 = ChronoUnit.DAYS.between(cumple18, ahora);//sacamos los días, meses y años restantes o de diferencia entre
		meses2 = ChronoUnit.MONTHS.between(cumple18, ahora);//la fecha en la que cumpla 18 y la actual
		anios = ChronoUnit.YEARS.between(cumple18, ahora);
		//Con ChronoUnit.XXXX.between() podemos hayar cuanto hay entre una fecha y otra en cualquier forma (minutos, horas,
		//días, la que sea...)
		System.out.println((ChronoUnit.YEARS.between(nacimiento, ahora)>=18)?"Es mayor de edad desde hace: " + dias2 + " días, "
				+ meses2 + " meses y " + anios + " años.":"Es menor de edad. Le faltan: " + dias2 + " días, "
				+ meses2 + " meses y " + anios + " años.");
		//comparamos con ternario e imprimimos resultado
		

		
		/*8. Analiza el siguiente trozo de código y explica cada línea añadiendo comentarios de código (2,5 puntos: h):  

       byte b = 42; 

       char c = 'a'; 

        short s = 1024;

        int i = 50000;

        float f = 5.67f;

        double d = .1234;         

        double result = (f * b) + (i / c) - (d * s);

        System.out.println("resultado = " + result);


	- Responde a las siguientes preguntas y pon un ejemplo:

	¿Cuándo se produce un desbordamiento de una variable? ¿Qué ocurre?	
	
	Se produce cuando se hace una conversión explícita entre dos variables de diferente tamaño, yendo de una variable de 
	mayor tamaño a una de uno menor. Si el contenido coge en la varible menor no ocurre, pero si el contenido es mayor a la
	capacidad del contenedor menor, ocurre el desbordamiento y entonces hay pérdida de precisión.
	
	¿Es lo mismo desbordamiento que truncamiento?
	
	No, el desbordamiento es lo anteriormente explicado, el truncamiento es cuando se pierden, por ejemplo, los decimales.
	*/
		
	       byte b = 42; 

	       char c = 'a'; 

	        short s = 1024;

	        int i = 50000;

	        float f = 5.67f;

	        double d = .1234;         

	        double result = (f * b) + (i / c) - (d * s); 
	        //(f*b)=float; (i/c)=int; (d*s)=double
	        //(f * b) + (i / c) - (d * s)=double

	        System.out.println("resultado = " + result); //se imprime el resultado en double.
		
		
		
		/*	9. Utiliza un operador unario sobre el mes de una fecha introducida por consola (formato yyyy-MM-dd hh:mm,
	 donde M=mes y m=minuto). Explica el uso de dicho operador en todas sus variantes.  Relaciona, si es posible,
	  el operador unario elegido con funciones de alguno de los tipos de datos utilizados en la fecha-hora. Después, 
	  muestra el número de días, minutos y segundos transcurridos desde la fecha introducida y tu fecha de cumpleaños 
	  (2,5 puntos: g)*/
	        
	        //declaramos todas las variables
		LocalDateTime cumple, fecha;
		int mes;
		long dias, minutos, segundos;
		//solicitamos la fecha
		System.out.println("Introduce la fecha que desees(yyyy-mm-ddThh:mm:ss)"); //ej de como introducirlo: 2007-12-03T10:15:30.
		fecha = LocalDateTime.parse(sc.next());//se guarda la fecha
		//.parse() convierte una cadena de caracteres en la fecha/hora que se solicite
		mes = fecha.getMonthValue();//se extrae el mes en formato número
		mes++;//Operador unario posfijo, que suma 1 después de su uso
		++mes; //operador unario prefijo, que suma 1 antes de su uso
		/*Hay varios tipos de operadores unarios
		 * mes++, mes--, ++mes y --mes son operadores unarios de suma y resta posfijos y prefijos.*/
		cumple = LocalDateTime.of(2024, 03, 20, 16, 26);//Guardamos fecha de cumple
		dias = ChronoUnit.DAYS.between(fecha, cumple);//Sacamos los días, minutos y segundos restantes
		minutos = ChronoUnit.MINUTES.between(fecha, cumple);
		segundos = ChronoUnit.SECONDS.between(fecha, cumple);
		System.out.println("Hasta mi cumple faltan: " + dias + " días " + minutos + " minutos, y " + segundos + " segundos.");
		//imprimimos resultado
		

		sc.close();//cerramos el flujo de entrada
	        
	        
		/*10. Comenta todo el código resultante de responder a las siguientes preguntas (1 punto, i)*/
	
	}

}
