package BInding;

//1) this: to refer current class instance variable

public class StudentCalss {
	
	int rollno ; //same
	String name ; // same
	float  fee; // same
	
	StudentCalss(int rollno, String name, float fee) // same name passes on the arguments 
	                                                 // if different passes on the arguments
	{
	this.rollno = rollno;
	this.name = name;
	this.fee= fee;
	}
	
	void display()
	{
		System.out.println(rollno + " " + name + " "+ fee);
	}

}
//In the above example, parameters (formal arguments) and instance variables are same. 
//So, we are using this keyword to distinguish local variable and instance variable.

//If local variables(formal arguments) and instance variables are different, 
//there is no need to use this keyword like in the following program: