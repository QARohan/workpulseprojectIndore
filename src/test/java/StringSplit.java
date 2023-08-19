
public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = new String("11/02/2022");
		
		String[] str1 = str.split("/", 5);
		
		for(String a : str1)
		{
			System.out.println(a);
		}
		
		
		String text = "Java is a fun programming language";
		
		// Split string from space
		String[] result = text.split(" ");
		
		for (String str2 : result)
		{
			System.out.println(str2 + ", ");
		}

	}

}
