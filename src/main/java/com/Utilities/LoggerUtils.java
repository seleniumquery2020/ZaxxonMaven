package com.Utilities;

import org.apache.log4j.Logger;

public class LoggerUtils {
	
	
	static Logger log = Logger.getLogger("FrameworkExecution");
	
	
	public static void logMessage(String message){
		log.info(message);
	}
	
	public static void logDebugMessage(String message){
		log.debug(message);
	}
	
	public static void logErrorMessage(String message){
		log.error(message);
	}
	
	
	public static void logFatalMessage(String message){
		log.fatal(message);
	}
	

}
