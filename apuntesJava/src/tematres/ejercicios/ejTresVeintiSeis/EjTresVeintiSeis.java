package tematres.ejercicios.ejTresVeintiSeis;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Programa que es un juego de dados, en el que los jugadores "tiran" dos dados cada uno y se compara la puntuación obtenida
 * entre ambos. Gana el que consigue mayor puntuación. El juego se repite mientras haya empates. Controlado y depurado
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class EjTresVeintiSeis {

	public static void main(String[] args) throws SecurityException, IOException {
		//declaramos las variables del nombre de cada jugador
		String jugador1, jugador2, pieza;
		//inicializamos los valores máximos y mínimos de los dados
		final int MAX=6, MIN=1;
		//declaramos las variables que utilizaremos para guardar el resultado de los dados y de las tiradas de cada jugador
		int dado1, dado2, resultadoJugUno, resultadoJugDos;
		//inicializamos con valor false la variable de comprobación para continuar o salir del bucle según los jugadores
		//empaten o no empaten
		boolean comprobacion = false;
		//abrimos flujo de entrada
		Scanner sc = new Scanner(System.in);
		//solicitamos el nombre del jugador1
		System.out.println("Jugador 1, introduzca su nombre: ");
		//lo recogemos en la variable
		jugador1 = sc.nextLine();
		//saludamos a jugador1 y solicitamos el nombre de jugador2
		System.out.println(String.format("Bienvenid@ %s. \nJugado 2, introduzca su nombre: ", jugador1));
		//recogemos nombre de jugador2
		jugador2 = sc.nextLine();
		//saludamos
		System.out.println("Bienvenid@ " + jugador2);
		//Iniciamos el logger
		Logger logger = Logger.getLogger("EjTresVeintiSeis");
		//Inicializamos el FileHandler para que los logs vayan a un fichero
		FileHandler fileHandler = new FileHandler("logs.text");
		//Inicializamos un nuevo handler para consola
		ConsoleHandler consoleHandler = new ConsoleHandler();
		//Deshabilitamos el Handler predeterminado
		logger.setUseParentHandlers(false);
		//agregamos al logger los dos nuevos handler
		logger.addHandler(consoleHandler);
		logger.addHandler(fileHandler);
		//seleccionamos los niveles en cada uno
		consoleHandler.setLevel(Level.WARNING);
		fileHandler.setLevel(Level.INFO);
		do {
			//iniciamos el turno del jug1
			System.out.println(jugador1 + " es tu turno, empezemos el juego, pulsa 0 + intro para tirar los dados.");
			//hacemos esto para que el juego vaya paso a paso
			sc.next();
			//Tomamos los milisegundos justo cuando empieza el turno del jug1
			long tiempoJugada1 = System.currentTimeMillis();
			//tomamos también el momento exacto
			LocalDateTime jugada1 = LocalDateTime.now();
			//generamos los valores de los dados de manera aleatoria
			dado1 =(int) Math.round(Math.random()*(MAX-MIN+1)+MIN);
			dado2 =(int) Math.round(Math.random()*(MAX-MIN+1)+MIN);
			//sumamos el valor de los dados para conseguir el resultado total
			resultadoJugUno = dado1+dado2;
			//mostramos resultado 
			System.out.println("Puntuación de " + jugador1 + ": " + resultadoJugUno);
			//guardamos los milisegundos al final del turno
			long finJugada1 = System.currentTimeMillis();
			//guardamos todos los datos de la partida en el log
			logger.log(Level.INFO, "Nombre de jugador= " + jugador1);
			//log del dado1
			switch (dado1) {
			case 1:
				logger.log(Level.INFO, "Resultado del dado1= negros");
				break;
			case 2:
				logger.log(Level.INFO, "Resultado del dado1= rojos");
				break;
			case 3:
				logger.log(Level.INFO, "Resultado del dado1= J");
				break;
			case 4:
				logger.log(Level.INFO, "Resultado del dado1= Q");
				break;
			case 5:
				logger.log(Level.INFO, "Resultado del dado1= K");
				break;
			case 6:
				logger.log(Level.INFO, "Resultado del dado1= As");
				break;
			}
			//log del dado2
			switch (dado2) {
			case 1:
				logger.log(Level.INFO, "Resultado del dado2= negros");
				break;
			case 2:
				logger.log(Level.INFO, "Resultado del dado2= rojos");
				break;
			case 3:
				logger.log(Level.INFO, "Resultado del dado2= J");
				break;
			case 4:
				logger.log(Level.INFO, "Resultado del dado2= Q");
				break;
			case 5:
				logger.log(Level.INFO, "Resultado del dado2= K");
				break;
			case 6:
				logger.log(Level.INFO, "Resultado del dado2= As");
				break;
			}
			logger.log(Level.INFO, "Resultado del jugador=" + String.valueOf(resultadoJugUno));
			logger.log(Level.INFO, "Fecha y hora de la jugada del jugador= " + jugada1.toString());
			logger.log(Level.INFO, "Tiempo en minisegundos que dura la jugada= " + String.valueOf(finJugada1-tiempoJugada1));
			//repetimos todo el proceso con el jug2(incluida la depuración)
			System.out.println(jugador2 + " empezemos tu turno, pulsa 0 + intro para tirar los dados.");
			sc.next();
			long tiempoJugada2 = System.currentTimeMillis();
			LocalDateTime jugada2 = LocalDateTime.now();
			dado1 =(int) Math.round(Math.random()*(MAX-MIN+1)+MIN);
			dado2 =(int) Math.round(Math.random()*(MAX-MIN+1)+MIN);
			resultadoJugDos = dado1+dado2;
			System.out.println("Puntuación de " + jugador2 + ": " + resultadoJugDos);
			long finJugada2 = System.currentTimeMillis();			
			logger.log(Level.INFO, "Nombre de jugador= " + jugador1);
			//log del dado1
			switch (dado1) {
			case 1:
				logger.log(Level.INFO, "Resultado del dado1= negros");
				break;
			case 2:
				logger.log(Level.INFO, "Resultado del dado1= rojos");
				break;
			case 3:
				logger.log(Level.INFO, "Resultado del dado1= J");
				break;
			case 4:
				logger.log(Level.INFO, "Resultado del dado1= Q");
				break;
			case 5:
				logger.log(Level.INFO, "Resultado del dado1= K");
				break;
			case 6:
				logger.log(Level.INFO, "Resultado del dado1= As");
				break;
			}
			//log del dado2
			switch (dado2) {
			case 1:
				logger.log(Level.INFO, "Resultado del dado2= negros");
				break;
			case 2:
				logger.log(Level.INFO, "Resultado del dado2= rojos");
				break;
			case 3:
				logger.log(Level.INFO, "Resultado del dado2= J");
				break;
			case 4:
				logger.log(Level.INFO, "Resultado del dado2= Q");
				break;
			case 5:
				logger.log(Level.INFO, "Resultado del dado2= K");
				break;
			case 6:
				logger.log(Level.INFO, "Resultado del dado2= As");
				break;
			}
			logger.log(Level.INFO, "Resultado del jugador=" + String.valueOf(resultadoJugDos));
			logger.log(Level.INFO, "Fecha y hora de la jugada del jugador= " + jugada2.toString());
			logger.log(Level.INFO, "Tiempo en minisegundos que dura la jugada= " + String.valueOf(finJugada2-tiempoJugada2));
			//comparamos resultados, si es igual, nos lanza una excepcion personalizada
			if(resultadoJugUno!=resultadoJugDos) {
				//si no es igual compara cual es mayor y lo muestra por pantalla
				if(resultadoJugUno>resultadoJugDos) {
					System.out.println(String.format("Felicidades %s, has ganado con %d puntos.", jugador1, resultadoJugUno));
				}else {
					System.out.println(String.format("Felicidades %s, has ganado con %d puntos.", jugador2, resultadoJugDos));
				}
				//también cambiamos el valor de comprobación a true, para guardar que ambos resultados son diferentes entre sí
				//y que ya puede salir del bucle
				comprobacion=true;
			}else {
				//lanzamos la excepcion y la mostramos
				ControlEmpateException control = new ControlEmpateException("Se ha producido un empate, ambos jugadores han obtenido " + resultadoJugUno + " puntos.");
				System.out.println(control);
				//agregamos a la depuración información del empate
				logger.log(Level.INFO, "Empate entre ambos jugadores");
			}

		}while(comprobacion==false);
		//decimos que el juego ha terminado
		System.out.println("El juego ha terminado");
		//cerramos el flujo de entrada
		sc.close();
	}

}

