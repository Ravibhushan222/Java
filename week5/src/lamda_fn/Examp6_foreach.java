package lamda_fn;


import java.util.*;  

public class Examp6_foreach {
	public static void main(String[] args) {  
        
        List<String> list=new ArrayList<String>();  
        
        
        list.add("Ravi");  
        list.add("Bhushan");  
        list.add("Singh");  
        list.add("hiii");  
          
        list.forEach(  
        		
            (n)->System.out.println(n)  
            
        );  
    }  
}
