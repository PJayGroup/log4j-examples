/**
 * 
 */
package org.pjaygroup.loggerdemo;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * @author Vijay
 *
 */
public class HelloLog4jDemo {

	final static Logger logger = Logger.getLogger(HelloLog4jDemo.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloLog4jDemo demo = new HelloLog4jDemo();
		demo.runLog4jMethod("VIJAY");
	}
	
	public void runLog4jMethod(String parameter){
		// if we change logger level using program or properties we might not see few logging according to order
		// Will not log debug method since debug level is less than info, can achieve this by making change to rootLogger log4j config file (Xml or Properties)
		logger.setLevel(Level.INFO);
/*		if(logger.isInfoEnabled()){
			logger.info("This is Info message:: " + parameter);
		}
		if(logger.isDebugEnabled()){
			logger.debug("This is Debug message:: " + parameter);
		}*/
		
		logger.info("This is Info message:: " + parameter);
		logger.debug("This is Debug message:: " + parameter);
		logger.warn("This is Warn message:: " + parameter);
		logger.error("This is Error message:: " + parameter);
		logger.error("This is Error message with exception:: " + parameter, new NullPointerException("my message"));
		logger.fatal("This is Fatal message:: " + parameter);
	}

}
