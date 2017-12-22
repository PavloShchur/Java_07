package logSystem;

import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
	
	static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static void main(String[] args) {
		
		Handler handler = new ConsoleHandler();
		
		Formatter formatter = new SimpleFormatter();
		
		handler.setFormatter(formatter);
		
		logger.addHandler(handler);
		
		logger.setLevel(Level.FINEST);
		
		logger.log(Level.SEVERE, "{0} SEVERE", "Java");
		
		logger.log(Level.INFO, "INFO");
		
		logger.log(Level.FINE, "FINE");
		
		logger.log(Level.FINEST, "FINEST");
		
		doWork();

	}
	static void doWork(){
		
		logger.setLevel(Level.ALL);
		
		logger.entering("logSystem", "doWork");
		
		logger.log(Level.WARNING, "logSystem");
		
		logger.exiting("logSystem", "doWork");
		
		
		
	}

}
