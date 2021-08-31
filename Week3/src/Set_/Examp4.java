package Set_;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
public class Examp4 {
	
		 public static void main(String [] args){
		      
		      SortedSet<Integer>set = new TreeSet<>();
		       set.add(5);
		              set.add(10);
		               set.add(15);
		                set.add(20);
		                set.add(20);
		                set.add(20);
		                 System.out.println(set);  
		            
	                 
	                 System.out.println(set.first());  
		                 System.out.println(set.last());  
			            
	                 
                 
	                 set.remove(15);
		                 System.out.println(set);  
		                
		                 
		                 System.out.println(set.contains(100));   
		                 
	                 System.out.println(set.isEmpty()); 
	                 		                
		                
		               System.out.println(set.subSet(2, 15));  
		                
		                System.out.println(set.tailSet(6));  
		                
		                set.clear();
		                System.out.println(set);  
		                 
		         
		   }
	}


