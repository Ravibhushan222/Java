package construct;


class ConstructorExamp1{
    
      String name;
      int age;
     
    {
        System.out.println("mic check");
    }
     
    
    ConstructorExamp1()
    {
      
        System.out.println("Ravi  here");
        
        
    }
    
    ConstructorExamp1(String name, int age){
       this.age =age;
       this.name= name;
       System.out.println(age + " "+ name);
        
    }
    
    
    public static void main(String [] args){
       
        
        ConstructorExamp1 obj =new ConstructorExamp1();
        ConstructorExamp1 obj1= new ConstructorExamp1("ravi",6);
       
        
    }
}