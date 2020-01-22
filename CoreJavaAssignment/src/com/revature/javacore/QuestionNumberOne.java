package com.revature.javacore;

public class JavaCoreAssignment {
	
	// declare aliasArray
	static int aliasArray[] = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
		
	public static void main(String[] args) {
		
		// call Q#1
		michaelBuble(aliasArray);
								
	}
	
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
			System.out.println("\nWe're bubble sorted! Yay!");
			
		}
	
	static void fFFiboNaCcI() {
		
		int fnum = 0;
		int snum = 1;
		
		
	}
	
}