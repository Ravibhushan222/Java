package array_;
import java.util.*;
import java.io.*;
public class Binary_search {
	

	
	        
		        public static void main(String [] args){
		           
		           
		           Scanner sc = new Scanner(System.in);
		           
		              int n;
		              n = sc.nextInt();
		              
		              int arr[] = new int[n];
		              
		              for(int i =0 ;i<arr.length;i++){
		                   arr[i]= sc.nextInt();
		              }
		              
		              
		              Arrays.sort(arr);
		              
		               
		              int key= sc.nextInt();
		              
		             
		                   System.out.print("index at" + " "+  Arrays.binarySearch(arr,key));
		                    
		              
		              
		              
		              
		              
		           
		        
		       
		      
		      
		    
		       }
		       
	        
	       
	      
	      
	    
	       }
	       
	       
	 
	          
	          
	          
	       
	       
	     
	     
	     
	   
	  
	    
	    
	    


