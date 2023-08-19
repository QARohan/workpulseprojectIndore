package StaticVar;

public class AllVariableDec {
	
	String name = "Rohan"; // instance variable 
	String address = "104 Clerk Colony";
	static String city; // class variable 
	static int i; // all static variable are class variables 
	
	static // Static block 
	{
		city = "Kukshi";
		i = 10;
	}
	
	AllVariableDec(String name, String address) // This is contractor 
	{
		this.name = name ; // Reference of current class variable
		this.address = address; // Reference of current class variable
		//this.city = city;
		i++;
		System.out.println("Values of i :" +i);
	}

	public void getAddress()
	{
		System.out.println(address+ " ----- " +city);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AllVariableDec obj = new AllVariableDec("Mitu", "103 clerk colony");
		AllVariableDec obj1 = new AllVariableDec("Raj", "108 clerk colony");
		obj.getAddress();
		obj1.getAddress();
		

	}

}
