package super_;



class Housee{
    int rent = 7000;
    void message(){
        System.out.println(" Rent is " + rent);
    }
    
   
}

class RentIncrementt extends Housee{
   int rent = 10000;
   void notice(){
       super.message();
   System.out.println("Rent has been changed from " + super.rent + " "+"to"+" "+ rent);
   }
} 





class Super_Examp1{
   
   public static void main(String [] args){
        
      RentIncrementt obj =  new RentIncrementt();
      obj.notice();
    
   }
   
   
}