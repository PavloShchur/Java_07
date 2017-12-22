package logSystem;

import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileHandler {
	
	static Logger logger = Logger.getLogger("logSystem");

	public static void main(String[] args) throws SecurityException, IOException {

		java.util.logging.FileHandler fileHandler = 
				new java.util.logging.FileHandler("%h/myapp_%g.log", 1000, 4);
		
		fileHandler.setFormatter(new SimpleFormatter());
		
		logger.addHandler(fileHandler);

	}

}
