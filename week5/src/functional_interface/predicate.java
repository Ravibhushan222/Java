package functional_interface;

import java.util.*;
import java.util.function.Predicate;
 class predicate {

	public static void main(String args[])
	{

		
		List<String> names =Arrays.asList("Ravi","Rambo","Rocky","jfj","Sun","Life");
			

		
		Predicate<String> p = (s)->s.startsWith("R");

	
		for (String st:names)
		{
			
			if (p.test(st))
				System.out.println(st);
		}
	}
}




