package thisIsFullOfNotesToComeBackAndReview;

import java.util.Scanner;

public class MainIfStatement {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("What is your favorite number?");
		int favNum = myScanner.nextInt();
		System.out.println("Thanks for sharing!\nMy favorite number is 7");
		
		if(favNum == 7){
			System.out.println("Wow, we have the same favorite number.");
		}

	}

}
