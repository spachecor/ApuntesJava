package tematres.repasoExamen;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Programa que tiene un menú con las siguientes opciones: 
 * 1º- Cálculo del precio de billetes de autobús tanto individuales como para grupos. Se solicitará por consola una serie de datos necesarios para realizar las 
 * operaciones para ofrecer los resultados dichos anteriormente.
 * 2º- Comprobación de si dos números introducidos por el usuario son amigos
 * 3º- Activar la depuración. Si el usuario lo selecciona, se activará la depuración en el programa y saldrá un mensaje indormativo
 * 4º- Salir del programa. Si el usuario lo pulsa se saldrá del programa.
 * @author selene
 * @version 1.0
 * 
 */
public class ExamenAnioPasado {

	public static void main(String[] args) {
		//inicializamos el logger
		Logger logger = Logger.getLogger(ExamenAnioPasado.class.getName());
		//desactivamos el logger por defecto
		logger.setUseParentHandlers(false);
		//Inicializamos nuestro manejador por consola propio y lo añadimos al logger
		ConsoleHandler consoleHandler = new ConsoleHandler();
		logger.addHandler(consoleHandler);
		//seleccionamos el nivel a partir del cual se registrarán los logs
		consoleHandler.setLevel(Level.CONFIG);
		logger.setLevel(Level.CONFIG);
		//creamos un formateador para la fecha y hora del log
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		//inicializamos con constantes los valores que corresponderán al menú
		final int BILLETES=1, NUMEROS_AMIGOS=2, ACTIVAR_DEPURACION=3, EXIT=4;
		//inicializamos una variable a la que asignaremos el valor del menú que el usuario seleccione. De manera predefinida, colocamos la opción que sale del
		//menú
		int opcion=4;
		//declaramos una variable a la que posteriormente asignaremos el texto en la opcion de activar/desactivar la depuración para que coincida con la 
		//ación a realizar (activar si está desactivada y desactivar si está activada)
		String depuracion;
		//inicializamos la variable depuracionActivada para poder controlar si está la depuración activada o no. Tambien inializamos la variable salir con valor
		//false, que cambiará de valor cuando el usuario pulse la opción de salir
		boolean depuracionActivada = false, salir=false;
		//abrimos flujo de entrada
		Scanner sc = new Scanner(System.in);
		//metemos el menú en un bucle do/while, para que se repita cada vez que salimos de una opción hasta que se elija la opción de salir
		do {
			//controlamos el texto que aparecerá en la opción 3-Activar/desactivar depuración con la variable depuracionActivada
			if(depuracionActivada==true)depuracion="Desactivar depuración";
			else depuracion="Activar depuracion";
			//pedimos al usuario la opción del menú que desee
			System.out.println(String.format("Selecciona la opción del menú que necesites. Para ello, introduce el nº coincida con la opción deseada:"
					+ "\n1-Viajar en bus\n2-Números amigos\n3-%s\n4-Salir", depuracion));
			//controlamos con un bloque try/catch que el valor introducido sea un entero. Si no es así, volverá a preguntar el valor
			try {
				//guardamos la opción en la variable previamente asignada
				opcion = sc.nextInt();
			}catch (InputMismatchException ee) {
				if(depuracionActivada==true) logger.log(Level.WARNING, "Se ha introducido un caracter incorrecto a la hora de usar el menú. "+LocalDateTime.now().format(formateador).toString()+
						"El usuario ha introducido un caracter diferente a un nº por consola y ha generado una excepcion tipo InputMismatchException");
				System.out.println("El carácter introducido es incorrecto, por faovr, introduzca un nº. Pulse 0 + intro para volver al menú.");
				sc.next();
				//reseteamos scanner
				sc.next();
				continue;
			}
			//para hacer el menú usamos la estructura switch
			switch (opcion) {
			//primera opcion
			case BILLETES:
				//inicializamos las constantes con los valores que no van a variar
				final int LIMITE_KM_UNO=200, LIMITE_KM_DOS=400;
				final double RECARGO_MAYOR_DOSCIENTOS=0.03, DESCUENTO_MAYOR_CUATROCIENTOS=0.15, DESCUENTO_MAYOR_TRES=0.1;
				//inicializamos el precio, dandole el valor del precio mínimo, que se actualizará según si se cumples las condiciones definidas abajo
				double precio=20;
				//inicializamos los km del trayecto y el nº de viajeros, que se pedirá por consola posteriormente al usuario
				int trayecto=0, viajeros=0;
				//usamos un bucle do/while para solicitar ambos datos a el usuario y seguirlos pidiendo hasta que sean correctos
				do {
					//controlamos con excepciones que se introduzca un nº. Se repetirá hasta que se haya introducido un nº correcto
					try {
						System.out.println("¿Cuántos kilómetros tiene el trayecto a realizar?");
						trayecto = sc.nextInt();
						System.out.println("¿Cuántas personas van a viajar?");
						viajeros = sc.nextInt();
						if(depuracionActivada==true) logger.log(Level.INFO, String.format("Se han introducido los siguientes datos: %d km de trayecto y %d "
								+ "viajeros", trayecto, viajeros)+LocalDateTime.now().format(formateador).toString());
						
					}catch (InputMismatchException e) {
						System.out.println("El carácter introducido es incorrecto, por faovr, introduzca un nº. Pulse 0 + intro para continuar.");
						sc.next();
						sc.next();
						if(depuracionActivada==true) logger.log(Level.WARNING, "Se ha introducido un caracter incorrecto a la hora de usar el menú"+Level.INFO, 
								LocalDateTime.now().format(formateador).toString()+
								"El usuario ha introducido un caracter diferente a un nº por consola y ha generado una excepcion tipo InputMismatchException");
						continue;
					}
					//mensajes para cuando los valores no sean correctos
					if(viajeros<=0) {
						System.out.println("El nº de viajeros tiene que ser igual o superior a 1. Pulse 0 + Intro para volverlo a intentar");
						sc.next();
						if(depuracionActivada==true) logger.log(Level.INFO, "El usuario ha introducido alguno de los valores igual o inferior a cero, y es "
								+ "incorrecto"+LocalDateTime.now().format(formateador).toString());
					}
					if(trayecto<=0) {
						System.out.println("El nº de kilómetros del trayecto tiene que ser igual o superior a 1. Pulse 0 + Intro para volverlo a intentar");
						sc.next();
						if(depuracionActivada==true) logger.log(Level.INFO, "El usuario ha introducido alguno de los valores igual o inferior a cero, y es incorrecto"
								+LocalDateTime.now().format(formateador).toString());
					}
					if(trayecto<=0&&viajeros<=0) {
						System.out.println("El nº de viajeros y el nº de kilómetros del trayecto tienen que ser igual o superior a 1. Pulse 0 + Intro para"
								+ " volverlo a intentar");
						sc.next();
						if(depuracionActivada==true) logger.log(Level.INFO, "El usuario ha introducido alguno de los valores igual o inferior a cero, y es incorrecto"
								+LocalDateTime.now().format(formateador).toString());
					}
				}while(trayecto<=0||viajeros<=0);
				//multiplicamos el precio mínimo por el nº de viajeros
				precio*=viajeros;
				//aplicamos los descuentos con estructuras if/else
				if(trayecto>=LIMITE_KM_UNO) {
					precio +=(trayecto-LIMITE_KM_UNO)*RECARGO_MAYOR_DOSCIENTOS;
					if(depuracionActivada==true) logger.log(Level.INFO, String.format("El usuario tiene recargo de %f euros por km excedido de %d", RECARGO_MAYOR_DOSCIENTOS, LIMITE_KM_UNO)+LocalDateTime.now().format(formateador).toString());
					if(trayecto>=LIMITE_KM_DOS) {
						precio*=(1-DESCUENTO_MAYOR_CUATROCIENTOS);
						if(depuracionActivada==true) logger.log(Level.INFO, "El usuario tiene un descuento del "+(DESCUENTO_MAYOR_CUATROCIENTOS*100)+" por ciento por superar los "+LIMITE_KM_DOS+
								" km. "+LocalDateTime.now().format(formateador).toString());
					}
				}
				if(viajeros>=3) {
					precio*=(1-DESCUENTO_MAYOR_TRES);
					if(depuracionActivada==true) logger.log(Level.INFO, "El usuario tiene un descuento del "+(DESCUENTO_MAYOR_TRES*100)+" por ciento por ser más de 3 viajeros "+LocalDateTime.now().format(formateador).toString());
				}
				//mostramos el precio al usuario, distinguiendo entre grupos (>1) e individual(==1)
				if(viajeros>1) {
					System.out.println(String.format("El precio total es de %.2f euros.", precio));
					System.out.println(String.format("Cada billete sale a %.2f euros.", precio/viajeros));
					if(depuracionActivada==true) logger.log(Level.INFO, "El precio individial es "+precio/viajeros+" euros y el precio total es "+precio+" euros "+LocalDateTime.now().format(formateador).toString());
				}
				if(viajeros==1) {
					System.out.println(String.format("El precio total es de %.2f euros.", precio));
					if(depuracionActivada==true) logger.log(Level.INFO, "El precio total es "+precio+" euros "+LocalDateTime.now().format(formateador).toString());
				}
				//volvemos al menu
				System.out.println("Pulsa 0 + Intro para volver al menú");
				if(depuracionActivada==true) logger.log(Level.CONFIG, "Vuelta al menú"+LocalDateTime.now().format(formateador).toString());
				sc.next();
				break;
			case NUMEROS_AMIGOS:
				//declaramos las variables donde se almacenarán los números introducidos por el usuario
				String numeroUno, numeroDos;
				//declaramos los array donde introduciremos los números despedazados (usados en linea 124 y linea 139 para comprobar que son nºs
				String[] comprobadorUno, comprobadorDos;
				//inicializamos valiable booleana para controlar si el usuario introdujo un nº o no
				boolean comprobadorNumeros = false;
				//inicializamos dos variables a las que iremos sumando los divisores. Comienzan en 1 pues todos los nºs son divisibles entre 1
				long resultadoUno=1, resultadoDos=1;
				System.out.println("Introduce 2 números para comprobar si son números amigos:");
				//bucle do/while para asegurarnos de que el dato introducido por el usuario es un nº
				do {
					//se solicita 1º nº
					System.out.println("Primer nº: ");
					//se guarda en la variable
					numeroUno = sc.next();
					//se guarda el nº1 despedazado en un array
					comprobadorUno = numeroUno.split("");
					//con un bucle for comprobamos el nº por partes y aseguramos que sea un nº
					for(int i=0;i<comprobadorUno.length;i++) {
						//usando la tabla ASCII determinamos si es o no un nº. Si lo es el comprobadorNumeros sera true, si no será false
						if(comprobadorUno[i].charAt(0)>='0'&&comprobadorUno[i].charAt(0)<='9')comprobadorNumeros = true;
						else {
							comprobadorNumeros = false;
							if(depuracionActivada==true) logger.warning("1º numero introducido incorrectamente, el caracter no es un nº"+LocalDateTime.now().format(formateador).toString());
						}
					}
					//mensaje para cuando el comprobadorNumeros sea false
					if(comprobadorNumeros==false) {
						System.out.println("El carácter introducido es incorrecto, por faovr, introduzca un nº. Pulse 0 + intro para continuar.");
						sc.next();
					}
					//no saldremos del bucle do/while hasta que el comprobadorNumeros no sea true
				}while(comprobadorNumeros==false);
				//repetimos el proceso con el 2º nº
				do {
					System.out.println("Segundo nº: ");
					numeroDos = sc.next();
					comprobadorDos = numeroDos.split("");
					for(int i=0;i<comprobadorDos.length;i++) {
						if(comprobadorDos[i].charAt(0)>='0'&&comprobadorDos[i].charAt(0)<='9')comprobadorNumeros = true;
						else {
							comprobadorNumeros = false;
							if(depuracionActivada==true) logger.warning("2º numero introducido incorrectamente, el caracter no es un nº"+LocalDateTime.now().format(formateador).toString());
						}
					}
					if(comprobadorNumeros==false) {
						System.out.println("El carácter introducido es incorrecto, por faovr, introduzca un nº. Pulse 0 + intro para continuar.");
						sc.next();
					}
				}while(comprobadorNumeros==false);
				//usamos un bucle for para encontrar todos los divisores de los nºs introducidos. Usamos la mitad de éstos, pues encontraremos divisores entre 
				//la mitad del nº y el 0, no existirán divisores mayores a la mitad del nº
				for(int i=(Integer.parseInt(numeroUno)/2)+1;i>1;i--) {
					//cuando se encuentre un divisor, se suma al resultadoUno
					if(Integer.parseInt(numeroUno)%i==0)resultadoUno+=i;
				}
				//repetimos con el numeroDos
				for(int i=(Integer.parseInt(numeroDos)/2)+1;i>1;i--) {
					if(Integer.parseInt(numeroDos)%i==0)resultadoDos+=i;
				}
				//mostramos el resultado, tanto si son amigos como si no. Si la suma de los divisores de numeroUno(resultadoUno) es igual al numeroDos y
				//viceversa, será nº amigo. Si no, no
				if(resultadoUno==Integer.parseInt(numeroDos)&&resultadoDos==Integer.parseInt(numeroUno)) {
					System.out.println(String.format("%s y %s son nº amigos", numeroUno, numeroDos));
					if(depuracionActivada==true) logger.info(numeroUno+numeroDos+" son nº amigos "+LocalDateTime.now().format(formateador).toString());
				}	
				else {
					System.out.println(String.format("%s y %s no son nº amigos", numeroUno, numeroDos));
					if(depuracionActivada==true) logger.info(numeroUno+numeroDos+" no son nº amigos "+LocalDateTime.now().format(formateador).toString());
				}
				//mensaje de salida al menú
				System.out.println("Comprobación terminada. Pulsa 0 + Intro para volver al menú.");
				if(depuracionActivada==true) logger.log(Level.CONFIG, "Vuelta al menú"+LocalDateTime.now().format(formateador).toString());
				sc.next();
				break;
			case ACTIVAR_DEPURACION:			
				//con una estructura if/else variamos el texto en la opción del menú de activar/desactivar depuración. También mostramos el mensaje
				if(depuracionActivada==false) {
					depuracionActivada=true;
					System.out.println("Se ha activado la depuración.");
				}
				else {
					depuracionActivada=false;
					System.out.println("Se ha desactivado la depuración.");
				}
				break;
			case EXIT:
				//cuando el usuario elija esta opción, salir pasará a ser true y saldremos del bucle que encierra al menú
				salir=true;
				if(depuracionActivada==true) logger.log(Level.CONFIG, "Ha salido del menú"+LocalDateTime.now().format(formateador).toString());
				break;
				//si se introduce una opción fuera del menú, nos dará mensaje y nos reconducirá de nuevo al menú
			default:
				System.out.println("Opción incorrecta. Pulse 0 + Intro para volver al menú.");
				sc.next();
				if(depuracionActivada==true) logger.warning("Elegida opcion incorrecta en el menu");
				break;
			}
		}while(salir==false);
		//mensaje para cuando se sale del menú
		System.out.println("Has salido del menú");

		sc.close();
	}

}
