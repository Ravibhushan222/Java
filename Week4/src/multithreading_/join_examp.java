package multithreading_;
class Hi1 extends Thread{
	
	public void run() {
		
		for(int i=0;i<3;i++){
			
			
			System.out.println("hiii");
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			
			
	}
}
	
}
	
	class Hello1 extends Thread{
		
		public void run() {
			
			for(int i=0;i<3;i++){
				
				
				System.out.println("hellooo");

				try {
					Thread.sleep(1000);
				}catch(Exception e) {}
				
				
				
		}
	}
	}



	public class join_examp {

	
public static void main(String args[]) throws Exception{ 
		
		
		
		Hi1 obj1 = new Hi1();
		
		Hello1 obj2 =  new Hello1();
		
		obj1.start();
		obj2.start();
		
		System.out.println(obj1.isAlive());
		
		obj1.join();
		obj2.join();
		
		System.out.println(obj1.isAlive());
		
		
		System.out.println("bye");
		
		
		 }  
	
	
	
	
	
	



}
