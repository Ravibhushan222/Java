package Logging_;
import java.util.logging.Level;
import java.util.logging.Logger;

public class log_method {
	

	

		public static void main(String[] args)
		{

			
			Logger logger= Logger.getLogger(log_method .class.getName());
				
			logger.info("This is message 1");
			
			logger.log(Level.INFO, "hello ");
			logger.log(Level.WARNING, "alert");
		}
	}
