package SuperKey;

public class ChildDemo {
	
	String fname = "Rohan";

	String lname = "Gupta4";
	
	public ChildDemo()
	{
		System.out.println("ChildDemo class Constructor");
	}
	
	public void getData()
	{
		System.out.println("I am child demo method");
	}
	
	public static String setData()
	{
		String name = "Mitu";
		
		System.out.println("Values of String :" +name);
		return name;
		
	}
	void eat(int a)
	{
		System.out.println("Animals are eating ......!");	
	}
}
