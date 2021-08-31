package _Examp;


import java.util.Comparator;
import java.util.HashSet;

import java.util.Set;
import java.util.TreeSet;

class playerr{
    
    String name;
    int jersey_no;
    
    
    playerr(int jersey_no, String name){
        this.name = name;
        this.jersey_no = jersey_no;
        
    }
    public String toString(){
    return name  +" "+ jersey_no;
  }
}
 class Sortbyjersy_num implements Comparator<player> {
    
    public int compare(player a, player b)
    {
        return a.jersey_no - b.jersey_no;
    }
}

class Sortbynamee implements Comparator<player> {
    
    public int compare(player a, player b)
    {
        return a.name.compareTo(b.name);
    }
}



public class Set_Examp  {
    
     
        
	        public static void main(String [] args){
	           
	           
	           playerr p1= new playerr(10,"Messi");
	             
	           playerr p2= new playerr(7,"Ronaldo");
	             
	           playerr p3= new playerr(9,"Suarez");
	           
	            playerr p4= new playerr(9,"Zlatan");
	            
	             playerr p5= new playerr(7,"Grizemann");
	           
	        Set<playerr>set = new HashSet<playerr>();
	              
	             set.add(p1);
	              set.add(p2);
	               set.add(p3);
	                set.add(p4);
	                 set.add(p5);
	                 
	                 System.out.println(set);  
	                 
	                
         
          
           }
          
      
    
       
       
       


	
	
	
}
