package static_;




class  Static_Block2{
    static  int a = 10;
    static int b ;
    static {
        b = a*a*a;
        
        	System.out.println(a);
		System.out.println(b);
    }
    Static_Block2(){
        	System.out.println("hii");
    }
    
    
	public static void main (String[] args) {
		
		new Static_Block2();
		
	}
}