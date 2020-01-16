package com.revature.constructor;

/*
 * Constructors
 * How we instantiate an object
 * Returns instance of class, no specified return type
 * Default constructor is automatically created if one is not included in a class
 * If constructor is included, default one is lost
 */

public class ConstructorDemo {
	public static void main(String [] ralph) {
	//	C c = new C();
	}
}
class A{
	A(){
		System.out.println("Inside of A's Constructor");
	}
}
class B extends A{
	/*
	 * Example of default constructor:
	 * B(){
	 * super() <- implicit
	 * }
	 */
	B(){
		System.out.println("Inside of B's Constructor");
	}
}

class C extends B{
	C(){
		System.out.println("Inside of C's Constructor");
	}
}
