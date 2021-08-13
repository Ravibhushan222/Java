package polymorph_;



class AvgSociety_rent{
    
    int  rent(){
        return 15;
    }
}

class  One_Bhk extends AvgSociety_rent{
    int rent(){
        return 10;
    }
}
    
    class Two_Bhk extends AvgSociety_rent{
        int rent(){
            return  20;
        }
        
    }



class  Override_Examp {
	public static void main (String[] args) {
		
		AvgSociety_rent obj = new One_Bhk();
	int	rentt = obj.rent();
		System.out.println("One_Bhk rent"+ " "+rentt);
	
			
		AvgSociety_rent obj1 = new Two_Bhk();
		rentt= obj1.rent();
	   System.out.println("One_Bhk rent"+" "+ rentt);
		
		
	}
}