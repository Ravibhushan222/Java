package Logging_;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Log_method2_except {

	

	
		public static void main(String[] args)
		{

			
			Logger logger
				= Logger.getLogger( Log_method2_except .class.getName());

						

			logger.log(Level.SEVERE, "logg_ing:",new RuntimeException("Error"));
					
			logger.log(Level.WARNING, "logging: ",new Exception("Exception"));
					
		}
	}
