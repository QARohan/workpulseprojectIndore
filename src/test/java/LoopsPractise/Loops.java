package LoopsPractise;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int k = 1;
		for (int i =1; i<=4; i++) // outer  loop
		{
			for (int j =1; j <=i; j++ ) // inter loop
			{
				System.out.print(k*3);
				System.out.print("\t");
				k++;
				
		}
			System.out.println("");
			//k--;
		}
		
		System.out.println( " ");
		
		int l =1;
		for (int m=0; m<=4 ;m++)
		{
			for (int n=1; n<=4-m; n++)
			{
				System.out.print(l);
				System.out.print("\t");
				l++;
			}
			System.out.println("");
		}
	}

}
