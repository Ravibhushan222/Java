package Set_;
import java.util.*;
import java.util.NavigableSet;
import java.util.TreeSet;
 
import java.io.*;


public class Examp {




	    
	    
	     public static void main(String [] args){
	      
	    	 NavigableSet<Integer>set = new TreeSet<>();
	       set.add(5);
	              set.add(10);
	               set.add(15);
	                set.add(20);
	                set.add(20);
	                set.add(20);
	                
	                 System.out.println(set);  
	                 
	                 
	               
	                 System.out.println(set.contains(10));
	            	 
	                          
	        
	        System.out.println("First Value " + set.first());
	 
	        System.out.println("Last Value " + set.last());
	        
	        
	        set.pollFirst();
	        
	        System.out.println("After removal of First Element " + set);
	            
	 
	      
	        set.pollLast();
	 
	   System.out.println( "After  removal of Last Element " + set);
	           
	        
	        
	        
	    }
	         
	   }
	
	   




