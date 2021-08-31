package Logging_;

import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.LogRecord;
public class Log_method4_log_record {
	
	

	public static void main(String[] args)
	{

	
		Logger logger= Logger.getLogger(Log_method3_msgSupplier.class.getName());
				
		
		Supplier<String> StrSupplier= () -> new String("Logger messages");
			
		
		logger.log(Level.SEVERE,StrSupplier);
		
		 logger.log(Level.SEVERE, new RuntimeException("Error"), StrSupplier);
                   
		 
		
		
                
	}

}
