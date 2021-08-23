package Exception_handl;

public class try_catch_5 {

   
        public static void main(String args[])  
        {  
          
            try {  
        
              
                try {  
        
                
                    try {  
                    	
                    	
                        int arr[] = { 1, 2, 3, 4 };  
      
                        System.out.println(arr[10]);  
                    }  
        
                    catch (ArithmeticException e) {  
                        System.out.println("Arithmetic exception");  
                        
                    } 
                    
                    
                    
                }  
        
               
                catch (ArithmeticException e) {  
                	
                    System.out.println("Arithmetic exception");  
                   
                }  
            }  
            
            
            
         
            catch (ArrayIndexOutOfBoundsException e4) {  
            	
                System.out.println(e4); 
                
                
                System.out.println(" outer (main) try block");  
            }  
            
            catch (Exception e5) {  
            	
                  System.out.println(" handled in main try-block");  
           
            
            }  
        }  
    }  

