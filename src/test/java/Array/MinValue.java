package Array;

public class MinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int min = a[0][0];
		
		for(int i=0;i<3;i++)//row
		{
			for (int j=0; j<3; j++)// column
			{
				if (a[i][j]<min)//2
				{
					min = a[i][j];
				}
			}
			System.out.println(min);
		}

	}

}
