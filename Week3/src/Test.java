




import java.util.*;
import java.io.*;


class  Test{
    
     
        
	        public static void main(String [] args){
	           
	           
	           
	        	Map<Integer, String> mp=new HashMap<Integer, String>();  
//	              mp.put(22,"Ravi");
//                   mp.put(6,"Bhuahsan");
//	             mp.put(9,"Singh");
//	              mp.put(5,"Ra");
//	              
//	              
//	                 mp.put(4,"Rav");
	                 
	                 mp.put(9, "Red");  
	                 mp.put(12, "Black");  
	                
	                 mp.put(6, "Green");  
	                 mp.put(19, "White");  
	                 
	                 
	                
	           
                 for(Map.Entry<Integer, String>entry: mp.entrySet())  
	                 {  
	                
	                 System.out.println(entry.getKey() + " = " +entry.getValue());  
	                 
	                 
                 }  
                 
                 System.out.println();  
                 
	            
                 Map<Integer, String> p=new TreeMap<Integer, String>();  
	                 
	                 
	    	         
	                 p.put(9, "Red");  
	                 p.put(12, "Black");  
	                
	                 p.put(6, "Green");  
	                 p.put(19, "White");  
	                 
	                 
	                	           
           for(Map.Entry<Integer, String>entry: p.entrySet())             {  
                	                 System.out.println(entry.getKey() + " = " +entry.getValue());  
     }  
	       
      
	        }
       }
       
       
 
          
          
          
       
       
     
     
     
   
  
    
    
    
