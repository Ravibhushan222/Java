package Map_;



import java.util.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

class  HashMapExamp{
    
     
        
	        public static void main(String [] args){
	           
	           
	           
	        	Map<Integer, String> mp=new HashMap<Integer, String>();  	          
	           mp.put(1,"Ravi");
	            mp.put(10,"Bhuahsan");
	             mp.put(9,"Singh");
	              mp.put(5,"Ra");
	              
	              
	                 mp.put(4,"Rav");
	                 
	                 if(! mp.containsKey(2)){
	                      mp.put(2,"Bhuahsan");
	                 }
	                  mp.putIfAbsent(2,"ravf");
	                 
	                 
	                  System.out.println(mp.containsValue("Ravi"));  
	                    System.out.println(mp.isEmpty());  
	           
	           
	           String s = mp.get(4);
	           
	           System.out.println(s);  
	           
	            System.out.println(mp); 
	            
	           
	           
	           
	         for (Map.Entry<Integer, String> x : mp.entrySet()){
	               
	                 System.out.println(x);  
	               int key = x.getKey();
	               
	               String value = x.getValue();
	               System.out.println(key + " "+ value);  
	           }
	           
	           
	           
	           
	           for(Integer key : mp.keySet()){
	                System.out.println(key);  
	           }
	           
	           for(String value  : mp.values()){
	                System.out.println(value);  
	           }
	       
        
       
               mp.clear();
               System.out.println(mp); 
      
	        }
       }
       
       
 
          
          
          
       
       
     
     
     
   
  
    
    
    
