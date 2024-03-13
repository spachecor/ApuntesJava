package protectora.logger;

import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
/**
 * Clase de utilidad que contiene un formato personalizado para el logger
 * @author selene
 * @version 1.1
 */
public class ProtectoraFormatter extends Formatter{

	@Override
	/**
	 * Método con el que asignamos el formato con el que se imprimirá nuestro mensaje de depuración
	 * @param arg0 objeto del tipo logrecord
	 */
	public String format(LogRecord arg0) {
		return "Ubicación: "+arg0.getSourceClassName()+" - Método: "+arg0.getSourceMethodName()+" - Instante en el que ocurre: "+new Date(arg0.getMillis())+" - Mensaje: "+arg0.getMessage()+"\n";
	}

}
