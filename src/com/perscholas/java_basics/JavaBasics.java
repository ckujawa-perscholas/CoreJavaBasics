package com.perscholas.java_basics;

public class JavaBasics {

	public void addIntegers() {
		Integer one = 1;
		Integer two = 2;
		
		Integer three = one + two;
		
		System.out.println(three);
	}
	
	public void addDoubles() {
		Double one = 1d;
		Double two = 19d;
		
		Double three = one + two;
		
		System.out.println("addDoubles: " + three);
	}
	
	public static void main(String[] args) {
		JavaBasics basics = new JavaBasics();
		
		basics.addIntegers();
	}

}
