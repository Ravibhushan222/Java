package polymorph_;

class PolymorphGrandFather{
    
    void family_Name() {
        System.out.println(" R Singh family");
    }
    
    void city_name()
    {
        System.out.println("lives in mumbai");
    }
    
}




class PolymorphDad extends PolymorphGrandFather{
   @Override
     void family_Name(){
        System.out.println("P singh family");
        
    }
    
    void city_name()
    {
        System.out.println("lives in bihar");
    }
    
    
}
class Polymorph1 extends PolymorphDad
{
    
    
    
     
     
     
    public static void main(String [] args){
      PolymorphGrandFather obj ;
       
       obj = new PolymorphDad();
       obj.city_name();

         obj.family_Name();

     
       
      
       
    }
        
}