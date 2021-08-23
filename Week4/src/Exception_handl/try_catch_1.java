package Exception_handl;

public class try_catch_1 {

	  public static void main(String [] args){
		  
		  int i = 5;
		  
		  int j = 0;
		  
		  
		  
		  
		  try {
			  int k =i/j;
			  
		  }
			  
		   catch(ArithmeticException e) {
	  
		  System.out.println("can't divide zero");  
		  
		  System.out.println(e);  
		  System.out.println(e.getMessage());  
		 
		  
		    e.printStackTrace();  
		  
		  
		  
	  
		  
	  }
		  
		  
		 
		  
		  
	  }
	
	
	
}
