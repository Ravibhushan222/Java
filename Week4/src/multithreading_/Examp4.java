package multithreading_;

class Hii implements Runnable{
	
	public void run() {
		
		for(int i=0;i<5;i++){
			
			
			System.out.println("hiii");
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			
			
	}
}
	
}
	
	class Helloo implements Runnable{
		
		public void run() {
			
			for(int i=0;i<5;i++){
				
				
				System.out.println("hellooo");

				try {
					Thread.sleep(1000);
				}catch(Exception e) {}
				
				
				
		}
	}
	}



public class Examp4 {

	
public static void main(String args[]){ 
		
		
		
		Hii obj1 = new Hii();
		
		Helloo obj2 =  new Helloo();
		
		 Thread t1 = new Thread(obj1); 
		 Thread t2 = new Thread(obj2); 
		
		
		t1.start();
		t2.start();
		
		
		 }  
	
	
	
	
	
	
}
	
	
	