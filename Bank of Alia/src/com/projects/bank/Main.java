package com.projects.bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		switchyswitch();
	}

	public static void switchyswitch() {
		
		UserImplementation user = new UserImplementation();
		Scanner uncleStan = new Scanner(System.in);
		int choice = 0;
		boolean leaves = true;
		do {
			if(choice == 9) {
				leaves = false;
			}
		System.out.println("Please press one!");
		choice = uncleStan.nextInt();
		switch(choice) {
		
			//login
			case 1:
				System.out.println("Enter ID please!");
				int idpls = uncleStan.nextInt();
				System.out.println("Enter password please!");
				String psstpsst = uncleStan.next();
				user.login(idpls, psstpsst);
				break;
			
			//view
			case 2:
			
				break;
			
			//update
			case 3:
			Scanner scanningStan = new Scanner(System.in);
			System.out.println("what's the password");
			psstpsst = scanningStan.nextLine();
			System.out.println("what's the id");
			idpls = scanningStan.nextInt();
			user.updateUser(psstpsst, idpls);
			System.out.println("thanks it's done");
				break;
			
			//deposit
			case 4:
			
				break;
			//withdrawal
			case 5:
			
				break;
			//create
			case 6:
			
				break;
			//delete
			case 7:
			
				break;
			//logout
			case 8:
			
				break;
			//exit
			case 9:
				leaves = false;
				break;
			//invalid input
			default:
				System.out.println("Try again buster");
				break;
			}
		} while(leaves == true);
	}

}
