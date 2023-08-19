package StudentTask;

import SuperKey.FinalKey;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.display();
		Student s2 = new Student();
		s2.display();
		
		

	}
	
	public void display()
	{
		int rno = 123;
		String name = "Pankaj";
		String branch = "CS";
		
		System.out.println("Roll Number :" +rno);
		System.out.println("Name of Student :" +name);
		System.out.println("Branch of student :" +branch);
		System.out.println("----------------------");
		}

}
