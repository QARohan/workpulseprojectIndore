
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev = " ", s1 = "ROHAN";
		String crev= "";

		for (int i = s1.length() - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
			rev.toLowerCase();
		}
		System.out.println("Reverse String values :" + rev);
		
		for (int j=1;j<rev.length()-1;j++)
		{
			crev = crev+rev.charAt(j);
			//System.out.println(crev.toLowerCase());
			StringBuffer strB = new StringBuffer(rev);
			strB.toString();
			strB.setCharAt(j, 'n');
			System.out.println(strB);
			
			break;
		}
		
	}
	
	

}
