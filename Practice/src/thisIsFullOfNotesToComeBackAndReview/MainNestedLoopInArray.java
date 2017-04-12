package thisIsFullOfNotesToComeBackAndReview;

public class MainNestedLoopInArray {

	public static void main(String[] args) {
		String[] months = {"Jan", "Feb", "Mar", "Apr"};
		int[] days = {31, 28, 31, 30};
		/* So now I know how to make the Array, so basically we created two Arrays*/
		for(int i = 0; i < months.length; i++){
			/* So this loop is inside the same class where we created the Array, this loop
			 * is easy to understand because this is the standard */
			System.out.println(months[i]);
			
			for(int j = 1; j <= days[i]; j++){
				/* For this loop I understand the first part it is '1' not '0', because
				 * there is not '0' in the days of a month, the second part is saying that
				 * it will print out the number of days of that month */
				System.out.print(j+" ");
			}
		    System.out.println(); /* This is there to tell java that at the end of the
		    loop go to the next line */
		}
			

	}

}