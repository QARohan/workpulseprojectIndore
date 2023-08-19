package Polymorphism;

import java.util.Arrays;

public class OverLoading {


	//When two or more methods in the same class have the same name nut different parameter, it's called overloading.
	
	public void process(int i, int j) {
		System.out.printf("Processing two integers:%d, %d", i, j);
		
	}

	public void process(int[] ints) {
		System.out.println("Adding integer array:" + Arrays.toString(ints));
	}

	public void process(Object[] objs) {
		System.out.println("Adding integer array:" + Arrays.toString(objs));
	}
	
	
}
