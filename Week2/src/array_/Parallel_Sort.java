package array_;
import java.util.Arrays;

public class Parallel_Sort {
	

		public static void main(String[] args)
		{

			
			int arr[] = { 10, 20, 15, 22, 35 };

			
			Arrays.parallelSort(arr);

	         for(int i=0;i<arr.length;i++){
	             System.out.print(arr[i] + " ");
		}
	}


}