package tematres.ejercicios;

public class Ejercicio3_15 {

	public static void main(String[] args) {
		/* Escribe un programa Java que muestre todos los números de 'Armstrong' existentes entre 1 y 600. 
		 * Un número es de 'Armstrong' si la suma de cada dígito elevado al número de dígitos del número da como 
		 * resultado el propio número.

			Por ejemplo el 153 es un número de 'Armstrong':  153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )*/
		int num = 0;
		
		ARREGLAR EN CASA BABE
		
		for(int i = 0; i<600; i++) {
			if(String.valueOf(num).length()==2) {
				if(Math.pow(num/10, 2)+Math.pow(num%10, 2)==num)
					System.out.println("El número " + num + " es número de Armstrong");
			}else if(String.valueOf(num).length()==3) {
				if(Math.pow(num/100, 3)+Math.pow((num%10)/10, 3)+Math.pow(num%10, 3)==num)
					System.out.println("El número " + num + " es número de Armstrong");
			}
			num++;
		}
		
		
	}

}
