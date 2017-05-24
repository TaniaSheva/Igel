package Logging;
import java.io.IOException;
import java.util.logging.*;


public class HelloWorld {

	private static Logger LOGGER = Logger.getLogger(HelloWorld.class.getName());
	
	public static void main (String[]args) {
		
		setUpLogger();
		LOGGER.info("Hello World");
		System.out.println("Hello World");
	}
	
	private static void setUpLogger(){
								
		Handler handler = null;
		
		try {
			handler = new FileHandler("Log.log", true);
			LOGGER.addHandler(handler);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		handler.setFormatter(new SimpleFormatter());
		handler.setLevel(java.util.logging.Level.INFO);
		
	}

}
