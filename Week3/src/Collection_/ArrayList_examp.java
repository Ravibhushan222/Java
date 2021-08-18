package Collection_;


import java.util.*;
import java.io.*;

class  ArrayList_examp{
    
     
        
	        public static void main(String [] args){
	           
	           
	          ArrayList<Integer> arr = new  ArrayList<>();
	          
	              
	             arr.add(5);
	              arr.add(10);
	               arr.add(15);
	                arr.add(20);
	                
	                 System.out.println(arr);  
	                 
	             
	            System.out.println(arr.get(2));   
	            
	              for(int i=0;i<arr.size();i++)
	              {
	                   System.out.print(arr.get(i)); 
	                   System.out.print(" ");   
	              }
	              System.out.println();   
	              arr.set(3,55);
	              
	              for(Integer x : arr){
	                   System.out.print(x);  
	                   System.out.print(" ");  
	              }
	              
	              System.out.println();   
	              
	              System.out.println( arr.contains(55)); 
	              
	              arr.remove(3);
	              
	              arr.remove(Integer.valueOf(10));
	           
	        for(int x : arr){
	                   System.out.print(x);  
	                   System.out.print(" "); 
	              }
	       
	   
	   	          ArrayList<Integer> arr1 = new  ArrayList<>();
	    
	    
	         arr1.addAll(arr);
	         System.out.println(arr1); 
	         
          arr1.clear();
           System.out.println(arr1); 
           
           System.out.println(arr1.isEmpty()); 
           
           Iterator<Integer>it = arr.iterator();
           
           while(it.hasNext()){
                System.out.println(it.next()); 
          
	    
	       }
	       
	       
        
       
         
          
           }
          
      
    
       }
       
       
 
          
          
          
       
       
     
     
     
   
  
    
    
    
