package this_;

class Apartment{
    
    int rent;
    String owner;
    
    
    Apartment(){
        System.out.println("if you want to rent a Apartment");
    }
    
   
   Apartment( String owner,int rent){
        this();
        this.rent =  rent;
        this.owner = owner;
        
        System.out.println(owner+"'s Apartment Rent is " + rent);
    }
    
   


  
   public static void main(String [] args){
        
      Apartment obj = new Apartment("Ravi",1000);
      
    
   }
}
   
