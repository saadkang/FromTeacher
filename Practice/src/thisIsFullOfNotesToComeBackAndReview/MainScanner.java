package thisIsFullOfNotesToComeBackAndReview;

import java.util.Scanner;

public class MainScanner {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("What is you name?");
		
		String UserName = myScanner.next();
		
		System.out.println("Hello, "+UserName+ " nice to meet you. ");
		
		System.out.println(UserName+", Can you please tell me where you from?");
		
		String UserPlace = myScanner.next();
		
		System.out.println("Ok, "+UserName+" is "+UserPlace+" a dangerous place?");
		
		String UserDan = myScanner.next();
		
		System.out.println("Is "+UserPlace+" beautiful? Don't answer that because I don't care...");

	}

}
