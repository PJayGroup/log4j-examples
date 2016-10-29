/**
 * 
 */
package org.pjaygroup.loggerdemo;

import org.apache.log4j.Logger;

/**
 * @author Vijay Konduru
 *
 */
public class HelloLog4jDemo {

	final static Logger logger = Logger.getLogger(HelloLog4jDemo.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloLog4jDemo obj = new HelloLog4jDemo();
		obj.runLoggingMethod("KUMAR");
	}

	private void runLoggingMethod(String parameter) {
		if (logger.isDebugEnabled()) {
			logger.debug("This is debug : " + parameter);
		}

		if (logger.isInfoEnabled()) {
			logger.info("This is info : " + parameter);
		}

		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.error("This is Error message with exception:: " + parameter, new NullPointerException("message"));
		logger.fatal("This is fatal : " + parameter);
	}

}
