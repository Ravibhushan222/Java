package functional_interface;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class consumer {
	
		public static void main(String args[])
		{
			
			Consumer<Integer> display = a -> System.out.println(a);

			
			display.accept(10);

			
			Consumer<List<Integer> > modify = list ->
			{
				for (int i = 0; i < list.size(); i++)
					list.set(i, 2 * list.get(i));
			};
			
			
			List<Integer> list = new ArrayList<Integer>();
	        list.add(2);
	        list.add(1);
	        list.add(3);
			
			
			modify.accept(list);
			
			
			for(int x: list) {
				System.out.print(x+" ");
	        
			}
			

		}
	}


