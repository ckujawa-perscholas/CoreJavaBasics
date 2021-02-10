package com.perscholas.java_basics;

public class JavaBasics {

	public void addIntegers() {
		int one = 1;
		int two = 2;
		
		int three = one + two;
		
		System.out.println("addIntegers: " + three);
	}
	
	public void addDoubles() {
		double one = 1d;
		double two = 19d;
		
		double three = one + two;
		
		System.out.println("addDoubles: " + three);
	}
	
	public void addMixed() {
		int one = 1;
		double two = 2d;
		
		double three = one + two;
		
		System.out.println("addMixed: " + three );
	}
	
	public void divideLargestInt(int one, int two) {
		
		int three = -1;
		
		if ( one > two) {
			three = one/two;
		} else {
			three = two/one;
		}
		
		System.out.println(three);
	}
	
	public void divideDoubles() {
		double one = 100d;
		double two = 5d;
		
		double three = one / two;
		
		System.out.println("Three as Double: " + three);
		System.out.println("Three as Integer: " + (int)three);
	}
	
	public static void main(String[] args) {
		JavaBasics basics = new JavaBasics();
		
		basics.addIntegers();
		basics.addDoubles();
		basics.addMixed();
		basics.divideLargestInt(25, 5);
		basics.divideLargestInt(6, 48);
		basics.divideDoubles();
	}

}
