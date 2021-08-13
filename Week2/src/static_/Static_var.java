package static_;





class Static_var {
    
    static int count=0;
    int cnt =0;
    
    void counter(){
        count++;
        
        cnt++;
        System.out.println(count + " "+ cnt);
    }
	public static void main (String[] args) {
	    
	    
		Static_var obj = new Static_var();
	    obj.counter();
	    Static_var obj1 = new Static_var();
	    obj1.counter();
	    
		
	}
}