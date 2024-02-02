package protectora.logger;

import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;
/**
 * Clase de utilidad que contiene un manejador personalizado para el logger
 * @author selene
 * @version 1.0
 */
public class ProtectoraHandler extends StreamHandler{

	@Override
	public synchronized void close() throws SecurityException {
		super.close();
	}

	@Override
	public synchronized void flush() {
		super.flush();
	}

	@Override
	public synchronized void publish(LogRecord arg0) {
		super.publish(arg0);
	}
	
}
