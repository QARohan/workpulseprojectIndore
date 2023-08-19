package Constructor;

public class Secondconstructor {

	int i , j , k;
	
	
	public Secondconstructor( int i)
	{
		this.i = i;
		System.out.println(i);
	}
	
	public Secondconstructor(int i, int j)
	{
		this(i);
		this.j = j;
		System.out.println(j);
		
	}
	
	public Secondconstructor(int i , int j , int k)
	{
		this(i,j);
		this.k = k;
		System.out.println(k);
	}
}
