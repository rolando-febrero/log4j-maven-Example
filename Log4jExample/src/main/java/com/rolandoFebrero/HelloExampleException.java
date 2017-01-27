package com.rolandoFebrero;

import org.apache.log4j.Logger;

public class HelloExampleException {

final static Logger logger = Logger.getLogger(HelloExampleException.class);
	
	public static void main(String[] args) {
	
		HelloExampleException obj = new HelloExampleException();
		
		try{
			obj.divide();
		}catch(ArithmeticException ex){
			logger.error("Something wrong!!!, you are getting an exception ", ex);
		}
		
		
	}
	
	private void divide(){
		
		int i = 3 / 0;

	}
	
}