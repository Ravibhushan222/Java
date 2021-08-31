package Map_;






import java.util.*;
import java.io.*;


class  Examp5{
    
     
        
	        public static void main(String [] args){
	           
	           
	           
			        NavigableMap<Integer, String> mp =new TreeMap<>();   
			           mp.put(1,"Ravi");
			            mp.put(10,"Bhuahsan");
			             mp.put(9,"Singh");
			              mp.put(5,"Ra");
			              
			              
			                 mp.put(4,"Rav");
		                 
			                 
			                   System.out.println(mp);  
			                   
			              System.out.println(mp.descendingMap());  			              
		              System.out.println(mp.descendingKeySet());  
			                   
			                     
			                   
			                   
		                    System.out.println(mp.firstEntry());  
		                    
			                     System.out.println(mp.lastEntry());  
                    
	                     
	                
	                      System.out.println(mp.lowerKey(9));
	                      
	                      
	                      
	                        
	                
    
	             System.out.println(mp.pollFirstEntry());  
	             
	              System.out.println(mp); 
	             
	             
	             System.out.println(mp.pollLastEntry());
	             
	                    System.out.println(mp);  
	                    
	                    
	                       
	                   
	           
	        }
       }
       
       
 
         
          
          
       
       
     
     
     
   
  
    
    
    
