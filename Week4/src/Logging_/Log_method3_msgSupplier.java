package Logging_;

import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.LogRecord;

public class Log_method3_msgSupplier {

	

		public static void main(String[] args)
		{

		
			Logger logger= Logger.getLogger(Log_method3_msgSupplier.class.getName());
					
			  LogRecord record1 = new LogRecord(Level.INFO, "Msg 1");
                     
			  LogRecord record2 = new LogRecord(Level.INFO,"Msg 2");
                      

				logger.log(record1);
				logger.log(record2);
					                   
							 
			
			
                    
		}
	}
