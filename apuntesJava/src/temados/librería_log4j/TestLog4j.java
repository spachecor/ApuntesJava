package temados.librería_log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLog4j {
	
	//Es una variable inicializada de tipo logger
	private static final Logger logger = LogManager.getLogger(TestLog4j.class.getName());
	
	public static void main(String[] args) {
		logger.error("Mensaje para la consola");//Sirve para mostrar en consola un error
	}

}
