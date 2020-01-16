package com.revature.loops;

import com.revature.bean.Person;

public class LoopyLoops {
	
	/*
	 * If statement
	 * for decision making
	 * provides multiple paths of execution
	 * 
	 * if(<conditional>){
	 * <what to do if true>
	 * }else if(<second conditional>){
	 * <what to do if second conditional is true>
	 * )else{
	 * <what to do if false>}
	 */
	
	public static void oldCheck(int age) {
		if(age > 60) {
			System.out.println("Hey, you're old!");
		}else {
				System.out.println("Hey, you're young!");
			}
		}
	
	/*
	 * Switch cases
	 * provides multiple paths of execution based on some value
	 * based on an integer, string, char, bool or enum
	 */
	
	public static void whatColor(String color) {
		
		switch(color) {
		
			case "green":
				System.out.println("grass");
			break;
		
			case "pink":
				System.out.println("Alia's hair");
			break;
				
			case "yellow":
				System.out.println("Amanda's sweet blazer");
			break;
			
			case "brown":
				System.out.println("a delicious monster");
			break;
			
			default:
				System.out.println("you're dumb");
			break;
		}
	}
	
	/*
	 * For loops
	 * for(a; b; c) {do something}
	 * a is variable declaration (counter)
	 * b is condition controlling how far the loop goes
	 * c is the incrementor/decrementor
	 */
	
	public static void forLoopFunness(int p) {
		for(int i = p; i > 0; i --) {
			if(i == 10) {
				break;
			}
			System.out.println(i);
		}
	}
	
	/*
	 * Enhanced for loop aka for each
	 * for (x:<Array of Collection>){do thing}
	 * good for moving through collections, arrays and other iterables
	 * more CPU efficient
	 * no issues w/index out of bounds, not size dependent
	 * good for accessing elements in one collection
	 * bad for adding or removing
	 */
	
	static int [] myArray = {11, 32, 45, 65, 76, 8, 9};
	
	public static void forEachFun(int[] a) {
		// traditional way to do for loop
		// for(int i = 0; i < a.length; i++)
		for (int i:a) {
			System.out.println(i);
		}
	}
	
	/*
	 * While loops
	 * while(<conditional>) {<do something>}
	 * 
	 * do while
	 * do{<do thing>} while(<conditional>)
	 */
	
	public static void wileyWhile(int i) {
		
		while(i++ < 10) {
			System.out.println("Man, loops are so much fun!");
			// i++;
		}
	}
	
	public static void doWileyWhile(int i) {
		
		do {
			System.out.println("do thing");
			i ++;
		} while(i < 10);
	}
	
	public static void main(String[] args) {
		oldCheck(1237);
		oldCheck(59);
		whatColor("green");
		forLoopFunness(25);
		forEachFun(myArray);
		wileyWhile(3);
		doWileyWhile(3);
		Person p = new Person("Matt", 33, 260);
		Person q = new Person("Matt", 33, 260);
		System.out.println(p.equals(q));
		System.out.println(p==q);
	}
	
	/*
	 * Conditionals
	 * Logical Operators
	 * < > <= >= != ++ --
	 * OR
	 * a|b - bit wise
	 * a||b - short circuit OR if a is true, return true w/o b
	 * AND
	 * a&b - bit wise
	 * a&&b - checks both and evaluates to true iff both are true
	 * EQUALS
	 * ==
	 * compare values of primitives
	 * compare the reference for objects NOT THE CONTENTS
	 * != is good for checking nulls
	 * .equals()
	 * method inherited Object
	 * All reference types have it
	 * looking at content
	 */
}
