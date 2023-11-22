package temados.repasoExamen.simulacro;
/**
 * Ejercicio en el que generamos 3 números aleatorios y mostramos el carácter ASCII que le corresponde a 
 * cada uno
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		/* 	5. Genera 3 números enteros positivos aleatorios comprendidos entre el 32 y el 126 
		 * (inclusives). Después muestra el carácter ASCII que corresponde a cada uno de ellos (ce: e).
	 * */
		
		//Generamos números aleatorios con el método estático de la clase Math Math.ramdon(). Hacemos
		//casting para que corresponda con el tipo de dato entero
		int num1 = (int)Math.random()*(127-32)+32;
		int num2 = (int)Math.random()*(127-32)+32;
		int num3 = (int)Math.random()*(127-32)+32;
		
		//Usamos el método estático String.format para mostrar como caracteres los números aleatorios
		System.out.println(String.format("número 1: %c, número 2: %c, número 3: %c.", num1, num2, num3));

	}

}
