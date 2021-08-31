package Logging_;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Log_method1 {

	public static void main(String[] args)
	{

		
		Logger logger= Logger.getLogger(Log_method1.class.getName());
			

		
		
		logger.log(Level.INFO, "logging: {0} ", "hii");
        logger.log(Level.SEVERE, "logging: {0} ", "alert");
        
        logger.log(Level.INFO, "logging: {0} {1}", new Object[] { "first message", "2 msg" });
               
     logger.log(Level.WARNING, "logging: {0} {1} {2}", new Object[] { "one", "two", "three" });
                
 
	}
}