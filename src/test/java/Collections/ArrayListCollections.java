package Collections;

import java.util.ArrayList;

public class ArrayListCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList have a dynamically size where you can add by array or remove by array
		
//		ArrayList<Integer> a = new ArrayList<Integer>();
//		a.add(12);
//		System.out.println("Values of arrayList : "+a);
//		a.add(15);
//		a.add(15); // ArrayList accept the multiple values of array 
//		System.out.println("Values of arrayList : "+a);
//		a.add(0, 10);
//		System.out.println("Values of arrayList : "+a);
//		a.remove(2);
//		System.out.println("Values of arrayList : "+a);
//		a.size();
//		System.out.println("Values of arrayList : "+a);
//		a.get(0); // Pull the values using array Index
//		System.out.println("get : "+a);
//		a.contains(15);
//		System.out.println("Contains: "+a);
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Rohan");
		System.out.println("Values of arrayList : "+a);
		a.add("Gupta");
		System.out.println("Values of arrayList : "+a);
		a.remove(0);
		System.out.println("Values of arrayList : "+a);
		a.remove("gupta");
		System.out.println("Values of arrayList : "+a);
		a.indexOf("rohan");
		System.out.println("Values of arrayList : "+a);
		a.size();
		System.out.println("Values of arrayList : "+a);
		a.add("Rohan");
		System.out.println("Values of arrayList : "+a);
		a.add("Rohan"); // Access duplicate values 
		System.out.println("Values of arrayList : "+a);
		

	}

}
