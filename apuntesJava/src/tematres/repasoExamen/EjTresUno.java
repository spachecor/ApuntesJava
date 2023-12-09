package tematres.repasoExamen;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Programa que pide 3 números enteros y muestra cuál es mayor
 * @author selene
 * @version 1.0
 */
public class EjTresUno {

	public static void main(String[] args) {
		//inicializamos el trazador
		Logger logger = Logger.getLogger(EjTresUno.class.getName());
		//deshabilitamos el manejador de consola por defecto
		logger.setUseParentHandlers(false);
		//LO HACEMOS FUERA DEL TRY/CATCH TENIENDO EN CUENTA QUE SI LO HICIESEMOS TOD0 DENTRO, LA VARIABLE NACERÍA Y MORIRÍA AHÍ, NO SE PODRÍA USAR FUERA DEL TRY
		//Lo declaramos fuera del bloque try por el tema del ámbito
		ConsoleHandler consoleHandler;
		FileHandler fileHandler;
		try {
			//Instanciamos un objeto tipo ConsoleHandler para el manejador por consola(declarado fuera del bloque try)
			consoleHandler = new ConsoleHandler();
			//lo añadimos
			logger.addHandler(consoleHandler);
			//Repetimos con un manejador de tipo FileHandler
			fileHandler = new FileHandler("log.txt");
			logger.addHandler(fileHandler);
			//asignamos los niveles a partir de los cuales se nos mostrarán los mensajes
			consoleHandler.setLevel(Level.WARNING);
			fileHandler.setLevel(Level.FINEST);
		}catch(IOException e) {
			//si hubiese problemas, se muestra la pila
			e.printStackTrace();
		}
		//declaramos una variable auxiliar que nos ayudará a ordenar los nºs. También inicializamos dos variables auxiliares para poder controlar los datos
		//introducidos incorrectamente
		int aux, falloEnPrimero=0, falloEnSegundo=0;
		//inicializamos el array de nºs a ordenar
		int[] numeros = new int[3];
		//abrimos flujo de entrada
		Scanner sc = new Scanner(System.in);
		//solicitamos los nº y los guardamos en las diferentes posiciones del array. Controlamos que se introduzca un nº con excepciones
		System.out.println("Introduzca 3 números. \nPrimer nº");
		try {
			logger.log(Level.CONFIG, "Variable 1º introducida correctamente. Su valor es: " + numeros[0]);
			numeros[0] = sc.nextInt();
		}catch (InputMismatchException e) {
			//Si salta la excepción, se controla y se devuelve un mensaje de error. A su vez se cuenta el fallo con la variable.
			System.out.println("El/los caracter/es introducido/s no es/son correcto/s. Se procederá a continuar pero con los dos nº siguientes.");
			falloEnPrimero++;
			logger.log(Level.INFO, "1º nº introducido incorrectamente");
			//reseteamos el scanner
			sc.next();
		}
		System.out.println("Segundo nº");
		try {
			logger.log(Level.CONFIG, "Variable 2º introducida correctamente. Su valor es: " + numeros[1]);
			numeros[1] = sc.nextInt();
		}catch (InputMismatchException e) {
			//Si salta la excepción, se controla y se devuelve un mensaje de error. A su vez se cuenta el fallo con la variable. Tenemos en cuenta si el 1º nº
			//ha sido introducido correctamente o no a la hora de devolver el mensaje
			if(falloEnPrimero>0) {
				System.out.println("Ni el primero nº ni el segundo han sido introducidos correctamente, si se introduce correctamente el"
						+ " tercero, únicamente se mostrará éste.");
				falloEnSegundo++;
				//reseteamos el scanner
				sc.next();
			}else {
				System.out.println("El/los caracter/es introducido/s no es/son correcto/s. Se procederá a continuar pero usando sólo el tercer y primer nº.");
				falloEnSegundo++;
			}
			logger.log(Level.INFO, "2º nº introducido incorrectamente");
		}
		System.out.println("Tercer nº");
		try {
			logger.log(Level.CONFIG, "Variable 3º introducida correctamente. Su valor es: " + numeros[2]);
			numeros[2] = sc.nextInt();
		}catch (InputMismatchException e) {
			logger.log(Level.INFO, "3º nº introducido incorrectamente");
			//Si salta la excepción, se controla y se devuelve un mensaje de error. A su vez se cuenta el fallo con la variable. Tenemos en cuenta si el 1º nº
			//y el 2º nº han sido introducidos correctamente o no a la hora de devolver el mensaje
			if(falloEnPrimero>0&&falloEnSegundo==0)System.out.println("El/los caracter/es introducido/s no es/son correcto/s."
					+ " Se mostrará el segundo valor introducido como máximo, pues ha sido el único válido.");
			else if(falloEnPrimero==0&&falloEnSegundo>0)System.out.println("El/los caracter/es introducido/s no es/son correcto/s."
					+ " Se mostrará el primer valor introducido como máximo, pues ha sido el único válido.");
			else if(falloEnPrimero==0&&falloEnSegundo==0)System.out.println("El/los caracter/es introducido/s no es/son correcto/s."
					+ " Se hará La comprobación con el 1º y 2º nº.");
			else {
				//en caso de que todos los nº hayan sido introducidos incorrectemente, aumentamos el valor de la variable falloEnPrimero para no imprimir el nº 
				//mayor posteriormente
				System.out.println("El/los caracter/es introducido/s no es/son correcto/s. Dado que todos los valores han sido inválidos, no hay ningún tipo"
						+ " de comprobación.\nFin del programa");
				falloEnPrimero++;
				logger.log(Level.WARNING, "TODOS LOS VALORES INVÁLIDOS");
			}
		}
		//usamos un bucle for anidado para recorrer el array e irlo modificando para ordenarlo. Dará tantas pasadas como sea su longitud menos 1
		for(int i=0;i<numeros.length-1;i++) {
			//el bucle for de dentro sirve para ordenar el array
			for(int j=0;j<numeros.length-1;j++) {
				//sólo modificará si el nº a la izquierda es superior al de la derecha
				if(numeros[j]>numeros[j+1]) {
					//guardamos el numero de referencia en la variable
					aux = numeros[j];
					//decimos que el nº	de referencia ahora es el que está a su derecha, que es inferior
					numeros[j] = numeros[j+1];
					//ahora colocamos en la posición del nº de la derecha el nº que habíamos guardado previamente, que era el nº mayor
					numeros[j+1] = aux;
				}
			}
		}
		//Comprobamos que haya habido al menos un valor correcto introducido. En el caso de que así sea, mostramos el de la última posición, pues este es el
		//mayor.
		if(!(falloEnPrimero>1&&falloEnSegundo>0)) System.out.println("El nº mayor es: " + numeros[numeros.length-1]);
		//cerramos el flujo de entrada
		sc.close();
	}

}
