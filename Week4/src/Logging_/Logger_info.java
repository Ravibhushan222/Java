package Logging_;
import java.util.logging.Logger;
import java.util.logging.Logger;
import java.util.function.Supplier;

public class Logger_info {

	

		public static void main(String[] args)
		{

			
			Logger logger= Logger.getLogger( Logger_info .class.getName());

			
			logger.info("This is message 1");
			logger.info("This is message 2");
			
			
			Supplier<String> StrSupplier  = () -> new String("Logger logs");
			 logger.info(StrSupplier);
          
	}
}