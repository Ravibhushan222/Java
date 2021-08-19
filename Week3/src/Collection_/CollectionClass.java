package Collection_;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CollectionClass {

	

    

	

	public static void main(String [] args){
    
    List<Integer> arr = new  LinkedList<>();
    
        
    arr.add(5);
    arr.add(10);
     arr.add(15);
      arr.add(20);
      arr.add(50);
      arr.add(101);
       arr.add(151);
        arr.add(201);
        
           System.out.println(Collections.min(arr)); 
           
           System.out.println(Collections.max(arr)); 
           System.out.println(Collections.frequency(arr, 5)); 

           Collections.sort(arr);

           System.out.println(arr); 
           
           
           Collections.sort(arr,Comparator.reverseOrder());
           
           System.out.println(arr); 
           
           
           Collections.addAll(arr, 55,77,88);
           System.out.println(arr); 
          
           System.out.println (  Collections.binarySearch(arr, 55));
             
           List<Integer> arr2 = new  LinkedList<>();
             arr2.add(5);
           System.out.println(
                   Collections.disjoint(arr, arr2));
    
           
           
    }          
}
