

package inheritancer_;

class Codewalla{
    int number_employee;
    
    void no_of_people(int n)
    {
        this.number_employee = n;
        System.out.println("Hello to"+" "+ n +" "+ "people");
    }
    
}
class Backend_Team  extends Codewalla{
    
    int number_employee;
    void no_of_backend(int n)
    {
        this.number_employee = n;
        System.out.println("Hello to"+" " + n + " "+"people");
        
    }

    
}
class Trainee extends Backend_Team{
    
    int number_employee ;
    void no_of_trainee(int n){
        
         System.out.println("Hello to" +" "+ n +" "+ "people");
    
    }
    
    
     public static void main(String[] args){
       
      Trainee obj = new Trainee();
      obj.no_of_trainee(2);
      obj.no_of_backend(9);
      obj.no_of_people(62);
      
    }
    
}