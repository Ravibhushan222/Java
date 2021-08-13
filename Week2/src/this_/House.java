package this_;



class House{
    
    int rent;
    String owner;
    
   
    House( String owner,int rent){
        this.rent =  rent;
        this.owner = owner;
        
        System.out.println(owner+"'s house Rent is " + rent);
    }
    
   


  
   public static void main(String [] args){
        
      House obj = new House("Ravi",1000);
      
    
   }
}
   
