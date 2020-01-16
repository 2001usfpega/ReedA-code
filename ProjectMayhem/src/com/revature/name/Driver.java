package com.revature.name;

// import java.sql.*;
// import static java.util.*;

import com.revature.bean.Person;

public class Driver {
	
	// single line comment
	/*
	 * multi
	 * line
	 * comment
	 * yeet
	 * 
	 * Naming Conventions
	 * 	ClassesAndProjects
	 * 	methodsAndVariables
	 * 	package.package
	 * 	CONSTANTS_CONSTANTS
	 */
	
	// Main method - entry point for the application
	
	public static void main(String [] args) {
		// public - access modifier so everybody can "see" the code
		// static - belongs to class, no object needed
		// void - doesn't return anything
		// main - name of method
		// String [] args - an array of strings called args
		
		int a = 3;
		int b = 46;
		int c = a + b;
		
		System.out.println("I like to eat " + c + " tacos.");
		
		/*
		 * Members of a class - can have different forms
		 * Variables, methods, constructors
		 * Instance variables - belongs to specific object
		 * Static variables - belongs to class/all instances
		 * Instance methods - behavior related to a specific object
		 * Static methods - behavior relative to the entire class
		 * Constructors - instantiates the class using the keyword "new"
		 */
		
		Person p = new Person();
		p.setName("Jim");
		System.out.println(p);
		Person q = new Person("BobPam", 81, 27);
		System.out.println(q);
	}
}
