package polymorph_;


class Polymorph
{
    String favsport;
    int time;
     void ravifav1(String s, int t){
         this.favsport = s;
         this.time= t;
         System.out.println(s+" "+t);
         
         
     }
     void ravifav1(String t){
        this.favsport = t;
        System.out.println(t);
     }
     
     
     
    public static void main(String [] args){
       
       Polymorph obj = new Polymorph();
       obj.ravifav1("football",90);
       Polymorph obj1 = new Polymorph();
       obj1.ravifav1("cricket");
    }
        
}