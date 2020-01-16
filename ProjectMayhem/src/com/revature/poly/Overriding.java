package com.revature.poly;

import com.revature.staticfun.FunWithStatic;

public class Overriding {
	/*
	 * Overriding methods
	 * Parent-Child class relationship
	 * methods have same signature (modifiers,
	 * 		name, parameters, and any exceptions
	 * Before Java 1.5, had to have same return type
	 * After 1.5, co-variant return type (inheritance chain)
	 * Parent must have higher level object than child
	 */
	
	public static void main(String[] args) {
		
		Mammal m = new Mammal();
		// m.eat();
		Pitbull p = new Pitbull();
		// p.eat();
		p.eat1();
		p.str = "Woo";
		p = new Pitbull();
		System.out.println(p.str);
		
		FunWithStatic fws = new FunWithStatic();
		fws.nonStaticMethod();
		FunWithStatic.staticMethod();
		fws.staticMethod();
	}

}
