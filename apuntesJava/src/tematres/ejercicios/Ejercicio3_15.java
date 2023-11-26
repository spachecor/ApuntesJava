package tematres.ejercicios;

public class Ejercicio3_15 {

	public static void main(String[] args) {
		/* Escribe un programa Java que muestre todos los números de 'Armstrong' existentes entre 1 y 600. 
		 * Un número es de 'Armstrong' si la suma de cada dígito elevado al número de dígitos del número da como 
		 * resultado el propio número.

			Por ejemplo el 153 es un número de 'Armstrong':  153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )*/

		int num=1, longitud, auxiliar, contador, acumulado=0;
		
		//usamos un bucle for para pasar por todos los nº del 0 al 600
		for(int i = 0; i<=600; i++) {
			
			//contador y acumulador deben resetearse a 0 cada vez que volvamos a iniciar el buble for
			contador=0;
			acumulado=0;
			//guardamos la longitud del nº
			longitud = String.valueOf(num).length();
			//guardamos cada nº en un array de strings(usaremos tanto los valores como las posiciones)
			String[] descompuesto = String.valueOf(num).split("");
			
			//usamos un bucle while para hacer la comprobación, en el que sólo entrará mientras que la longitud del
			//nº no haya llegado al nº de veces que se ha repetido el bucle(controlado por un contador)
			while(contador!=longitud) {
				//inicializamos un auxiliar, que tomará el valor del nº en la posición que determine el contador (comienza
				//en cero, por lo que irá recorriéndo desde cero hasta la longitud del número)
				auxiliar = Integer.parseInt(descompuesto[contador]);
				//ahora reutilizamos el auxiliar para elevar el valor que tenía en la línea anterior a la longitud del nº
				auxiliar =(int) Math.pow(auxiliar, longitud);
				//utilizamos el acumulador (acumulado) para ir sumando los valores de auxiliar en cada vuelta
				acumulado+=auxiliar;
				//aumentamos de uno en uno el valor del contador, para que en las siguientes vueltas el nº que nos de el
				//array de string sea el siguiente
				contador++;
			}
			//sólo si la longitud del nº es diferente de 1 y si el acumulado en el acumulador y el nº corresponden,
			//se imprime el nº
			
			if(acumulado==num&&longitud!=1)System.out.println(num);
			num++;
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*longitud= String.valueOf(num).length();
			int centenas=(int) Math.pow(num/100, longitud);
			int decenas= (int) Math.pow((num%100)/10, longitud);
			int unidades = (int) Math.pow(num%10, longitud);
			
			if(longitud==2&&num==decenas+unidades)System.out.println(num);
			if(longitud==3&&num==centenas+decenas+unidades)System.out.println(num);
			num++;
			
			
			
		}*/
	}

}
