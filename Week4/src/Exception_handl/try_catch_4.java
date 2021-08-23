package Exception_handl;

public class try_catch_4 {

	public static void main(String [] args){
		  
	    String s="abc";  
	  
	  
	  try {
		  int i=Integer.parseInt(s);
		  System.out.println(i);
		  
	  }
		  
	   catch(NumberFormatException  e) {
  
	 
		   
	  System.out.println(e);  
	  
  
	  
  }
	  
	  
	 
	  
	  
  }
}
