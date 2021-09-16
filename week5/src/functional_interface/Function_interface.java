package functional_interface;
import java.util.function.Function;  
public class Function_interface {
	
	    static String show(String message){  
	    	
	        return "Hello "+message;  
	    }  
	    
	    
	    
	    
	    
	    
	    public static void main(String[] args) {  
	        
	        Function<String, String> fun = Function_interface::show;  
	        
	        
	      
	        System.out.println(fun.apply("Me"));  
	    }  
	}  

