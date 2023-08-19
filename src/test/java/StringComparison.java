
public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "rohan";
		String s2 = "rohan";
		
		if (s1.compareTo(s2)==0)
		{
			System.out.println("Strings are equal !!");
		}else 
		{
			System.out.println("Strings are not equal !!");
		}
		
		String values = "My Name is Rohan Gupta";
		String[] str= values.split(" ");
		//String str[] = values.split(" "); // Same out using this line
				for(String str1 : str )
		{
			System.out.println(str1.trim());
		}
		
	}

}
