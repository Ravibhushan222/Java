package functional_interface;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class Biconsumer {
	
		public static void main(String args[])
		{

			
			List<Integer> lista = new ArrayList<Integer>();
			lista.add(2);
			lista.add(1);
			lista.add(2);

			
			List<Integer> listb = new ArrayList<Integer>();
			listb.add(2);
			listb.add(1);
			listb.add(2);

			
			
			
			BiConsumer<List<Integer>, List<Integer> > 
			
				equalss = (list1, list2) ->
			{ 
				
				
				if (list1.size() != list2.size())
				{
					System.out.println("False");
				}
				
				else {
					
					for (int i = 0; i < list1.size(); i++)
						
						if (list1.get(i) != list2.get(i)) {
							
							System.out.println("False");
							
							return;
						} 
					
					System.out.println("True");
				}
			}; 
			
			equalss.accept(lista, listb);
		}
	}


