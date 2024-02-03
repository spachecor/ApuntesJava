package protectora.logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
/**
 * Clase de utilidad para construir un logger a partir del nombre de la clase que lo requiere
 * @author selene
 * @version 1.1
 */
public class ProtectoraLogger {
	/**
	 * Método estático que general el logger personalizado a través del nombre de la clase que lo solicita
	 * @param clase Es el nombre de la clase que utiliza el método
	 * @return
	 */
	public static Logger getLogger(String clase) {
		Logger logger = Logger.getLogger(clase);
		try {
			//tomamos un nuevo objeto LogManager, luego reiniciamos las propiedades de registro y leemos la configuración de registro en nuestro fichero protectoraLogging.propierties
			LogManager.getLogManager().readConfiguration(new FileInputStream("src/protectoraLogging.properties"));
		}catch(SecurityException|IOException e) {
			//imprimimos la pila si se captura una excepcion
			e.printStackTrace();
		}
		//asignamos el nivel
		logger.setLevel(Level.FINE);
		//creamos el manejador de consola
		ConsoleHandler consoleHandler = new ConsoleHandler();
		//agregamos le formato al consoleHandler
		consoleHandler.setFormatter(new ProtectoraFormatter());
		//añadimos el consolehandler
		logger.addHandler(consoleHandler);
		//añadimos el manejador personalizado
		logger.addHandler(new ProtectoraHandler());
		try {
			//nuevo filehandler para fichero con limitación de tamaño y numero de registros de mensajes
			Handler fileHandler = new FileHandler(System.getProperty("user.home")+"/git/protectora/protectora/logs/logger.log", 2000, 5);
			//le asignamos un nuevo formato
			fileHandler.setFormatter(new ProtectoraFormatter());
			//le asignamos el filtro
			fileHandler.setFilter(new ProtectoraFilter());
			//agregamos nuestro fileHandler al logger
			logger.addHandler(fileHandler);
		}catch(SecurityException|IOException e) {
			e.printStackTrace();
		}
		return logger;
	}
}
