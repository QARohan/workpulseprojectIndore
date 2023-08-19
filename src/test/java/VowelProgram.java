
public class VowelProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "I love Testing";
		int count = 0;
		
		for (int i=0; i<=name.length()-1;i++)
		{
			if(name.charAt(i) == 'a'|| name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'|| name.charAt(i) == 'u' )
			{
				count++;
			}
					
		}
		
		System.out.println("Counts Detail =" +count);
		
		
		
		
		String st1 = "RohanGUpta";
		String rev= "";
		for(int i = st1.length() - 1; i >= 0; i--)
		{
			rev= rev+st1.charAt(i);
		}
				
		System.out.println("Reverse of String = " +rev);
		

	}
	

	
}


