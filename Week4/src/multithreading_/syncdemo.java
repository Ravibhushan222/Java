package multithreading_;



class Counter{
	
	int count=0;
	  
	
	public synchronized  void increment() {
		
		count++;
		
	}
}
class Check1 extends Thread{
	
	
	Counter obj1 ;
	Check1(Counter obj1){
		this.obj1 = obj1;
	}
	public void run() {
		
		for(int i=0;i<1000;i++){
			
			
			obj1.increment();
			
			
	}
		
	
}
}
	
	class Check2 extends Thread{
		
		Counter obj2 ;
		
		Check2(Counter obj2){
			this.obj2 = obj2;
		}
		
		public void run() {
			
			for(int i=0;i<1000;i++){
				
				obj2.increment();
				
				
		}
	}
	}

public class syncdemo  {
	
	public static void main(String args[]) throws InterruptedException{ 
		
		Counter objectt1 = new Counter();
		
		
	Check1 object1 = new Check1(objectt1);
	
	Check2 object2 = new Check2(objectt1);
	
	

	
	
	object1.start();
	object2.start();
	
	
	object1.join();
	object2.join();
	
	
	
	
	 System.out.println(objectt1.count);
	
	}	
	

}
