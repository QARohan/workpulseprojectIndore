package SuperKey;

import AccessModi.Ex2;

public class ThikKey extends ChildDemo {
	
	
	
	double a ; // global variable 
	
	ThikKey(double a)
	{
		this.a = a; //constructer  variable 
	}
	
	public   void getData()
	{
		int a= 5; // local variable
		
		System.out.println("Values of local variable a : " +a);
		System.out.println("Values of Global variable a : " + this.a);
		
		double z = this.a+a;
		
		System.out.println("Values of Global+Local  variable Z : " +z);
		
		
	}

	public static String setData()
	{
	 	String name = "rohan";
		
		System.out.println("Values of String :" +name);
		return name;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThikKey th = new ThikKey(10.5);
		th.getData();
		ChildDemo.setData();

		//Ex2 obj = new Ex2();// calling other call package import AccessModi.Ex2;
		//obj.getData();// out site of the package : you can not access the default access modifiers.
	}

}
