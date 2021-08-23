package Exception_handl;

public class finally_ {
	 public static void main(String [] args){
		  
		  int i = 5;
		  
		  int j = 0;
		  
		  
		  
		  
		  try {
			  int k =i/j;
			  
		  }
			  
		   catch(ArithmeticException e) {
	  
		  System.out.println("can't divide zero");  
		  
		  System.out.println(e);  
		   }
		  
		  
		  finally {
			  System.out.println("always get excecuted no matter exception or not");  
		  }
	  
		  
	  
		  
		  
		 
		  
		  
	  }
	
}
