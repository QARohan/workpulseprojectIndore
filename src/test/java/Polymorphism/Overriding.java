package Polymorphism;

import java.util.Arrays;

public class Overriding extends OverLoading {
	
	//When the method signature(name and parameter) are the same in superclass and childclass, it's called overriding.
	@Override
	public void process(int i, int j) {
		System.out.printf("Processing two integers:%d, %d", i, j);
		
		
	}
	
    @Override
	public void process(int[] ints) {
		System.out.println("Adding integer array:" + Arrays.toString(ints));
	}

}
