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
	public String format(LogRecord arg0) {
		return arg0.getThreadID()+"::"+arg0.getSourceClassName()+"::"+arg0.getSourceMethodName()+"::"+new Date(arg0.getMillis())+"::"+arg0.getMessage()+"\n";
	}

}
