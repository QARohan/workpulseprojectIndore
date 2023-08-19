package Polymorphism;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(Helper.Multiply(5, 6)); // Method Overloading // static types method
		System.out.println(Helper.multiply(5, 8)); // Method Overloading / static types method
		System.out.println(Helper.multiplay(5, 5, 9)); // Method Overloading / static types method
		
		Parent a; 
		
		a = new Subclass1();
		a.print();
		
		a = new Subclass2();
		a.print();
	};

}
