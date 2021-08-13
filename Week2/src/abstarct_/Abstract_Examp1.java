package abstarct_;

abstract class Societyy{
    
    Societyy(){
        System.out.println("Bachelor not allowed");
    }
}
class Ownerr extends Societyy{
    Ownerr(){
        System.out.println("just pay your rent ignore everyone else");
    }
}



class Abstract_Examp1{
    
    public static void main(String [] args){
         
     Ownerr obj = new Ownerr();
     
     
     
    }
    
    
}