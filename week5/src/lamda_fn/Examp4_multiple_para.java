package lamda_fn;


interface Add{  
    int add(int a,int b);  
}  
  

public class Examp4_multiple_para {
	
	 public static void main(String[] args) {  
         
	        

	        Add add1=(a,b)->(a+b);  
	        
	        System.out.println(add1.add(10,20));  
	          
	         
	        Add add2=(int a,int b)->(a+b); 
	        
	        System.out.println(add2.add(100,200));  
	    }  
}
