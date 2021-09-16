package lamda_fn;


interface Say{  
    public String say();  
}  


public class Examp2_Noparameter {
	
	public static void main(String[] args) { 
		
		
	    Say s=()->{  
	        return "hiiiii.";  
	    };  
	    
	    
	    System.out.println(s.say());  
	}  
}
