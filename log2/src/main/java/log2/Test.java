package log2;


import org.apache.log4j.Logger;
import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;


public class Test {
	
	private static Logger log= Logger.getLogger(Test.class.getName());
	

	public static void main(String[] args)
	{
          Layout layout = new XMLLayout();
		
	Appender app = new ConsoleAppender(layout); 	
	
	   log.addAppender(app);
		
	   
	   log.debug("hii debuggg");
	   log.info("hii info");
	   log.warn("hii warning ");
	   log.error("hii error");
	   log.fatal("hii fatatalll");
		
	}
	
	
}
