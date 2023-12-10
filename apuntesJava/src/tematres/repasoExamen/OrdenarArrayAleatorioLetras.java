package tematres.repasoExamen;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Programa que solicita al usuario la longitud de un array, que se generará de manera aleatoria con la longitud proporcionada y que
 * posteriormente será ordenado también de manera automática. Todo esto controlado por excepciones y depurado con logger
 * @author selene
 * @version 1.0
 */
public class OrdenarArrayAleatorioLetras {

	public static void main(String[] args) {
		//declaraciones, asignaciones e inicializaciones de todas las variables necesarias
		int longitud;
		String letrasInicial="ABCDEFGHJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz", aux;
		String[] letras = letrasInicial.split("");		
		boolean correcto=true;
		//inicializamos el logger
		Logger logger = Logger.getLogger(OrdenarArrayAleatorioLetras.class.getName());
		//desactivamos el manejador por defecto
		logger.setUseParentHandlers(false);
		//declaramos un nuevo manejador consoleHandler y fileHandler
		ConsoleHandler consoleHandler;
		FileHandler fileHandler;
		try {
			//los instanciamos
			fileHandler = new FileHandler("logs.txt");
			consoleHandler = new ConsoleHandler();
			//los añadimos al logger
			logger.addHandler(fileHandler);
			logger.addHandler(consoleHandler);
			//ajustamos niveles
			logger.setLevel(Level.ALL);
			fileHandler.setLevel(Level.ALL);
			consoleHandler.setLevel(Level.WARNING);
		}catch(SecurityException | IOException e) {
			e.printStackTrace();
		}
		//solicitamos la longitud al usuario y la guardamos en la variable asignada
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("Introduce la longitud del array aleatorio de letras en mayúsculas y minúsculas a ordenar");
				longitud = sc.nextInt();
				String[] array=new String[longitud];
				//generamos los valores del array según la longitud proporcionada
				for(int i=0;i<longitud;i++) {
					array[i]=letras[(int)Math.round(Math.random()*(letras.length-1))];
				}
				logger.info("Generado el array. Está desordenado");
				//mostramos el array desordenado
				for(int i=0; i<array.length;i++) {
					System.out.print(array[i]+" ");
				}
				//ordenamos el array
				for(int i=longitud-1; i>=0;i--) {
					for(int j=0;j<longitud-1;j++) {
						if(letrasInicial.indexOf(array[j])>letrasInicial.indexOf(array[j+1])) {
							aux=array[j];
							array[j]=array[j+1];
							array[j+1]=aux;
						}
					}
				}
				System.out.println();
				//mostramos el array ordenado
				for(int i=0; i<array.length;i++) {
					System.out.print(array[i]+" ");
				}
				logger.info("El array está ordenado");
				//si no ha habido problemas, correcto=true y podemos salir del bucle
				correcto=true;
				//capturamos la excepción si se introduce otra cosa que no sea un nº
			}catch(InputMismatchException e) {
				System.out.println("Debe introducir un nº. Pulse 0 + Intro para volverlo a intentar");
				sc.next();
				sc.next();
				correcto=false;
				logger.warning("No se ha introducido un caracter correcto");
			}
		}while(correcto==false);



		sc.close();
	}

}
