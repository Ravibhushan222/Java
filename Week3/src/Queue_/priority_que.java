package Queue_;

import java.util.*;
import java.io.*;


class  priority_que{
    
    
     public static void main(String [] args){
      
      
         Queue<Integer>que = new PriorityQueue<>();
         que.offer(11);
          que.offer(1);
           que.offer(4);
           que.offer(3);
           que.offer(15);
           System.out.print(que);
            System.out.println(); 
            
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
   
