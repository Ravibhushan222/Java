package Exception_handl;

public class try_catch_2 {

	
	
	
	
	

	  public static void main(String [] args){
		  
		  
		  int a[] = new int [5];
		 
		  
		  
		  try {
			 
			  for(int i = 0 ;i<=5;i++) {
				  a[i]=i;
			  }
			  
			  
			  
			  
			  for(int x :a) {
				  
				  System.out.println(x);  
				  
			  }
		  }
			  
		   catch(ArrayIndexOutOfBoundsException e) {
	  
		  System.out.println(e);  
		  
	  
		   }
		  catch(ArithmeticException e) {
			  
			  System.out.println("can't divide zero");  
			  
			  System.out.println(e);  
			  
		  
			  
		  }
	  
		  
		  
		 
		  
		  
	  }
	
	
}
