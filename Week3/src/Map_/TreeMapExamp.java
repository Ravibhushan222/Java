package Map_;


import java.util.*;
import java.io.*;


class  TreeMapExamp{
    
     
        
	        public static void main(String [] args){
	           
	           
	           
	           Map<Integer,String>tm = new TreeMap<>();
	          
	           tm.put(1,"Ravi");
	            tm.put(10,"Bhuahsan");
	             tm.put(9,"Singh");
	              tm.put(5,"Ra");
	              
	              
	                 tm.put(4,"Rav");
	                 
	                 if(! tm.containsKey(2)){
	                      tm.put(2,"Bhuahsan");
	                 }
	                  tm.putIfAbsent(2,"ravf");
	                 
	                 
	                  System.out.println(tm.containsValue("Ravi"));  
	                    System.out.println(tm.isEmpty());  
	           
	           
	           String s = tm.get(4);
	           
	           System.out.println(s);  
	           
	            System.out.println(tm); 
	            
	           
	           
	           
	         for (Map.Entry<Integer, String> x : tm.entrySet()){
	               
	                 System.out.println(x);  
	               int key = x.getKey();
	               
	               String value = x.getValue();
	               System.out.println(key + " "+ value);  
	           }
	           
	           
	           
	           
	           for(Integer key : tm.keySet()){
	                System.out.println(key);  
	           }
	           
	           for(String value  : tm.values()){
	                System.out.println(value);  
	           }
	       
        
       
               tm.clear();
               System.out.println(tm); 
      
	        }
       }
       
       
 
          
          
          
       
       
     
     
     
   
  
    
    
    
