package string_;

public class String_Buffer_and_Builder {

	
	
		public static void main(String[] args)
		{
			String str = "Ravi";

			
			StringBuffer sbr = new StringBuffer(str);
			
			
			
			sbr.reverse();
			
			
			System.out.println(sbr);
			
			

			

			StringBuilder sbl = new StringBuilder(str);
			
			sbl.append("Bhushan Singh");
			
			
			System.out.println(sbl);
		}
	}

	
	

