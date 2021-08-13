package static_;





class  Static_Block{
    static  int a = 10;
    static int b ;
    static {
        b = a*a*a;
    }
    
    
	public static void main (String[] args) {
		
		System.out.println(a);
		System.out.println(b);
		
		
	}
}