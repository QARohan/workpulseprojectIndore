package Encapsulation;

public class TestEncapulation {

	public TestEncapulation() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentAccount obj = new StudentAccount();
		
		obj.setAcc_no(45445454);
		obj.setAmount(50000);
		obj.setEmail("rohankg@gmail.com");
		obj.setName("Rohan Gupta");
		
		System.out.println(obj.getAcc_no()+ " "+ obj.getAmount()+ " " +obj.getEmail()+ " " +obj.getName());		

	}

}
