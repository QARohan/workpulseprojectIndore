package Interface;

public class CallRecCirDra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drawable obj = new Rectangle(); //Upcasting means, Create the object behalf of the super class. 
		obj.draw();
		obj = new Circle();
		obj.draw();
				

	}

}
