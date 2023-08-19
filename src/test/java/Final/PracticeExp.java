package Final;

public class PracticeExp {
	
	
	final int i =10;
	
	public  int changeValues()
	{
	     //  i =20 ;	// Compilation error
	       return 5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeExp px = new PracticeExp();
      System.out.println(px.changeValues());
	}

}
