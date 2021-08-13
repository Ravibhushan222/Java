package array_;

import java.util.*;
import java.io.*;

class Kth_smallest{
    
    
      int solution(int arr[],int k){
          Arrays.sort(arr);
          return arr[k-1];
      }
    
    
    
    
     public static void main(String [] args){
      
     
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();
       
       int arr[] =  new int[n];
       
       for(int i=0;i<n;i++){
           
           arr[i] = sc.nextInt();
           
           
       }
       
          int k = sc.nextInt();
          
          
          Kth_smallest obj = new Kth_smallest();
          
          System.out.println("Kth_smallest " + " " + obj.solution(arr,k));
          
          
       
       
     
     
     
   
  }
    
    
    
}