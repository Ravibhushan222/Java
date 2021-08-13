package static_;




class   Details{
    
    String name;
    int roll;
    
    static String collegename = "ggsipu";
    
    void student(String name, int roll){
       System.out.println(name+" "+ roll+" "+collegename);
    }
    
  
    
    
    
    public static void main(String [] args){
        
        Details obj = new Details();
        obj.student("ravi",16);
        obj.student("gaurav",06);
     
  }
    
}