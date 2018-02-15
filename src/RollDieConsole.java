/*
 * Created by: Phoebe Vermithrax
 * Created on: 14-Feb-2018
 * Created for: ICS4U
 * Daily Assignment – Day #8
 * This program ...
*/

//Import the scanner, so to get the user's input.
import java.util.Scanner;

public class RollDieConsole {
	
	
	public static void main(String[] args) {
		//Create an int variable for the random number and the max and min numbers.
		int minNum = 1;
		int maxNum;
		int randomNumber;
		
		//To make sure that the number is valid, create a boolean.
		boolean isNumber;
		
		//Ask the user to input a number, to set the max value.
		System.out.println("Enter the max value: ");
		
		//For the user input
		Scanner maxNumber = new Scanner(System.in);
		
		//Use a do while to loop through. If the user inputs something other than a number, it'll keep looping until
		//They do.
		do {
			//Check to see if the user's input is a number.
			if (maxNumber.hasNextInt()) {
				maxNum = maxNumber.nextInt();

				//Generate a random number.
				randomNumber = ((int) (Math.random() * maxNum)) + minNum;

				//The input is a number.
				isNumber = true;

				//Send out the max number and the random number.
				System.out.println("The Max Number is: " + maxNum);
				System.out.println("The Random Number is: " + randomNumber);
			} else {
				//Tell the user that it is an invalid input.
				System.out.println("Invalid Input. ");

				//The input is invalid.
				isNumber = false;

				//Erase data, so as to not create an infinite amounts of lines.
				maxNumber.next();
			} 
		} while (!isNumber);
	}
}
