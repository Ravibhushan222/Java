package Queue_;



import java.util.*;
import java.io.*;


class  Array_deque{
    
    
     public static void main(String [] args){
      
      
       ArrayDeque<Integer>que = new ArrayDeque<>();
         que.offer(1);
          que.offerFirst(131);
           que.offerLast(141);
          
           que.offer(15);
           System.out.print(que);
            System.out.println();  
            
            System.out.println(que.peek());
            System.out.println(que.peekFirst());
            System.out.println(que.peekLast());
            
            
          
           
           
           System.out.println(que.poll());  
           System.out.print(que);
            System.out.println();   
            
            
            
            
            System.out.println(que.pollFirst());
            System.out.print(que);
             System.out.println();  
             
            
             
             
             System.out.println(que.pollLast());
             System.out.print(que);
              System.out.println();   
            
            
          
            
           que.add(5);
           
           que.addFirst(8);
           
           que.addLast(9);
           
             System.out.println(que);   
           System.out.println(que.element()); 
           que.remove();
            System.out.println(que);   
          
         
   }
}
   


