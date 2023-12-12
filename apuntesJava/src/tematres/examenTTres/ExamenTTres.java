package tematres.examenTTres;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Programa que tiene la función de ser un menú. Tenemos 4 opciones: 
 * -Viajar en bus: que realiza una comprobación según la longitud del trayecto y los viajeros y ofrece
 * 	el precio del billete y el total
 * -Numeros primos: que realiza la comprobación de los numeros primos desde un numero introducido por el
 * 	usuario y 1 y muestra los primos encontrados
 * -Activar/desactivar depuración: que activa o desactiva la depuración
 * -Salir: que sale del menú y finaliza el programa(devuelve una lista de opciones elegidas por consola y al SO le devuelve la
 * más elegida)
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class ExamenTTres {

	public static void main(String[] args) {
		//inicializamos las constantes que determinarán la opción elegida en el menú
		final int VIAJAR_BUS=1, NUMEROS_PRIMOS=2, DEPURACION=3, SALIR=4;
		//variable cuyo valor será pedido al usuario. También contadores que contarán las veces que se elige
		//la opción a la que estén vinculadas del menú
		int opcion, contadorOpUno=0, contadorOpDos=0, contadorOpTres=0;
		//depuracionActivada determina si está o no activada la depuración. salir determina si se sale o
		//no del menú
		boolean depuracionActivada=false, salir=false;
		//se abre el flujo de entrada
		Scanner sc = new Scanner(System.in);
		//inicializamos nuestro logger
		Logger logger = Logger.getLogger(ExamenTTres.class.getName());
		//deshabilitamos el manejador por defecto
		logger.setUseParentHandlers(false);
		//inicializamos nuestro propio manejador de fichero
		FileHandler fileHandler;
		//debemos capturar una posible excepción comprobada a la hora de instanciar nuestro fileHandler
		try {
			fileHandler = new FileHandler("logs.txt");
			//añadimos el nuevo manejador a nuestro logger
			logger.addHandler(fileHandler);
			//seleccionamos el nivel de nuestro logger y de nuestro manejador
			logger.setLevel(Level.ALL);
			fileHandler.setLevel(Level.SEVERE);
		}catch(SecurityException | IOException e) {
			e.printStackTrace();
		}
		//creamos un formateador para formatear al fecha y hora que introducimos en el logger
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		//utilizamos un bucle do/while para repetir el menú hasta que se pulse salir
		do {
			//usamos operador ternario para determinar si el texto en el menú será uno u otro segun este o
			//no la depuracion activada
			String depuracion = (depuracionActivada==true)?"Desactivar depuración":"Activar depuración";
			//mostramos el menu
			System.out.println(String.format("Seleccione una opción dentro del menú:\n\n1-Viajar en bus\n2-Números primos"
					+ "\n3-%s\n4-Salir", depuracion));
			//recogemos la opcion seleccionada por el usuario
			opcion = sc.nextInt();
			//utilizamos estructura switch para el menu
			switch(opcion) {
			case VIAJAR_BUS:
				contadorOpUno++;
				//mensaje depuración logger
				if(depuracionActivada==true)logger.severe("El usuario ha elegido la opcion 'viajar en bus'. "
						+LocalDateTime.now().format(formateador));
				//inicializamos las constantes según las condiciones del problema
				final double LIMITE_DOSCIENTOS=200, LIMITE_CUATROCIENTOS=400, RECARGO=0.03, DESCUENTO_QUINCE=0.15, DESCUENTO_DIEZ=0.1;
				//inicializamos el precio y declaramos las variables que serán pedidas al usuario. También una variable para el
				//cálculo del precio individual
				double precio = 20, trayecto, viajeros, precioIndividual;
				//se piden y guardan las variables anteriores
				System.out.println("¿Cuál es la distancia del trayecto?");
				trayecto = sc.nextInt();
				System.out.println("¿Cuántos vais a viajar?");
				viajeros = sc.nextInt();
				//mensaje depuración logger
				if(depuracionActivada==true)logger.severe("El usuario ha determinado que son "+trayecto+" km de"
						+ " trayecto y "+viajeros+" viajeros. "+LocalDateTime.now().format(formateador));
				//se multiplica el precio por los viajeros, pues el precio es por billere
				precio*=viajeros;
				//se usan estructuras if para aplicar las condiciones que pide el problema
				if(trayecto>LIMITE_DOSCIENTOS)precio+=((trayecto-LIMITE_DOSCIENTOS)*RECARGO);
				if(trayecto>LIMITE_CUATROCIENTOS)precio*=(1-DESCUENTO_QUINCE);
				if(viajeros>=3)precio*=(1-DESCUENTO_DIEZ);
				//se calcula el precio individual
				precioIndividual=precio/viajeros;
				//si sólo viaja 1 persona, se muestra el precio
				if(viajeros==1) {
					System.out.println(String.format("Tu billete sale a %.2f euros", precio));
					if(depuracionActivada==true)logger.severe(String.format("El precio es de %.2f euros", precio)
							+LocalDateTime.now().format(formateador));
				}
				//si viajan varios, se muestra el precio total y el individual
				if(viajeros>1) {
					System.out.println(String.format("El total de todos los billetes sale a %.2f euros", precio));
					System.out.println(String.format("Cada billete sale a %.2f euros", precioIndividual));
					//mensaje depuración logger
					if(depuracionActivada==true)logger.severe(String.format("El precio total es de %.2f euros y el precio"
							+ " individual es de %.2f euros ", precio, precioIndividual)
							+LocalDateTime.now().format(formateador));
				}
				//salida al menú
				System.out.println("Comprobación terminada, pulsa 0 + Intro para volver al menú");
				sc.next();
				//mensaje depuración logger
				if(depuracionActivada==true)logger.severe("'Viajar en bus' terminado, vuelta al menú "
						+LocalDateTime.now().format(formateador));
				break;
			case NUMEROS_PRIMOS:
				contadorOpDos++;
				//mensaje depuración logger
				if(depuracionActivada==true)logger.severe("El usuario ha elegido la opción 'Numeros primos' "
						+LocalDateTime.now().format(formateador));
				//declaramos la variable numero que será pedida al usuario
				int numero;
				//declaramos dos variables acumulador para guardar los divisores y los numeros primos
				String acumulador, acumuladorDos="";
				//declaramos dos arrays para guardar los divisores y los numeros primos
				String[] numeros, numerosDos;
				//pedimos y guardamos el numero
				System.out.println("Introduce un número entre 1 y 500. Se mostrarán los números primos entre el introducido y"
						+ " el 1.");
				numero=sc.nextInt();
				//mensaje depuración logger
				if(depuracionActivada==true)logger.severe("El usuario ha introducido el número "+numero+" "
						+LocalDateTime.now().format(formateador));
				//usamos dos bucles for anidados para ir revisando los divisores de cada numero. El primero
				//fija los numeros a revisar sus divisores.
				for(int i=numero;i>0;i--) {
					acumulador="";
					//el segundo saca los divisores y los almacena en el acumulador previamente inicializado.
					for(int j=1;j<=i;j++) {
						if(i%j==0)acumulador=acumulador+String.valueOf(i/j)+" ";
					}
					numeros = acumulador.split(" ");
					//se cumprueba si el numero es primo, para ello, si se han almacenado únicamente 2 numeros
					//(el mismo y el 1) será primo, si no no lo será
					if(numeros.length==2)acumuladorDos=acumuladorDos+String.valueOf(i)+" ";
				}
				//imprimimos los primos
				System.out.print("Los números primos entre "+numero+" y el 1 son: ");
				numerosDos=acumuladorDos.split(" ");
				//usamos bucle for para recorrer el array e imprimir los primos
				for(int i=0;i<numerosDos.length-1;i++) {
					System.out.print(numerosDos[i]+" ");
				}
				System.out.println();
				//mensaje depuración logger
				if(depuracionActivada==true)logger.severe("Han salido un total de "+numerosDos.length
						+" numeros primos. "+LocalDateTime.now().format(formateador));
				System.out.println("Pulse 0 + Intro para volver al menú");
				sc.next();
				break;
			case DEPURACION:
				contadorOpTres++;
				//mensaje depuración logger
				if(depuracionActivada==true)logger.severe("El usuario ha elegido la opción 'Activar/Desactivar"
						+ " depuración'. "+LocalDateTime.now().format(formateador));
				//usamos estructura if/else para determinar según esté la depuración, si activada o desactivada,
				//si se activa o se desactiva.
				if(depuracionActivada==false) {
					depuracionActivada=true;
					System.out.println("Se ha activado la depuración");
					if(depuracionActivada==true)logger.severe("Se ha activado la depuración "+LocalDateTime.now().format(formateador));
				}
				else {
					if(depuracionActivada==true)logger.severe("Se ha desactivado la depuración "+LocalDateTime.now().format(formateador));
					System.out.println("Se ha desactivado la depuración");
					depuracionActivada=false;
				}
				System.out.println("Acción terminada. Pulse 0 + Intro para volver al menú");
				sc.next();
				break;
			case SALIR:
				//mensaje depuración logger
				if(depuracionActivada==true)logger.severe("El usuario ha elegido la opción 'Salir del "
						+ "programa. "+LocalDateTime.now().format(formateador));
				//Se muestra por consola un resumen de las opciones elegidas
				System.out.println("Resumen de las opciones elegidas durante la ejecución del programa:");
				System.out.println("1-Viajar en bus: "+contadorOpUno+" veces elegida.");
				System.out.println("2-Numeros primos: "+contadorOpDos+" veces elegida.");
				System.out.println("3-Activar/Desactivar depuración: "+contadorOpTres+" veces elegida.");
				//mensaje depuración logger
				if(depuracionActivada==true)logger.severe("Se procede a salir del programa tras mostrar el resumen"
						+ " de opciones elegidas "+LocalDateTime.now().format(formateador));
				if(contadorOpUno>contadorOpDos&&contadorOpUno>contadorOpTres) {
					//mensaje depuración logger
					if(depuracionActivada==true)logger.severe("La opción más elegida ha sido 1-Viaje en bus "
							+LocalDateTime.now().format(formateador));
					//salimos del programa deolviendo al SO la opción más elegida
					System.exit(1);
				}
				else if(contadorOpDos>contadorOpUno&&contadorOpDos>contadorOpTres) {
					//mensaje depuración logger
					if(depuracionActivada==true)logger.severe("La opción más elegida ha sido 2-Numeros primos "
							+LocalDateTime.now().format(formateador));
					//salimos del programa deolviendo al SO la opción más elegida
					System.exit(2);
				}
				else if(contadorOpTres>contadorOpUno&&contadorOpTres>contadorOpDos) {
					//mensaje depuración logger
					if(depuracionActivada==true)logger.severe("La opción más elegida ha sido 3-Activar/Desactivar"
							+ " depuración "+LocalDateTime.now().format(formateador));
					//salimos del programa deolviendo al SO la opción más elegida
					System.exit(3);
				}
				else {
					//mensaje depuración logger
					if(depuracionActivada==true)logger.severe("No hay una sola opción más elegida o directamente"
							+ " no hay ninguna "+LocalDateTime.now().format(formateador));
					//salimos del programa devolviendo al SO que no hay opción más elegida
					System.exit(0);
				}
				salir=true;
				break;
			default:
				//mensaje depuración logger
				if(depuracionActivada==true)logger.severe("No se ha seleccionado una opción válida "
						+LocalDateTime.now().format(formateador));
				System.out.println("Debes elegir una opción dentro del menú. Pulsa 0 + Intro para volver al menú.");
				sc.next();
				break;
			}
		}while(salir==false);
		//se cierra el flujo de entrada
		sc.close();
	}
}