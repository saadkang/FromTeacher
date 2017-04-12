package thisIsFullOfNotesToComeBackAndReview;

public class MainImportanceOfPlusAndMinusSign {

	public static void main(String[] args) {
		int s = 20;
		int t = s++ + --s;
		System.out.println("s is: "+s);
		System.out.println("t is: "+t);
		/* In the above example it is obvious that s = 20, but t is kind of difficult
		 * for me to understand: it printed 40 for t...'s++' meaning 20 + 1 = 21 and
		 * and 's--' meaning 20 - 1 = 19 so we have 21 and 19, if we do 21 + 19 = 40
		 * so there you have it. 'I re-wrote this to display as below, so I can understand
		 * it better. ("s is: "+s), it was originally written as (s) and same thing
		 * with 't' */
		
		
		int v = 20; --v;
		System.out.println("v is: "+v++);
		/* I found this in the CodeLab and the correct answer is '19 is printed, v ends up
		 * with 20' I really don't understand this at all, well I understand the first
		 * part of it, that we assign 20 to 'v'. I re-wrote this as well to better
		 * understand this as: ("v is: "+v++) it was originally written as: (v++) */

	}

}
