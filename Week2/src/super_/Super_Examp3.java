package super_;

class Houseee{
    
     Houseee( int rent){
         System.out.println(" Rent is " + rent);
     }
     
    
}

class RentIncrementtt extends Houseee{
    
     RentIncrementtt(int rent){
        super(7000);
    System.out.println("Rent has been changed from to"+" "+ rent);
    
    
    }
}





class Super_Examp3{
    
    public static void main(String[] args){
         
       RentIncrementtt obj2 =  new RentIncrementtt(12000);
       
     
    }
    
    
}