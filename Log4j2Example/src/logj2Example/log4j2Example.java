package logj2Example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j2Example {
	
	private static final Logger logger = LogManager.getLogger(log4j2Example.class);
	
	public static void main(String[] args) {
		logger.trace("Trace test message");
		logger.error("Error test message");

	}

}
