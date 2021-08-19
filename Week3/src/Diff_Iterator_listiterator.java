import java.io.*;
	import java.util.*;
	import java.util.ArrayList;
	import java.util.ListIterator;
	
	
public class Diff_Iterator_listiterator {
	
		public static void main(String[] args)
		{
			ArrayList<Integer> list = new ArrayList<Integer>();
				

			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(5);

			
			Iterator itr = list.iterator();

			
			System.out.println("Has Next traverse: ");

			while (itr.hasNext())
				System.out.print(itr.next() + " ");
			
			

			System.out.println();

			
			
			
			ListIterator i = list.listIterator();

			System.out.println("List Iterator:");
			
			
			System.out.println("Has Next Traverse: ");

			while (i.hasNext())
			{
				System.out.print(i.next() + " ");
			}
			

			System.out.println();

			System.out.println("Has Previous Traverse: ");

			while (i.hasPrevious())
			{
				System.out.print(i.previous() + " ");
			}

			System.out.println();

			
			
			ListIterator itrr = list.listIterator();
			
			  itrr.next();
			 itrr.next();
		        itrr.set(80000);

				
		        System.out.print(list);
			
		}
	}


