package Collection_;


import java.util.*;
import java.io.*;

class  LinkedList_{
    
     
        
	        public static void main(String [] args){
	           
	           
	        	  LinkedList<Integer> arr = new  LinkedList<>();
	          
	              
	             arr.add(5);
	              arr.add(10);
	               arr.add(15);
	                arr.add(20);
	                
	                
	                arr.addFirst(33);
	                
	                arr.addLast(33);
	                
	           
	              
	              
	                 System.out.println(arr);  
	                 
	             
	            System.out.println(arr.get(2));   
	            
	              for(int i=0;i<arr.size();i++)
	              {
	                   System.out.println(arr.get(i));   
	              }
	              
	              arr.set(3,55);
	              
	              for(Integer x : arr){
	                   System.out.println(x);   
	              }
	              
	            
	              
	              System.out.println( arr.contains(55)); 
	              
	              arr.removeFirst();
	              System.out.println(arr);   
	              
	              
	              arr.removeLast();
	              System.out.println(arr);   
	              
	              
	              
	              arr.removeFirstOccurrence(4);
	              
	              arr.removeLastOccurrence(4);
	              
	              
	              arr.remove(3);
	              
	              arr.remove(Integer.valueOf(10));
	           
	        for(int x : arr){
	                   System.out.println(x);   
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
       
       
 
          
          
          
       
       
     
     
     
   
  
    
    
    
