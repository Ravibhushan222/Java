package lamda_fn;



interface Sayy{  
	
	
    public String say(String name);  
}  
  

public class Examp3_one_para {
	 public static void main(String[] args) {  
	      
	      
	        Sayy s1=(name)->{ 
	        	
	            return "Hello, "+name;  
	        };  
	        
	        System.out.println(s1.say("you"));  
	          
	         
	        Sayy s2= namee ->{
 
	            return "Hello, "+namee;  
	        };  
	        
	        System.out.println(s2.say("me"));  
	    }  
}
