package encapsulate_;




class Hostell{
   
   private String namee ;
   private int  room_noo;
   private String typee;
   
   public void setName(String name)
   {
      namee = name;
   }
    
   public void setRoom(int room_no)
   {
       room_noo = room_no;
   }
    
   public void setType(String type)
   {
       typee = type;
   }
   
   public String getName(){
       return namee;
   }
   public String getType(){
       return typee;
   }
   public int getRoom(){
       return room_noo;
   }
   
	
}
class Encapsul2{
    
    public static void main (String[] args) {
		
       Hostell obj = new Hostell();
       obj.setType("3 bed room");
       obj.setRoom(324);
       obj.setName("Ravi");
       
       
        System.out.println(obj.getType());
         System.out.println(obj.getRoom());
          System.out.println(obj.getName());
       
		
	}
    
}

