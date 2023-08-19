package SuperKey;



public class ParentDemo extends ChildDemo {
	
	
	 String fname = "Mitu";
	 String lname = "Gupta3";
	
	public ParentDemo()
	{
		//super();// this should be always be at first line
		System.out.println("Parent class Constructor");
		
	}
	
	public void getSuperKeyword(String s, String s1)
	{
		//System.out.println(fname);
		//System.out.println(lname);
		
		System.out.println(super.fname);
		System.out.println(super.lname);
		
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("I am Parent demo method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentDemo pd = new ParentDemo();
				pd.getSuperKeyword("r", "g");
				pd.getData();

	}

}
