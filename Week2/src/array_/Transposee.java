package array_;



import java.util.*;
import java.io.*;

class  Two_D_Array{
    
     void Transposee(int arr[][],int x,int y){
         
       for(int i=0;i< x;i++){
           for(int j=0;j<y;j++)
           {
           
           arr[i][j] = arr[j][i];
           
           }
         
       }
       
     }
           
     
        void displayy(int arr[][], int x,int y){
            
            for(int i=0;i<x;i++){
           for(int j=0;j<y;j++) {
           
            System.out.print( arr[i][j]+" ");
           
          
             } 
           System.out.println();
           }
        
        }
    
        
     
     
     

    
    
       public static void main(String [] args){
      
     
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();
         int m = sc.nextInt();
       
       int arr[][] =  new int[n][m];
       
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++)
           {
           
           arr[i][j] = sc.nextInt();
           
           }
           
           
       }
       
       
       Two_D_Array obj = new Two_D_Array();
       
         obj.Transposee(arr,n,m);
          obj.displayy(arr,n,m);
        
       
       
       } 
          
          
          
       
       
     
     
     
   
  
    
    
    
}