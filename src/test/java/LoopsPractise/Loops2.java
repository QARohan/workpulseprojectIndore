package LoopsPractise;

public class Loops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = 1;
		for (int i = 1 ; i<=4 ; i++)
		{
			for(int j =1; j<=4-i; j++)
			{
				for (int l = 1 ; l<=4-j; l++)
				{
					System.out.print("\t");
					
				}
				System.out.print(k);
                System.out.println(" ");	
                k++;
				
				
			}
					
					}
				
	}
		
		
	}


