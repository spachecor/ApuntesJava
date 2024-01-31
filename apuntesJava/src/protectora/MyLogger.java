package protectora;

import java.util.logging.LogManager;
import java.util.logging.Logger;
/**
 * Clase de utilidad para construir un logger a partir del nombre de la clase que lo requiere
 * @author selene
 * @version 1.0
 */
public class MyLogger {
	/**
	 * Método estático que general el logger a través del nombre de la clase que lo solicita
	 * @param clase Es el nombre de la clase que utiliza el método
	 * @return
	 */
	public static Logger getLogger(String clase) {
		return LogManager.getLogManager().getLogger(clase);
	}
}
