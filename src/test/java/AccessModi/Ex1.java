package AccessModi;

public class Ex1 extends Ex2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex1 obj = new Ex1();
		//obj.getData();
		//obj.valuesFetch();
		obj.valuesFetch(); // protected access modifiers , You use this access modifiers by extends keyword.
		obj.getData(); // default access modifiers, you use this access modifiers within only the package 
		obj.all(50); // Public AM, you use any where of the package.
		System.out.println("balmukund sahu");

	}

}
