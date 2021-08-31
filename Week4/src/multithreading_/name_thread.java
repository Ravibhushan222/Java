package multithreading_;
class Hiii implements Runnable{
	
	public void run() {
		
		for(int i=0;i<3;i++){
			
			
		
			System.out.println("hiii");
			
			
			System.out.println(Thread.currentThread().getName());
			
			System.out.println(Thread.currentThread().getPriority());
			
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			
			
	}
}
	
}
	
	class Hellooo implements Runnable{
		
		public void run() {
			
			for(int i=0;i<3;i++){
				
				
				System.out.println("hellooo");

				try {
					Thread.sleep(1000);
				}catch(Exception e) {}
				
				
				
		}
	}
	}



	public class name_thread {

	
public static void main(String args[]){ 
		
		
		
		Hiii obj1 = new Hiii();
		
		Hellooo obj2 =  new Hellooo();
		
		 Thread t1 = new Thread(obj1); 
		 Thread t2 = new Thread(obj2); 
		 
		 
		 System.out.println(t1.getName());
		 
		 System.out.println(t2.getName());
		 
		 t2.setName("t2 name change");
		 System.out.println(t2.getName());
		 
		 
		 System.out.println(t2.getPriority());
		 
		 System.out.println(t1.getPriority());

		 t1.setPriority(7);
		 
		 t2.setPriority(Thread.MAX_PRIORITY);
		 t2.setPriority(Thread.MIN_PRIORITY);
		 t2.setPriority(Thread.NORM_PRIORITY);

		 
		
		
//		t1.start();
//		t2.start();
		
		
		 }  
	
	
	
	
	
	


}
