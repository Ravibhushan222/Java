package Map_;

import java.util.*;
import java.io.*;


class  Examp4{
    
     
        
	        public static void main(String [] args){
	           
	           
	           
	        	Map<Integer, String> mp=new HashMap<Integer, String>();  
	           mp.put(1,"Ravi");
	            mp.put(10,"Bhuahsan");
	             mp.put(9,"Singh");
	              mp.put(5,"Ra");
	              
	              
	                 mp.put(4,"Rav");
	                 
	                
        Iterator<Map.Entry<Integer, String>> itr = mp.entrySet().iterator();
         
        while(itr.hasNext())
        {
             Map.Entry<Integer, String> entry = itr.next();
             System.out.println("Key = " + entry.getKey() +" Value = " + entry.getValue());
                                 
        }
	           

        
        
	            for (Integer a : mp.keySet())
        {
           
            String str = mp.get(a);
            System.out.println("Key = " + a + ", Value = " + str);
        }
	            
	           
	        }
       }
       
       
 
          
          
          
       
       
     
     
     
   
  
    
    
    
