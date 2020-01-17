package org.amalitech.babylonianalgorithm;
import java.util.Scanner;
public class BabylonianAlgorithm {
	
	public static void main(String[] args) {
		//The Babylonian algorithm to compute the square root of a number n is as follows:
		//1. Make a guess at the answer (you can pick n/2 as initial guess)
		//2. Compute r = n/guess
		//3. Set guess=(guess+r) /2
		//4. Go back to step 2 for as many iterations as necessary. The more you repeat steps 2 and 3, the closer guess will become to the square root of n.
		// Write a program that inputs an integer for n, iterates through the Babylonian algorithm five times, and outputs the answer as a double to two decimal places.
		// Your answer will be most accurate for small values of n
		
		// Display 
		System.out.println("Please, enter the Number you want its square root");
		// Initialization of Scanner class
		Scanner npt= new Scanner(System.in);
		
		//Declaration and Initialization of variables
		int number_i= npt.nextInt();
		
		//Declaration and Initialization of String variable
		String stmnt_str="The number you entered is: " + number_i;
		
		//Display stmnt_str variable
		System.out.println(stmnt_str);
		
		// Declaration and Initialization of variable
		String rslt_str="The square root of the Number %s is: ";
		
		// Formatting of String
		rslt_str= String.format(rslt_str, Integer.toString(number_i));
	
		//Display of final result
		System.out.printf("\n" +rslt_str + "%.2f", babylonian(number_i));
		
	
		}
	
		// Declaration of babylonian Method
	
	public static double babylonian(int x) {
		double ntlguess_d = x/2;
		
		for (int i=0; i<5; i++) {
			
			double r_d = x/ntlguess_d;
			ntlguess_d=(ntlguess_d + r_d)/2;
		}
			return ntlguess_d;
	}
	
}
