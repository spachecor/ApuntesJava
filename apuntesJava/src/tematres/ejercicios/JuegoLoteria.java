package tematres.ejercicios;

import java.util.Scanner;

public class JuegoLoteria {

	public static void main(String[] args) {
		/* Juego de lotería*/
		
		String numIntento;
		boolean correcto=true;
		//Generamos el nº de loteria aleatroiamente entre dos valores para asegurar que contiene 5 cifras
		int max=99999, min=10000;
		int numLoteria = (int) Math.floor(Math.random()*(max-min+1)+min);
		Scanner sc = new Scanner(System.in);
		
		//Usamos un bucle do-while porque al menos debe entrar una vez. La condición del bucle usa una variable tipo boolean 
		// denominada "correcto" en la que seguirá repitiéndose hasta que la variable sea true.
		do {
			System.out.println("Introduzca su número de Lotería para comprobar si está premiado: ");
			numIntento = sc.next();
			//metemos la cadena introducida en un array de Strings para poder evaluar carácter a carácter posteriormente
			String[] numeros = numIntento.split("");
			
			//1º comprobación: Se comprueba que la longitud de la cadena sea 5, si no lo es se dice al usuario que no lo es y 
			//marcamos la variable correcto como false para que vuelva a iniciar el bucle do-while y a pedir el nº
			if(numIntento.length()==5) {
				//usamos un bucle for para recorrer el array y realizar comprobaciones (eso ya dentro del bucle, el bucle sólo
				//contempla en la condición el recorrer el array
				for(int i = 0;i<5;i++) {
					//2º comprobación: Se comprueba que cada uno de los caracteres del array sea un nº. Si alguno no lo es, la 
					//variable correcto pasa a ser false(para que el bucle do-while se siga repitiendo)
					if(numeros[i].charAt(0)>='0' && numeros[i].charAt(0)<='9') {
						//Marcamos correcto como true para que cuando termine la comprobación del nº acertado salga del do-while
						correcto=true;
					}else {
						System.out.println("Número incorrecto. Recuerde que el número está compuesto únicamente por números. No"
								+ " puede contener ningún otro carácter que no sea un número entero. Pulse 0 + intro para volver "
								+ "a intentarlo.");
						sc.next();
						//marcamos correcto como false para que vuelva a preguntar un nº que cumpla los requisitos
						correcto=false;
						//usamos break para que salga del bucle, dado que no es necesario comprobar nada más. Esté en el punto en el que esté, si ha detectado
						//un carater no correcto no debe revisar más, debe volver a pedir el nº
						break;
					}	
				}
				//Una vez hemos comprobado los requisitos, comprobamos si el nº introducido coincide con el premiado. Agregamos antes de la condición de 
				//el nº pedido == nº premiado que correcto sea true. Esto nos evita una excepción, pues si no lo hacemos, Integer.parseInt(numIntento) no
				//contendrá un nº, sino que contendrá una cadena de caracteres diferentes a nº que no podrán pasar a int y tendremos una excepción.
				if(correcto==true && numLoteria==Integer.parseInt(numIntento)) {
					System.out.println("¡FELICIDADES! Ha sido usted el ganador de la lotería con el nº " + numLoteria);
				}else {
					if(correcto==true) System.out.println("Lo sentimos, el nº introducido no ha sido premiado. Gracias por participar.");
				}
				
			}else {
				System.out.println("Número incorrecto. Recuerde que el número tiene una longitud de 5 números. Pulse 0 + intro para"
						+ " volver a intentarlo.");
				sc.next();
				//Si la lonfitud no es correcta, correcto valdrá false y volverá a pedir el nº
				correcto=false;
			}						
		}while(correcto==false);
		
		sc.close();
	}

}
