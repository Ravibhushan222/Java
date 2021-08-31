package generic_;


class Premeier_league<T> {
	
	T team;

	
	Premeier_league(T o1) { 
		team = o1; 
		
	}

	T getteam()
	{ 
		return team;
		}
}


class Man_city<T, V> extends Premeier_league<T> {
	
	V obj2;
	
	Man_city(T o1, V o2)
	{
		
		super(o1);

		obj2 = o2;
	}

	
	V getjersy() { return obj2; }
}

public class Ihneritance_generic {

	
	

		
		public static void main(String[] args)
		{
		
			Man_city<String, Integer> kevinD = new Man_city<String, Integer>("man city",10);
					
				

			
			System.out.println(kevinD. getteam());
			System.out.println(kevinD.getjersy());
		}
	}
