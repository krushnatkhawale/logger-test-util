package logutil.slf4j;

import org.slf4j.Logger;

/***
 * Log util class for logging different types of logs
 * @author Wosimosi
 */
public class LogUtil {
	
	/**
	 * Logs given message and exception to debug mode
	 * @param logger logger used to log
	 * @param message message to be logged
	 * @param exception exception to be logged
	 */
	public static void debug(final Logger logger, final String message, final Throwable exception) {
		logger.debug(message, exception);
	}

	/**
	 * Logs given message and exception to debug mode if debug mode is enabled
	 * @param logger logger used to log
	 * @param message message to be logged
	 * @param exception exception to be logged
	 */
	public static void debugIfEnabled(final Logger logger, final String message, final Throwable exception) {
		if(logger.isDebugEnabled()){
			debug(logger, message, exception);
		}
	}
}