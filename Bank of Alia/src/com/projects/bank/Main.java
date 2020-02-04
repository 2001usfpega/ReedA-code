package com.projects.bank;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        switchyswitch();
    }

    public static void switchyswitch() {

        UserImplementation user = new UserImplementation();
        OneUserToRuleThemAll one = user.login(1000, "psstpsst");
        Scanner uncleStan = new Scanner(System.in);
        int choice;
        boolean staystaystay = true;
        do {
            System.out.println("Hi! Welcome to Chili's!");
            System.out.println("AKA The Bank of Alia!");
            System.out.println("We hope you enjoy your time with us : )");
            System.out.println("If you are a returning user, " +
                    "press 1 to login and view your account!");
            System.out.println("If you are a new user, press 2 to create your account!");

            choice = uncleStan.nextInt();
            if (choice == 0) {
                staystaystay = false;
            }

            switch (choice) {

                //login and view
                case 1:
                    System.out.println("Enter ID please!");
                    int idpls = uncleStan.nextInt();
                    System.out.println("Enter password please!");
                    String psstpsst = uncleStan.next();
                    user.login(idpls, psstpsst);
                    user.selectUserByID(idpls);

                    System.out.println("Would you like to:\n");
                    System.out.println("1. Deposit into your account!");
                    System.out.println("2. Withdraw from your account!");
                    System.out.println("3. Update account details!");
                    System.out.println("4. Delete account!");
                    System.out.println("5. Logout!");
                    System.out.println("6. Exit this app : (");

                    boolean dadmin = user.isDadmin(idpls).isDadmin();
                    if (dadmin) {
                        System.out.println("7. View all users! o.O");
                        System.out.println("8. Delete all users! >:)");
                    }

                    choice = uncleStan.nextInt();
                    switch (choice) {
                        //deposit
                        case 1:
                            System.out.println("How much would you like to deposit?");
                            int amount = uncleStan.nextInt();
                            System.out.println("Would you like to deposit in your\n1. checking account" +
                                    "\n2. savings account?");
                            int choices = uncleStan.nextInt();
                            if (choices == 1) {
                            	one.checkpls += amount;
                                user.updateUserChecking(one.checkpls, idpls);
                            }else if(choices == 2){
								one.savesave += amount;
								user.updateUserChecking(one.savesave, idpls);
							}

                            break;

                        //withdrawal
                        case 2:
							System.out.println("How much would you like to withdraw?");
							amount = uncleStan.nextInt();
							System.out.println("Would you like to withdraw from your:\n1. Checking account" +
									"\n2. Savings account?");
							choices = uncleStan.nextInt();
							if (choices == 1) {
								one.checkpls -= amount;
								user.updateUserChecking(one.checkpls, idpls);
							}else if(choices == 2){
								one.savesave -= amount;
								user.updateUserChecking(one.savesave, idpls);
							}
                            break;

                        //update
                        case 3:
                            Scanner scanningStan = new Scanner(System.in);
                            System.out.println("what's the password");
                            psstpsst = scanningStan.nextLine();
                            System.out.println("what's the id");
                            idpls = scanningStan.nextInt();
                            user.updateUserPassword(psstpsst, idpls);
                            System.out.println("thanks it's done");
                            break;

                        //delete
                        case 4:
                            System.out.println("Please enter the ID of the user you wish to delete!");
                            idpls = uncleStan.nextInt();
                            user.deleteUser(idpls);
                            break;

                        //logout
                        case 5:
                            System.out.println("Thank you! Please come again!");
                            break;

                        //exit
                        case 6:
                            staystaystay = false;
                            break;

                        //view all
                        case 7:
                            List<OneUserToRuleThemAll> users = UserImplementation.selectAllUsers();
                            for (OneUserToRuleThemAll u : users) {
                                System.out.println(u);
                            }
                            break;

                        // delete all
                        case 8:

                            break;

                        default:
							System.out.println("Try again buster!");
                            break;
                    }
                    break;
                    //create
                case 2:
                    System.out.println("What's the first name of the new account holder?");
                    String firstname = uncleStan.next();
                    System.out.println("What's the last name of the new account holder?");
                    String lastname = uncleStan.next();
                    System.out.println("Set a password!");
                    psstpsst = uncleStan.next();
                    user.insertUser(firstname, lastname, psstpsst);
                    break;

                //invalid input
                default:
                    System.out.println("Try again buster");
                    break;

            }
        } while (staystaystay);
    }
}
