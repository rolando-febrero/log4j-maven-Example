package com.rolandoFebrero;

import org.apache.log4j.Logger;

public class HelloExample {
	
	final static Logger logger = Logger.getLogger(HelloExample.class);

	public static void main(String[] args) {
		
		HelloExample obj = new HelloExample();
		obj.runMe("Log4j Example");
		
	}
	
	private void runMe(String parameter){
		
		if(logger.isDebugEnabled()){
			logger.debug("This will be logged as DEBUG : " + parameter);
		}
		
		if(logger.isInfoEnabled()){
			logger.info("This will be logged as INFO : " + parameter);
		}
		
		logger.warn("This will be logged as WARN : " + parameter);
		logger.error("This will be logged as ERROR : " + parameter);
		logger.fatal("This will be logged as FATAL: " + parameter);
		
	}
	
}
