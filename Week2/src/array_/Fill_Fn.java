package array_;
import java.util.*;
public class Fill_Fn {
	  public static void main(String [] args){
          
          
          Scanner sc = new Scanner(System.in);
          
             int n;
             n = sc.nextInt();
             
             int arr[] = new int[n];
             
             for(int i =0 ;i<arr.length;i++){
                  arr[i]= sc.nextInt();
             }
             
             
             
             
             
              
             int key= sc.nextInt();
               Arrays.fill(arr,key);
               
               for(int i =0 ;i<arr.length;i++)
                   System.out.print(arr[i] + " ");
                    
              
              
               System.out.println(Arrays.toString(arr));
                      
             
             
               
                
             
             
             
             
             
          
       
      
     
     
   
      }
      
   
  
}
