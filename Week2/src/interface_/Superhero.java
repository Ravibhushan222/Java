package interface_;

interface Marvel{
    void powerfulchar();
   
   
}
 interface Dc{
   public  void fastestchar(int speed);
     
 }
 
 class Superhero implements Marvel,Dc{
     
    public  void powerfulchar(){
          System.out.println("its thor");
      }
      
     public void fastestchar(int speed){
          System.out.println("its flash who runs" +" "+speed +" "+ "mach" );
      }
     
     
     public static void main(String [] args){
      
       Superhero obj =new Superhero();
     obj.powerfulchar();
     obj.fastestchar(5);
   }
     
 }