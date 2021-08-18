package Collection_;

import java.util.*;
import java.io.*;


class Stackk{
    
    
     public static void main(String [] args){
      
      
      Stack<String>name = new Stack<>();
      name.push("ravi");
       name.push("bhushan");
        name.push("singh");
         name.push("mani");
      
        System.out.println(name);  
        
          System.out.println(name.peek());  
          
          
          name.pop();
          System.out.println(name.peek()); 
          
         
           Iterator<String>itr = name.iterator();
          
          while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
  
        System.out.println();
          for(String x : name){
                System.out.print(x + " ");
          }
           System.out.println();
   }
}
   
