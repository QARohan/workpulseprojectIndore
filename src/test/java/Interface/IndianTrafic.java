package Interface;

public class IndianTrafic implements CentralTrafic, ContinentRules {
	
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Go for other destination ");
		
	}

	public void RedStop() {
		// TODO Auto-generated method stub
		System.out.println("Stop for other destination ");
		
	}

	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println("Wait for other destination ");
		
	}

	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Walking for other destination ");
		
	}

	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("Dance for other Parties ");
		
	}

	public void speaking() {
		// TODO Auto-generated method stub
		System.out.println("Speaking in front of other person ");
		
	}

	public static  void symbol()
	{
		System.out.println("Indian Symbol ");
		
	}

	public void healthPolicy() {
		// TODO Auto-generated method stub
		
		System.out.println("Terms and conditions are applied for Health Policy ");
		
	}

	public void medicalCalim() {
		// TODO Auto-generated method stub
		System.out.println("Terms and conditions are applied for Medical Claim ");
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        CentralTrafic ct = new IndianTrafic(); // Create object of CentralTrafic // Upcasting 
		ct.greenGo();
		ct.RedStop();
		ct.FlashYellow();
		
		System.out.println(" ");
		
		ContinentRules cr = new IndianTrafic(); // Create object of ContinentRules // upcasting
		cr.walk();
		cr.dance();
		cr.speaking();
		System.out.println(" ");
		
	    cr.healthPolicy(); // extends interface under the Continent Rules so we can call method with cr.
	    cr.medicalCalim(); // extends interface under the Continent Rules so we can call method with cr.
		
		System.out.println(" ");
		
		//IndianTrafic it = new IndianTrafic(); // Create object of own main class method
		//it.symbol();
		symbol(); // if method is static so don't need to object of main class
		
		
		
		
		
	}

	
	
}
