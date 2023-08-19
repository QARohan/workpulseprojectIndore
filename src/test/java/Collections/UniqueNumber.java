package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;




public class UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 ArrayList<Integer> values = new ArrayList<Integer>();
	 values.add(1);
	 values.add(2);
	 values.add(3);
	 values.add(1);
	 values.add(5);
	 values.add(6);
	 values.add(7);
	 values.add(1);
	 int count =0;
//	 for(int i=0; i<values.size(); i++) {
//		 count = count +i;
//	 }
//	 System.out.println(count);
	 
	 int g= (int) values.stream().count(); // verify the array count
	 System.out.println(g);
	 int v=  (int) values.stream().distinct().count(); // remove the duplicate count 
	 System.out.println(v);
	 values.stream().map(s -> s.shortValue()>3).forEach(s-> System.out.println(" Map the values of integer type array :"+s));
	 long d= Stream.of("Rohan", "RGupta", "SusariR", "Mitu", "G").filter(c-> c.startsWith("R")).count();
	 long de= Stream.of("Rohan", "RGupta", "SusariR", "Mitu").filter(c-> c.endsWith("R")).count();
	 System.out.println("Values of array which is end With from the letter of R :" +d);
	 System.out.println("Values of array which is end With from the letter of R :" +de);
	 //Print all the names of array list
	 Stream.of("Rohan", "RGupta", "SusariR", "Mitu").filter(s->s.length()>2).forEach(s->System.out.println("Print the all values are size is greater than 2 :"+s));	 
    		 
	} 
}
