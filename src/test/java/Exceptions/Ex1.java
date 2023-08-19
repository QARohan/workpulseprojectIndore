package Exceptions;

public class Ex1 {
	
	
	int i= 5 ;
	int j = 0;
	
 public void getData() throws IndexOutOfBoundsException, ArithmeticException, TypeNotPresentException
 {
	
	 
	 try
	 {
	 int k = i/j;
		 
    // int arr[] = new int[5];		 
	 System.out.println("Values of k :" +k);
     //System.out.println(arr[10]);
	 }
	 catch(Exception e) {
		 
		 System.out.println("This is exceptional error");
		 
	 }
	 finally
	 {
		 System.out.println("Deleted all cookies !!");
	 }
 }
	
	
	

}
