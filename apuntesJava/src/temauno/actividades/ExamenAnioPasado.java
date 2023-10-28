package temauno.actividades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Programa que realiza las actividades del año pasado del examen
 * @author selenepachecorodriguez
 * @version
 */
public class ExamenAnioPasado {

	public static void main(String[] args) {
		// 7. Sumar el dígito más a la derecha de un número entero
        // al propio valor de dicho número. Por ejemplo, si el número
        // contiene el valor 463 después de la operación contendrá el
        // valor 466 ( 463 + 3 )(1,5 puntos: e)
		
		int n;
		n = 1563;
		System.out.println("El nº resultante es: " + (n+(n%10)));
		
		// 8. Una variable entera contiene un número de mes.
        // Comprobar si corresponde a un mes de 30 días (2,5 puntos: f).
		
		int mes;
		mes = 6;
		System.out.println(mes==4?"Abril, tiene 30 días":(mes==6?"Junio, tiene 30 días":(mes==9?
				"Septiembre, tiene 30 días":(mes==11?"Noviembre, tiene 30 días":"No tiene 30 días"))));
		
		// 9. Comprobar si un número entero de cuatro cifras es capicúa.
        // Un número es capicúa si se puede leer igual de derecha a
        // izquierda que de izquierda a derecha (2,5 puntos: h)
		
		int capicua;
		capicua = 2472;
		System.out.println((capicua/1000==capicua%10 && (capicua%100)/10==(capicua%1000)/100)?"Es capicua":
			"No es capicua");
		
		// 10. Utiliza un operador unario sobre el mes de una fecha
        // introducida por consola. Explica el uso de dicho operador
        // en todas sus variantes. Después, muestra el número de días
        // transcurridos desde la fecha introducida y tu fecha de
        // cumpleaños (2,5 puntos: g)

		LocalDate fecha, cumpleaños;
		int mesModificado, cuenta;
		long nDiasCumple;
		cumpleaños = LocalDate.of(2023, 03, 20);
		Scanner sc = new Scanner (System.in);
		System.out.println("Por favor, introduce una fecha (yyyy-mm-dd)");
		fecha = LocalDate.parse(sc.next());
		mesModificado = fecha.getMonthValue();
		cuenta = 4 + mesModificado++;//En este caso primero sumará el nº con el nº del mes y luego aumentará 
		//en 1 su valor
		cuenta = 4 + ++mesModificado;//En este otro, primero aumentará el valor de mesModificado y luego hará
		//la suma. Igual ocurrirá con --mesModificado y mesModificado--.
		nDiasCumple = (int) ChronoUnit.DAYS.between(fecha, cumpleaños);
		System.out.println(nDiasCumple);

		
		sc.close();
		
	}

}
