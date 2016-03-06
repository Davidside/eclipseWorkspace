package log4jExample;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class log4jExample {

	static Logger logger = LogManager.getLogger(log4jExample.class.getName());
	
	public static void main (String args[]) {
		
		if(logger.isInfoEnabled()) {
			logger.trace("Sample trace message");
		}
		
		if(logger.isDebugEnabled()) {
			logger.debug("Sample debug message");
		}
		
		if(logger.isInfoEnabled()) {
			logger.info("Sample info message");
		}
		
		logger.warn("Sample warn message");
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");
		
		try {
			throw new ArithmeticException();
		}catch(ArithmeticException e) {
			logger.error("Sorry, something is wrong: " + e);
		}
		
	}
}
