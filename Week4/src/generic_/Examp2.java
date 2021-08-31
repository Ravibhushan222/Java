package generic_;


	class Player<T, U>
	{
		T Jersy_no; 
		U Name; 

		Player(T obj1, U obj2)
		{
			Jersy_no = obj1;
			Name = obj2;
		}

		
		public void print()
		{
			System.out.print(Jersy_no + " ");
			System.out.println(Name);
		}
	}

	public class Examp2 {
		public static void main (String[] args)
		{
			Player <String, Integer> obj =new Player<>("Messi", 10);
			
			Player <String, Integer> obj1 =new Player<>("Ronaldo", 7);
			Player <String, Integer> obj2 =new Player<>("Zlatan", 10);
				
			obj.print();
			obj1.print();
			obj2.print();
		}
	}
