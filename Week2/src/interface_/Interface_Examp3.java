package interface_;

interface Society{
    
    static void noticeee(){
        System.out.println("Bachelor not allowed");
    }
}




class Interface_Examp3 implements Society{
    
    public static void main(String [] args){
         
     Society.noticeee();
     
     
    }
    
    
}