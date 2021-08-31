package generic_;



 class Laliga<T>{  
     
     T team;
     
     Laliga(T team){
         
         this.team = team;
     }
      
      public T getTeam(){
          return this.team;
      }
      
     
 }
 
 class GenericExamp{
 public static void main(String args[]){  
     
     
     Laliga<String>team1 = new Laliga<>("Barcelona");
     
      Laliga<String>team2 = new Laliga<>("Real Madrid");
       Laliga<String>team3 = new Laliga<>("Sevilla");
       
        Laliga<String>team4 = new Laliga<>("Atletico Madrid");
        
        Laliga<Integer>rank = new Laliga<>(2);
     
    
                System.out.println(team1.getTeam());  
                 System.out.println(team2.getTeam());  
                  System.out.println(team3.getTeam());  
                   System.out.println(team4.getTeam());  
                   System.out.println(rank.getTeam());  

     
 }  
}  
 
 





