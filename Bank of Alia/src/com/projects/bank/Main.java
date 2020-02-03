package com.projects.bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanningStan = new Scanner(System.in);
		System.out.println("what's the password");
		String psstpsst = scanningStan.nextLine();
		System.out.println("what's the name 1");
		String firstname = scanningStan.nextLine();
		System.out.println("what's the name 2");
		String lastname = scanningStan.nextLine();
				
		UserImplementation user = new UserImplementation();
		user.updateUser(psstpsst, firstname, lastname);
		
		System.out.println("thanks it's done");
		
	}
	
	public boolean login(String a , String b) {

		//checks if the entered and stored password are the same!
		if(a.equals(b)) {

			return true;

		}else {

			return false;
		}
	}
	
	
}
