package Exception_handl;

public class throw_ {

	
	static void Vote(int age) {
		if(age<18) {
			   throw new ArithmeticException(" not eligible to vote");    
		}
		else {
			System.out.println(" eligible to vote!!"); 
		}
	}
	
	
	
  public static void main(String [] args){
		  
		
		 Vote(19);
		  Vote(13);
		  
	  }
	

	
}
