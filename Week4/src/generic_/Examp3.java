package generic_;

public class Examp3 {

	

	
		
		static <T> void generic_fn (T element)
		{
			System.out.println(element);
							
		}

		
		public static void main(String[] args)
		{
			
			generic_fn(11);

			
			generic_fn("GeeksForGeeks");

		
			generic_fn(1.0);
		}
	}

