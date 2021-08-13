package construct;



class House{
    int rent;
    String owner;
    
    House( String owner,int rent){
        
        this.rent = rent;
        this.owner = owner;
        
    }
    
    
    House(House s)
    {
        this.rent = s.rent;
        this.owner = s.owner;
        
        
    }
    
    void display(){
        System.out.println(owner + " "+ rent);
    }
    
   




   
   public static void main(String [] args){
         
         House obj = new House("Ravi", 10000);
         obj.display();
         
         House obj1 = new House(obj);
         obj1.display();
      
      
    
   }
}
   
   