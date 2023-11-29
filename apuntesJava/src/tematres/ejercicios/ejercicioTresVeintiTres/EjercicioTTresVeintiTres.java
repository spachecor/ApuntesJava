package tematres.ejercicios.ejercicioTresVeintiTres;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Solución propuesta a la actividad 3.23. Programa que es una calculadora simple que suma, resta, multiplica y divide. Controlado con
 * excepciones y depurado con logger
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class EjercicioTTresVeintiTres {

	public static void main(String[] args) throws SecurityException, IOException {
		
		final int SUMA=0, RESTA=1, MULTI=2, DIVI=3, EXIT=4;
		int num1, num2, seleccion;
		Scanner sc = new Scanner(System.in);
		System.out.println("Seleccione la operación que desea realizar: ");
		System.out.println("0 - SUMA \n1 - RESTA \n2 - MULTIPLICACION \n3 - DIVISION \n4 - SALIR");
		seleccion = sc.nextInt();
		System.out.println("Introduzca ahora los operandos: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		//creamos el logger para nuestro programa
		Logger logger = Logger.getLogger(EjercicioTTresVeintiTres.class.getName());
		
		//instanciamos el manejador tipo fichero
		FileHandler handler = new FileHandler("logs.txt");
		//añadimos el nuevo manejador al registro
		logger.addHandler(handler);
		//asignamos el nivel al manejador de consola
		logger.setLevel(Level.FINE);
		//asignamos el nivel al manejador de fichero
		handler.setLevel(Level.WARNING);
		
		//creamos el menu con swicth
		switch (seleccion) {
		case SUMA:
			//como hemos creado el método suma y está en privado, dará una excepción de tipo IllegalAccessException, y la controlamos con
			//el bloque try-catch
			try {
				System.out.println(AuxiliarEjTresVeintiTres.suma(num1, num2));
			}catch (Exception e) {
				System.out.println(num1+num2);
				//registramos con el trazador el fallo
				logger.log(Level.SEVERE, "Se ha producido una excepcion comprobada de tipo IllegalAccessException");
				//ponemos finally para que nos ejecute algo sí o si, ya sea que haya saltado la excepción como que no
			}finally {
				System.out.println("suma realizada");
			}
			break;
		case RESTA:
			System.out.println(num1-num2);
			//registramos con el trazador que la operación se ha resulto exitosamente
			logger.log(Level.INFO, "Resultado de la operacion de resta {0}",num1-num2);
			break;
		case MULTI:
			System.out.println(num1*num2);
			//registramos con el trazador que la operación se ha resulto exitosamente
			logger.log(Level.INFO, "Se produjo la operacion");
			break;
		case DIVI:
			//controlamos con excepción no comprobada que el divisor no sea cero
			try {
				System.out.println(num1/num2);
			}catch (ArithmeticException e) {
				System.out.println("El divisor no puede ser cero");
				//registramos con el trazador que ocurrió una excepcion
				logger.log(Level.WARNING, "Se ha producido una excepcion no comprobada de tipo ArithmeticException");
			}
			break;
		case EXIT:
			break;
		default:
			System.out.println("Opción inválida. Vuelva a intentarlo.");
		}
		//registramos con el trazador que se salió del menú
		logger.info("Ha salido del menu existosamente");
		System.out.println("Saliste del menu");
		sc.close();
	}

}
