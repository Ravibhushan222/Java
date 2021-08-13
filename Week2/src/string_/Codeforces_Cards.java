package string_;
import java.util.*;
public class Codeforces_Cards {

   
    	public static void main(String[] args) {
    		Scanner input = new Scanner(System.in);
    		int a=input.nextInt();
    		String s=input.next();
    		int n=0,z=0;
    		for(int i=0;i<a;++i){
    			if(s.charAt(i)=='n') n++;
    			if(s.charAt(i)=='z') z++;
    		}
    		while(n-->0) System.out.print("1 ");
    		while(z-->0) System.out.print("0 ");
    	}
    }
