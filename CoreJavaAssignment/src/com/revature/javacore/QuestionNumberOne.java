package com.revature.javacore;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

// import other package for Q#11
import com.revature.javacore2.*;

// named it before i realized i was gonna put all the questions
// in one file and couldn't figure out how to change it
public class QuestionNumberOne {
	
	// declare aliasArray for bubble sort in michaelBuble
	static int aliasArray[] = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
		
	// at first i kept forgetting main and that was a Very Bad Time
	public static void main(String[] args) {
		
		System.out.println("Hello and welcome to Alia's Java Core Assignment!\n");
		
		// call Q#1
		michaelBuble(aliasArray);
		// call Q#2
		fFFiboNaCcI(25);
		// call Q#3
		throwItInReverse();
		// call and print Q#4
		System.out.print("7! = " + themsTheFacts(7));
		// print happy statement
		System.out.print("\nWe successfully calculated 7 factorial!");
		// call Q#5
		submarine(17);
		// call Q#6
		evenSteven(17);
		// call Q#7
		comparator3000();
		// call Q#8
		arrMeHearties();
		// call Q#9
		amazonPrime();
		// call Q#10
		minnieMouse();
		// call Q#11
		floatYourBoat();
		// call Q#12
		evenSteven2();
		// call Q#13
		illuminati();
		// call Q#14
		nintendoSwitch();
		// call Q#15
		calculator();
		// call Q#16
		commanderLine(args);
		// call Q#17
		imInterested();
		// call Q#18
		abstractMethods();
		// call Q#19
		primeClass();
		// call Q#20
		readABook();
								
	}
	
	// QUESTION 1
	// used GeeksForGeeks to understand how a bubble sort works
	// i swear i'm not plagiarising
	static void michaelBuble(int []aliasArray) {
		
			// iterate through aliasArray
			for (int i = 0; i < aliasArray.length; i++) {
				// second iteration
				for (int j = 0; j < (aliasArray.length - i - 1); j++) {
					// comparison statement
					if (aliasArray[j] > aliasArray[j + 1]) {
						// is j < or > than j + 1?
						int tempyTemp = aliasArray[j];
						aliasArray[j] = aliasArray[j + 1];
						aliasArray[j+1] = tempyTemp;

					}
					
				}
				// print array
				System.out.print(aliasArray[i] + " ");

			}
			// print happy statement
			System.out.println("\nWe're bubble sorted! Yay!\n");
			
		}
	
	// QUESTION 2
	// you must pronounce this appropriately
	static void fFFiboNaCcI(int nomNom) {
		
		// instantiate number variables
		int nomNom1 = 0;
		int nomNom2 = 1;
		int i = 0;
		
		// iterate through the first 25 numbers
		while (i < 25) {
			// print out numbers
			System.out.print(nomNom1 + " ");
			// adding previous two numbers in sequence
			int nomNom3 = nomNom1 + nomNom2;
			// setting old numbers to the new numbers
			nomNom1 = nomNom2;
			nomNom2 = nomNom3;
			// continuing to the next count
			i++;
		}
		// print happy statement
		System.out.println("\nWe've calculated and printed the "
				+ "first 25 numbers in the Fibonacci sequence!");
	}
	
	// QUESTION 3
	// we had toy story 2 on when i wrote this
	// i will admit it influenced the variable names somewhat
	static void throwItInReverse() {

		// instantiate string
		String backItUp = "Take it on back now y'all!";
		
		// print initial string
		System.out.println("\n" + backItUp);
		
		// turn string into character array
		char[] beepBeep = backItUp.toCharArray();
		
		// print it backwards!
		for (int i = (beepBeep.length - 1); i >= 0; i --)
			System.out.print(beepBeep[i]);
		
		// print happy statement
		System.out.println("\nWe successfully reversed a string!\n");
	}
	
	// QUESTION 4
	// help i can't figure out how to put the print
	// statements inside this function
	static int themsTheFacts(int fF) {
		
		// use ternary operators to find factorial
		// is fF 0 or 1? return 1
		// if not then multiply them by the previous number
		return (fF == 0 || fF == 1) ? 1 : fF * themsTheFacts(fF - 1);
		
	}
	
	// QUESTION 5
	// strikingly similar to reverse function
	static void submarine(int indX) {
		
		// add extra line to separate answers
		System.out.println("\n");
		// initialize string
		String subbySub = "Let's all go to the Subway~";
		System.out.println(subbySub);
		// print what indexes we're printing to
		System.out.println("Index 0 through 17 = ");
		
		// convert to character array
		char[] glubbyGlub = subbySub.toCharArray();
		
		// iterate through array and print
		for (int i = 0; i <= indX; i++)
			System.out.print(glubbyGlub[i]);
		// print happy statement
		System.out.println("\nWe successfully wrote a substring method!");
	}
	
	// QUESTION 6
	// ternary operators!!!
	static void evenSteven(int eE) {

		
		// print statement
		System.out.println("\nThe number is we picked is 7!");
		// check if it's even or odd based on bit wise comparison and prints
		System.out.println(((eE & 0x01) == 1) ? "That number is odd!" : ""
				+ "\nThat number is even!");
		// print happy statement
		System.out.println("We successfully determined if 7 is even or odd!");
		
	}
	
	// QUESTION 7
	// had to make other classes for this and was incredibly gruntled
	static void comparator3000() {

		
		// make new instances of Employee
		Employee Winnie = new Employee("Winnie", "Honey", 74);
		Employee Piglet = new Employee("Piglet", "Pink", 77);
		Employee Tigger = new Employee("Tigger", "Bouncing", 72);
		Employee Eeyore = new Employee("Eeyore", "Tails", 76);
		Employee Roo = new Employee("Roo", "Kangaroos", 7);
		Employee Owl = new Employee("Owl", "Reading", 78);
		
		// put in ArrayList
		ArrayList<Employee> Bears = new ArrayList<Employee> ();
		Bears.add(Winnie);
		Bears.add(Piglet);
		Bears.add(Tigger);
		Bears.add(Eeyore);
		Bears.add(Roo);
		Bears.add(Owl);
		
		// print statement
		System.out.println("\nWe're going to sort the Winnie the Pooh"
				+ " characters by age!");
		
		// sort collection using SortByAge class
		Collections.sort(Bears, new SortByAge());
		// print collection
				for (int i = 0; i < Bears.size(); i++)
					System.out.println(Bears.get(i));
				// print statement
				System.out.println("We're going to sort the Winnie the Pooh"
						+ " characters by name!");
		Collections.sort(Bears, new SortByName());
		// print collection
				for (int i = 0; i < Bears.size(); i++)
					System.out.println(Bears.get(i));
				// print statement
				System.out.println("We're going to sort the Winnie the Pooh"
						+ " characters by department!");
		Collections.sort(Bears, new SortByDepartment());
		// print collection
		for (int i = 0; i < Bears.size(); i++)
			System.out.println(Bears.get(i));
		
		// print happy statement
		System.out.println("We did it!");
	}
	
	// QUESTION 8
	// god this took so much combined group effort pls appreciate
	static void arrMeHearties() {
		
		System.out.println("\nLook at this array list!");
		
		String arrAy[] = {"karan", "madam", "tom", "civic", "radar",
				"jimmy", "kayak", "john", "refer", "billy", "did"};
		ArrayList<String> arrAylist = new ArrayList<String> ();
		
		ArrayList<String> poundTheDrum = new ArrayList<String> ();
		
		ArrayList<String> dontPoundTheDrum = new ArrayList<String> ();

		Collections.addAll(arrAylist, arrAy);
		
		for (String i : arrAylist) {
			System.out.print(i + " ");
		}
					
		System.out.println("\nWe're going to put all the palindromes in this"
				+ " array list into another array list!");
				
		for (int i = 0; i < arrAylist.size(); i++) {
			
			String arrArr = arrAylist.get(i);
			
			String reVerse = new StringBuilder(arrArr).reverse().toString();
			
			 if (arrArr.equals(reVerse)) {
				 poundTheDrum.add(arrArr);
			 }else {
				 dontPoundTheDrum.add(arrArr);
			 }
		}
		
		System.out.println("Palindromes!");
		
		for (String i : poundTheDrum) {
			System.out.print(i + " ");
		}
		
		System.out.println("\nNon Palindromes!");
		
		for (String i : dontPoundTheDrum) {
			System.out.print(i + " ");
		}
		
		System.out.println("\nDifficult though it was, we finally did it!");
		
	}
	
	// QUESTION 9
	// the break in the if statement never bothered me anyway
	static void amazonPrime() {
	
		// make array list
		ArrayList<Integer> valuedPrimeCitizens = new ArrayList<Integer> ();
		
		// set max
		int top = 100;
		// iterate through numbers 1 to 100
		for (int i = 2; i < top; i++) {
			// set bool value to compare
			boolean primeDining = true;
			// comparing to all the previously added prime numbers
			for (int j : valuedPrimeCitizens) {
				// is it prime?
				if (i % j == 0) {
					primeDining = false;
					break;
				}
			}
			// if prime then add
			if (primeDining == true)
				valuedPrimeCitizens.add(i);
		}
		// print statement
		System.out.print("\nWe're going to find all prime numbers"
				+ " from 1 to 100!\n");
		// print prime numbers
		System.out.println(valuedPrimeCitizens);
		// print happy statement
		System.out.println("We did it!");
		
	}
	
	// QUESTION 10
	// moana was on at this point can you tell
	static void minnieMouse() {
		
		// create two variables
		int moana = 14;
		int maui = 24;
		
		// print statements
		System.out.println("\nWe're going to compare two numbers!");
		System.out.println("Moana is 14 and Maui is 24!");
		System.out.println("Who's older?");
		// use ternary operators to compare
		System.out.println(moana > maui ? "Moana is older than Maui!" : "Maui is older than Moana!");
		// print happy statement
		System.out.println("We successfully used ternary operators to find the minimum of two values!");
		
	}
	
	// QUESTION 11
	// float float float your boat gently down the stream
	static void floatYourBoat() {
		
		// print statements
		System.out.println("\nTwo float variables are in another package!");
		// print out floats from javacore2 package
		System.out.println("var = " + QuestionNumberEleven.var);
		System.out.println("varVar = " + QuestionNumberEleven.varVar);
		// print happy statement
		System.out.println("Here they are!");
	}
	
	// QUESTION 12
	// print the even ones
	static void evenSteven2() {
		
		// create array
		int evenEven[] = new int[101];
		// print statements
		System.out.print("\n");
		System.out.println("We're going to put 1 through 100 in an array!");
		System.out.println("We're also going to print the even numbers!");
		
		// iterate through array
		for (int i = 1; i <= 100; i ++) {
			
			// add to array
			evenEven[i] = i;
		}
		
		// create boolean value
		boolean odd = true;
		
		// enhanced for loop to print
		for (int i : evenEven) {
			
			// if i is even and not zero
			if(odd & i != 0) {
				
				// then print
				System.out.print(evenEven[i] + " ");
				
			}
			
			// reset boolean value
			odd = !odd;
			
		}
		
		// print happy statement
		System.out.print("\nWe did it!");
		
	}
	
	// QUESTION 13
	// illuminati is real
	static void illuminati() {
		
		// print statement
		System.out.print("\n\nWe're going to print a pyramid with for loops!");
		//initialize variable
		int tri = 0;
		
		// for loop for the length of pyramid
		for (int i = 0; i < 5; i++) {
			
			// for loop for the width of pyramid
			for (int j = 0; j < i; j++) {
				
				// print as we go
				System.out.print(tri);
				// reset value
				tri = 1 - tri;
				
			}
			// print width
			System.out.println();
			
		}
		
		// print happy statement
		System.out.println("We did it!");
		
	}
	
	// QUESTION 14
	// i love mine
	static void nintendoSwitch() {
		
		// initialize variable count
		int games = 3;
		
		System.out.println("\nWe're going to use a switch statement and print the string array!");
		
		// switch statement!
		switch(games) {
		
		// case 1 prints square root of 17
		case 1 : System.out.println("\n" + Math.sqrt(17));
			break;
		// case 2 prints today's date
		case 2 : LocalDate now = LocalDate.now();
				 System.out.println("\n" + now);
			break;
		// case 3 splits a string, stores it in a string array and prints it
		case 3 : String bananaSplit = "I am learning Core Java";
				 String bananya[] = bananaSplit.split(" ");
				 // iterates through array to print
				 for (int i = 0; i < bananya.length; i++) {
					 
					 System.out.print(bananya[i] + " ");		 
				 }
			break; 
		}
		
		// print happy statement
		System.out.println("\nWe did it!");
	}
	
	// QUESTION 15
	// had to make a separate interface file and class and was v gruntled
	static void calculator() {
		
		// declare variables
		double calculus1 = 14;
		double calculus2 = 17;
		
		// create object of calcCalc to call
		calcCalc clickClock = new calcCalc();
		
		// print statement
		System.out.println("\nWe're going to use an interface to add, "
				+ "subtract, multiply and divide 14 and 17");
		// call and print methods from interface
		System.out.println("14 + 17 = " + clickClock.addition(calculus1, calculus2));
		System.out.println("14 - 17 = " + clickClock.subtraction(calculus1, calculus2));
		System.out.println("14 * 17 = " + clickClock.multiplication(calculus1, calculus2));
		System.out.println("14 / 17 = " + clickClock.division(calculus1, calculus2));
		// print happy statement
		System.out.println("We did it!");
	}
	
	// QUESTION 16
	// insert elmo on the throne of hell gif
	static void commanderLine(String [] args) {
		// print statement
		// initialize variable to keep count of characters
		int countChocula = 0;
		// print statement
		System.out.println("\nWe're going to print a string using a command line argument!");
		// for loop to print the string
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
			// add all the characters plus spaces into variable
			countChocula += args[i].length() + 1;
		}
		// print character amount minus extra space at the end
		System.out.println("\nThere are " + (countChocula - 1) + " characters in this string!");
		
	}
	
	// QUESTION 17
	// don't go into debt kids it skyrockets so fast
	static void imInterested() {
		
			// open scanner
			Scanner scanningDan = new Scanner(System.in);
			// print statements and create variables to store user input
			System.out.println("\nPlease input the principal value!");
			double principalWincipal = scanningDan.nextDouble();
			System.out.println("Please input the rate of interest!");
			double rateAndSubscribe = scanningDan.nextDouble();
			System.out.println("Please input the number of years since you took the loan!");
			double payYourDebtFast = scanningDan.nextDouble();
			System.out.println("Your current interest is: ");
			// print current interest
			System.out.print("$" + principalWincipal * rateAndSubscribe * payYourDebtFast);
			// close scanner
			scanningDan.close();
		}

	// QUESTION 18
	// had to create more classes >.<
	static void abstractMethods() {
		
		System.out.println("\n\nWe're going to inherit abstract methods from a superclass!");
		System.out.println("We'll be using the string 'You are worthy of my grace.'");
		// create new instance of superMan class
		superMan Klark = new superMan();
		
		// call abstract methods from superMan class
		Klark.upperLower();
		Klark.convertCapital();
		Klark.convertInteger();
		
		// print happy statement
		System.out.println("We did it!");
		
	}
	
	// QUESTION 19
	// copied code from amazonPrime method to reuse here
	static void primeClass() {
		// print statement
		System.out.print("\nArrayList = ");
		// create an array list
		ArrayList<Integer> primeArray = new ArrayList<Integer> ();
		// add 1 through 10 to array list
		for (int i = 1; i <= 10; i++) {
			
			primeArray.add(i);
			System.out.print(primeArray.size() + " ");
			
		}
		
		int addedEvens = 0;
		// adds evens
		for (int i = 1; i < 10; i+=2) {
			
			addedEvens = addedEvens + primeArray.get(i);
			
		}
		// print statement
		System.out.println("\nThe even numbers added up are: " + addedEvens);
		
		int addedOdds = 0;
		// adds odds
		for (int i = 0; i < 10; i+=2) {
			
			addedOdds = addedOdds + primeArray.get(i);
			
		}
		// prints statement
		System.out.println("The odd numbers added up are: " + addedOdds);
		// make new array list
		ArrayList<Integer> primeArray2 = new ArrayList<Integer> ();
		
		// set max
		int top = 10;
		// iterate through numbers 1 to 10
		for (int i = 2; i < top; i++) {
			// set bool value to compare
			boolean primeDining = true;
			// comparing to all the previously added prime numbers
			for (int j : primeArray2) {
				// is it prime?
				if (i % j == 0) {
					primeDining = false;
					break;
				}
			}
			// if prime then remove
			if (primeDining == true)
			primeArray2.add(i);
		}
		// create iterator
		Iterator<Integer> primeIterator3000 = primeArray.iterator();
		// while there's another thing to iterate
		// if the array2 matches the next iterator in the array
		// kick it out
		while(primeIterator3000.hasNext()) {
			if (primeArray2.contains(primeIterator3000.next()))
				primeIterator3000.remove();
		}
		// print statement
		System.out.println(primeArray);
		// print happy statement
		System.out.println("We did it!");
	}
	
	// QUESTION 20
	// try??? catch???
	static void readABook() {
		// print statement
		System.out.println("\nRead from file Data.txt:");
		// read in file
		File nailFile = new File ("/Users/aliareed/Documents/CoreJavaAssignment/src/com/revature/javacore/Data.txt");
		Scanner scanScan;
		try {
			scanScan = new Scanner(nailFile);
			
			while (scanScan.hasNextLine()) {
			//	System.out.println(scanScan.nextLine());
				String words = scanScan.nextLine();
				String wordsArray[] = words.split(":");
				System.out.println("Name: " + wordsArray[0] + " " + wordsArray[1]);
				System.out.println("Age: " + wordsArray[2] + " years");
				System.out.println("State: " + wordsArray[3] + " State");
				System.out.println("\n");

			}
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		}
		
		System.out.print("That's all folks! Thanks for coming : )");
		
	}
	
}

// create new class for question 7
class Employee {

	// create new objects to sort by
	String Name;
	String Department;
	int Age;
	
	// create constructor
	Employee(String Name, String Department, int Age){
		
		// create attributes
		this.Name = Name;
		this.Department = Department;
		this.Age = Age;
	}
	
	// convert to string
	public String toString() {
		
		return this.Name + " " + this.Department + " " + this.Age;
	
	}
}
	
// create new class for question 7 comparator
class SortByAge implements Comparator<Employee> {

	public int compare(Employee a, Employee b) { 
		
	        return a.Age - b.Age;
	 }  
}

//create new class for question 7 comparator
class SortByName implements Comparator<Employee> {

	public int compare(Employee a, Employee b) { 
		
	        return a.Name.compareTo(b.Name);
	 }  
}

//create new class for question 7 comparator
class SortByDepartment implements Comparator<Employee> {

	public int compare(Employee a, Employee b) { 
		
	        return a.Department.compareTo(b.Department);
	 }  
}

// create new class to implement interface for Q#15
class calcCalc implements YourFaceIsDumb{
	
	@Override
	public double addition(double a, double b) {
		
		return a + b;
	}

	@Override
	public double subtraction(double a, double b) {
		
		return a - b;
	}

	@Override
	public double multiplication(double a, double b) {
		
		return a * b;
	}

	@Override
	public double division(double a, double b) {
		// don't allow denominator to be zero
		if (b == 0)
			return 0;
		return a / b;
	}
	
}

// new classes for Q#18

abstract class superWoman {
	
	String strR = "You are worthy of my grace.";

	
	abstract boolean upperLower();
	abstract String convertCapital();
	abstract void convertInteger();
	
}

class superMan extends superWoman {

	@Override
	boolean upperLower() {
		// convert string to lowercase
		String strRR = strR.toLowerCase();
		// if new string is the same as the old string then there were no capital letters
		if (strR == strRR) {
			System.out.println("No capital letters in this string!");
			return false;
			// if they're not the same then there were capital letters!
		}else {
			System.out.println("There's capital letters afoot captain!");
			return true;
			}
	}

	@Override
	String convertCapital() {
		// convert to uppercase, print and return
		String strRRR = strR.toUpperCase();
		System.out.println(strRRR);
				return strRRR;
	}

	@Override
	void convertInteger() {
		// convert string to integer
		int stR = Integer.parseInt("17");
		// print statement
		System.out.println("We converted a string into an int and added 10 and it's " + (stR + 10 )+ "!");
				
	}
	
}