package org.amalitech.isogram;
import java.util.Scanner;
public class PerfectSquare {

	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int more = input.nextInt();
		/*int x = 121;
		int y = 625;
		int z = 114;
			checkForPerfectSquare(x);
			checkForPerfectSquare(y);
			checkForPerfectSquare(z);*/
			checkForPerfectSquare(more);
			}
	
	public static void checkForPerfectSquare(int number) {
		double quotient = Math.sqrt(number);
		if((quotient - Math.floor(quotient))==0) {
			int result = (int) quotient;
			int results = result + 1;
			System.out.println("findNextSquare(" + number +") --> returns " + (results*results));
			
		}else {
			System.out.println("findNextSquare(" + number +") --> returns " + -1 + " since " + number + " is not a perfect");
		}
	}
}
