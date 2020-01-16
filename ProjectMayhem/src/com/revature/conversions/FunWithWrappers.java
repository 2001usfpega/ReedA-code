package com.revature.conversions;

public class FunWithWrappers {

/*
 * Wrappers
 * Wraps around a primitive and allows it to be treated as an object
 *Character
 *Boolean
 *Byte
 *Short
 *Integer
 *Long
 *Float
 *Double
 *Why wrappers? Good for utility methods
 *use when we NEED an object
 */

static int myInt = 3;
static Integer myInteger = 5;
static Integer newInteger = 7;
static Double myDouble = 45.32;

public static void main(String[] args) {
	myInteger.byteValue();
	// Autoboxing - implicit conversion from primitive to wrapper
	System.out.println(addEmUp(myInteger.doubleValue(), myDouble));
	// Auto-unboxing - implicit conversion from wrapper to primitive
	System.out.println(addEmUp(myInteger, newInteger));
	// Boxing is expensive
	// Number is a wrapper for all numeric types
	System.out.println(addEmUp(myInt, newInteger));
}
	public static int addEmUp(int a, int b) {
		return a + b;
	}

	public static double addEmUp(Double a, Double b) {
		return a + b;
	}
	
	public static double addEmUp1(Number a, Number b) {
		return a.doubleValue() + b.doubleValue();
	}
}
