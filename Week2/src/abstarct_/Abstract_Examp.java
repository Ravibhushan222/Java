package abstarct_;



abstract class Society{
    abstract int rent();
    void welcome(){
    System.out.println("welcome to Gardenia");
    }
}

class One_bhk extends Society{
    int rent(){
        return 7000;
    }
} 

class Two_bhk extends Society{
    int rent(){
        return 12000;
    }
}
class Three_bhk extends Society{
    int rent(){
        return 18000;
    }
}


class Abstract_Examp{
    
    public static void main(String [] args){
         
    Society obj;
    obj = new One_bhk();
    
    System.out.println(obj.rent());
    
    obj = new Two_bhk();
     System.out.println(obj.rent());
     
      obj.welcome();
     
      Three_bhk obj1 = new  Three_bhk();
     System.out.println(obj1.rent());
     obj1.welcome();
     
    }
    
    
}