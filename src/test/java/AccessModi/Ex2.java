package AccessModi;

public class Ex2 {
	
    int i = 10;
    
    public void all(int i)
    {
    	this.i = i;
    	System.out.println("Values of i :" +i);
    			
    }
	
	void getData()
	{
		System.out.println("Values of i : "+i);
		
	}
	
	@SuppressWarnings("unused")
	private void setData()
	{
		int i = 10;
		System.out.println("Values of I :" +i);
				
	}
	
	protected void valuesFetch()
	{
		System.out.println("Values of i :" +i);
		
	}

}
