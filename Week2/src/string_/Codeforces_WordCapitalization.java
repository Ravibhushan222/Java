package string_;
import java.util.Scanner;

public class Codeforces_WordCapitalization {



    	public static void main(String[] args)
    	{
    		   String s;
    		   Scanner sc = new Scanner(System.in);
    		   s = sc.next();
    		 //  System.out.println(s.substring(0, 1).toUpperCase()+s.substring(1));
    		  //System.out.println(s.substring(0,1).toUpperCase() + s.substring(1));
    		  
    		  System.out.println(Character.toUpperCase(s.charAt(0))+ s.substring(1) );
    	}
     
    }



