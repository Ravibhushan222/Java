package multithreading_;

public class Examp3 implements Runnable{

	

	public void run() {
		System.out.println("Examp of thread");
	}
	
	public static void main(String args[]){ 
		
		
		
		Examp3 obj =  new Examp3();  
		
		 Thread t1 = new Thread(obj); 
		
		t1.start();  
		
		
		
		 }  
	
	
	
}
