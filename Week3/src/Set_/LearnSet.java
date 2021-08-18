package Set_;




import java.util.*;
import java.io.*;


class LearnSet{
    
    
     public static void main(String [] args){
      
      Set<Integer>set = new HashSet<>();
       set.add(5);
              set.add(10);
               set.add(15);
                set.add(20);
                set.add(20);
                set.add(20);
                 System.out.println(set);  
                 
                 
                 set.remove(15);
                 System.out.println(set);  
                 
                 System.out.println(set.contains(100));   
                 
                 System.out.println(set.isEmpty()); 
                 
                set.clear();
                System.out.println(set);  
                 
                
       
         
   }
}
   


