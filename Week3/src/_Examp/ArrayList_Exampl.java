package _Examp;



import java.util.*;
import java.io.*;

class player{
    
    String name;
    int jersey_no;
    
    
    player(int jersey_no, String name){
        this.name = name;
        this.jersey_no = jersey_no;
        
    }
    public String toString(){
    return name  +" "+ jersey_no;
  }
}
 class Sortbyjersy_no implements Comparator<player> {
    
    public int compare(player a, player b)
    {
        return a.jersey_no - b.jersey_no;
    }
}

class Sortbyname implements Comparator<player> {
    
    public int compare(player a, player b)
    {
        return a.name.compareTo(b.name);
    }
}



class ArrayList_Exampl {
    
     
        
	        public static void main(String [] args){
	           
	           
	           player p1= new player(10,"Messi");
	             
	           player p2= new player(7,"Ronaldo");
	             
	           player p3= new player(9,"Suarez");
	           
	            player p4= new player(9,"Zlatan");
	            
	             player p5= new player(7,"Grizemann");
	           
	          List<player> arr = new  ArrayList<>();
	          
	              
	             arr.add(p1);
	              arr.add(p2);
	               arr.add(p3);
	                arr.add(p4);
	                 arr.add(p5);
	                 
	                 System.out.println(arr);  
	                 
	                 Collections.sort(arr, new Sortbyjersy_no());
	                 
	                 System.out.println(arr);  
	                 Collections.sort(arr, new Sortbyname());
	                 System.out.println(arr);  
	         
         
          
           }
          
      
    
       }
       
       
 
          
          
          
       
       
     
     
     
   
  
    
    
    
