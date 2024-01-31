package protectora;
import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class MyFilter implements Filter{

	@Override
	public boolean isLoggable(LogRecord record) {
		//no se registrarán mensajes del nivel CONFIG
		if(record.getLevel()==Level.CONFIG)return false;
		return true;
	}

}
