package Queue_;


	import java.util.*;
	import java.io.*;


	class  max_heap{
	    
	    
	     public static void main(String [] args){
	      
	      
	         Queue<Integer>que = new PriorityQueue<>(Comparator.reverseOrder());
	         que.offer(12);
	          que.offer(13);
	           que.offer(14);
	          
	           que.offer(15);
	           System.out.print(que);
	            System.out.println();   
	            
	            
	           System.out.println(que.poll());
	           
	           
	             
	           System.out.print(que);
	            System.out.println();   
	            
	            
	            System.out.println(que.peek());
	            
	           que.add(5);
	             System.out.println(que);   
	           System.out.println(que.element());
	           que.remove();
	            System.out.println(que);   
	          
	         
	   }
	}
	   


