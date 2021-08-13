package super_;



class House{
    int rent = 7000;
    
   
}

class RentIncrement extends House{
   int rent = 10000;
   void notice(){
   System.out.println("Rent has been changed from " + super.rent + " "+"to"+" "+ rent);
   }
} 





class Super_Examp{
   
   public static void main(String [] args){
        
      RentIncrement obj =  new RentIncrement();
      obj.notice();
    
   }
   
   
}