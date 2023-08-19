package SuperKey;

public class Dogs extends ChildDemo {
	
	
	public Dogs(){
		super(); // need to dicussion with RITU.
	}
	
	@Override
	void eat(int a) // Need to discussion with RITU because method signature is same in parent and child class.
	{
		System.out.println("Eating meat...........!");
	}
	void bark()
	{
		System.out.println("Barking loudally...........!");	
	}
	
	void work()
	{
		super.eat(5); // Using Super key we can also call the method and variable of super call.
		bark(); // We can also call same class method to another same class methods.
		super.getData();
		System.out.println(super.fname);// also call the super's class variable using super key words
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs g = new Dogs();
		g.work();

	}

}
