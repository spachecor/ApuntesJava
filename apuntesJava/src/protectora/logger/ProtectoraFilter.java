package protectora.logger;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
/**
 * Clase de utilidad que contiene un filtro personalizado para el logger
 * @author selene
 * @version 1.0
 */
public class ProtectoraFilter implements Filter{

	@Override
	/**
	 * Método que filtra el nivel en el que los mensajes con se registrarán
	 */
	public boolean isLoggable(LogRecord arg0) {
		//no se registrartán los mensajes de nivel CONFIG
		if(arg0.getLevel()==Level.CONFIG)return false;
		return true;
	}
	
}
