package Map_;
import java.util.Map;  
import java.util.HashMap;  
import java.util.TreeMap;


public class Examp3 {
      
    
    public static void main(String args[])  
    
    {  
   
    Map<Integer, String> hm=new HashMap<Integer, String>();  
    
    
    
    
     hm.put(9, "Red");  
    hm.put(12, "Black");  
      hm.put(6, "Green");  
    hm.put(19, "White");  
    
    
    System.out.println("HashMap Order");  
   
    for(Map.Entry<Integer, String>entry: hm.entrySet())  
    {  
    
    System.out.println(entry.getKey() + " = " +entry.getValue());  
    }  
    
   
   
    Map<Integer, String> tm=new TreeMap<Integer, String>();  
   
    
    
    tm.put(9, "Red");  
    tm.put(12, "Black");  
   
    tm.put(6, "Green");  
    tm.put(19, "White");  
    
    
    
    System.out.println("TreeMap Order");  
   
    for(Map.Entry<Integer, String>entry: tm.entrySet())  
    {  
    
    System.out.println(entry.getKey() + " = " +entry.getValue());  
    }  
    
        System.out.println(hm);  
        System.out.println(tm);  
    
    
    
    
     }  
    
    }  

