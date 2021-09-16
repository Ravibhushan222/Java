package lamda_fn;


 
interface Draw{  
    public void draw();  
}  
  


public class Examp {
	public static void main(String[] args) { 
		
		
        int width=10;  
          
         
        Draw d2=()->{  
            System.out.println("Drawing "+width);  
        };  
        
        
        
        
        d2.draw();  
    }  
}
