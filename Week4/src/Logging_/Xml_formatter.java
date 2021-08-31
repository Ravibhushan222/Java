package Logging_;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.XMLFormatter;

public class Xml_formatter {
	

		
		public static void main(String[] args) throws Exception
		{

			
			XMLFormatter xmlFormatter = new XMLFormatter();

			
			LogRecord logRecord = new LogRecord(Level.INFO,"Logrecord message in xml file..");

				

			
			FileHandler fileHandler= new FileHandler("logrecordxml.xml");
				
			fileHandler.setFormatter(xmlFormatter);

			
			fileHandler.publish(logRecord);

			fileHandler.flush();
		}
	}


