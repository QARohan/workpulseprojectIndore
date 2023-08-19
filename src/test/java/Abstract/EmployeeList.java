package Abstract;

public class EmployeeList extends EmployeeDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDetail em = new EmployeeList();
		em.empAge();
		em.empLastNmae();
		em.empName();
		

	}

	@Override
	public void empAge() {
		// TODO Auto-generated method stub
		
		System.out.println("30");
		
	}

}
