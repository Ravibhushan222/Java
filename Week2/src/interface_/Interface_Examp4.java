package interface_;

interface Societty{
    
    default void noticeee(){
        System.out.println("Bachelor not allowed");
    }
}




class Interface_Examp4 implements Societty{
    
    public static void main(String [] args){
         
       Interface_Examp4   obj = new Interface_Examp4();
         
        obj.noticeee();
     Societty obj1 = new Interface_Examp4();
         
        obj1.noticeee();
     



     
     
    }
    
    
}