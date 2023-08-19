package Polymorphism;

public class OverloadingMainMethod extends OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverLoading or = new OverLoading();
		or.process(5, 10);
		int a[]={33,3,4,5};
		or.process(a);
		Object[] objs = new Object[]{3,4};
		or.process(objs);
		Overriding og = new Overriding();
		og.process(a);
		og.process(5, 8);
		
	}

}
