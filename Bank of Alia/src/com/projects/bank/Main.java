package com.projects.bank;

public class Main {

	public static void main(String[] args) {
		String firstname = "jinjun";
		String lastname = "zhen";
		
		UserImplementation user = new UserImplementation();
		user.selectUserByName(firstname, lastname);
		
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
