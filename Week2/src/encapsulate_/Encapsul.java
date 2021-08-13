package encapsulate_;



class Hostel{
   
   private String name ;
   private int  room_no;
   private String type;
   
   public void setName(String name)
   {
       this.name = name;
   }
    
   public void setRoom(int room_no)
   {
       this.room_no = room_no;
   }
    
   public void setType(String type)
   {
       this.type = type;
   }
   
   public String getName(){
       return this.name;
   }
   public String getType(){
       return this.type;
   }
   public int getRoom(){
       return this.room_no;
   }
   
	
}
class Encapsul{
    
    public static void main (String[] args) {
		
       Hostel obj = new Hostel();
       obj.setType("3 bed room");
       obj.setRoom(324);
       obj.setName("Ravi");
       
       
        System.out.println(obj.getType());
         System.out.println(obj.getRoom());
          System.out.println(obj.getName());
       
		
	}
    
}

