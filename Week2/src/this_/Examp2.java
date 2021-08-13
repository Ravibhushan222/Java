package this_;



class Examp2{
    
    int rent;
    int flat_no;
    
    void notice(){
         System.out.println("Rent will increse");
   }
   
   void new_Rent(int y,int x){
        
        this.notice();
        rent =x;
        flat_no = y;
        System.out.println("new rent for the flat" +" "+flat_no +" "+ "is"+" "+ rent);
        
    }
    
   
    
    
    
   


  
   public static void main(String [] args){
        
      Examp2 obj = new Examp2();
      obj.new_Rent(301,10000);
      
    
   }
}
   
