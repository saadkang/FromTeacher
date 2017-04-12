package thisIsFullOfNotesToComeBackAndReview;

import java.util.Scanner;

public class MainWhileLoop {

	public static void main(String[] args) {
		int myNum = 4;
		
		Scanner myScanner = new Scanner(System.in);
		/* This above statement: first word 'Scanner' is telling java that the type
		 * of the object is Scanner, and the second word 'myScanner' is the name
		 * of the object, after '=' sign it is kinda hazy but I think it is talking
		 * about the object is new and if the user input any value store and look
		 * for in the system which is in the brackets as 'System.in'*/
		System.out.println("Guess a number between 1 and 10:");
		/* This statment is the first to print out and is asking the user to input
		 * the value and depending on the type of value the user enters, we create
		 * a variable*/
		int userGuess = myScanner.nextInt();
		/* Here in above line we created the name of the variable 'userGuess' and
		 * in the print prompt above we are asking the user to put an integer
		 * so the variable type will be integer, it is important to tell java that
		 * the user will put integer so store that input as an integer so later
		 * when asked to Scan for that information java will know that its looking
		 * for an integer*/
		while(userGuess != myNum){
			/*This is a while loop: and inside the brackets we are telling the java
			 * to continue running the loop while userGuess which is input by user
			 * is not equals to the myNum variable that we created in the beginning */
			System.out.println("Sorry that's not right, try again!");
			/* Java will print keep printing this message, as long as the condition inside
			 * the whie brackets is true.*/
			userGuess = myScanner.nextInt();
			/* And we want java to store the new input from user to scan, to match with
			 * the condition*/
		}

		System.out.println("Great job! you got it.");
		/* So when the user guess the correct number, which will make the loop to stop running
		 * We want java to print this message, and after this message print the program will
		 * end so there is no need for the user to put a different number.*/
	}

}
