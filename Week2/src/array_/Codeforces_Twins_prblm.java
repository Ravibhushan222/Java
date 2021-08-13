package array_;

import java.util.*;
public class Codeforces_Twins_prblm {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int sum=0;
	int sum1=0;
	int a[]= new int[n];
	int dem=0;
	for (int i = 0; i<n ;i++) {
		a[i]=sc.nextInt();
		sum+=a[i];
	}
	Arrays.sort(a);
	for(int i=n-1;i>=0;i--) {
		sum1+=a[i];
		dem++;
		if(sum1>sum/2) {
			break;
		}
	}
	System.out.println(dem);
}
}