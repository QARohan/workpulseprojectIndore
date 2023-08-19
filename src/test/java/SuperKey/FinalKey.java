package SuperKey;

import StudentTask.Student; // other calling the packages 

public class FinalKey extends ChildDemo {

	final int i = 5;
	
	FinalKey()
	{
		//i++;
		System.out.println("Values of fina key :" +i);
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKey obj = new FinalKey();
		ChildDemo obj1 = new ChildDemo();
		ChildDemo.setData();
		
		Student s1 = new Student(); // Package name is import StudentTask.Student;
				
	}

}
