package multithreading_;


public class Examp5 extends Thread {
     
	
	public void run() {
		System.out.println("Examp of thread");
	}
	
	public static void main(String args[]){ 
		
		
		
		Examp1 t1=new Examp1();  
		
		t1.run();  
		
		
		
		 }  
	
	
	
	
}
