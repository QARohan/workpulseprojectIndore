
public class Extractlast4Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "My name is Rohan Gupta djlksadjaslkd lsdhsaldashdl";
		//String extractLast4Char = name.substring(18, 22);
		String extractLast4Char = "";
		for(int i=0; i<=name.length()-1;i++)
		{
			if (name.charAt(i)== 'r'||name.charAt(i)== 'o'||name.charAt(i)== 'h'||name.charAt(i)== 'a'||name.charAt(i)== 'n')
			{
				extractLast4Char = extractLast4Char+name.charAt(i);
			}
		}
		System.out.println("Last 4 Char :" +extractLast4Char);

	}

}
