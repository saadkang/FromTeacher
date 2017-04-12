package thisIsFullOfNotesToComeBackAndReview;

public class MainPercentSign {
	public static void main(String[] args){
		
		int price;
		price = 4321;
		System.out.println(price / 100+" dollars and "+price % 100+" cents");
		/* I guess the % sign means that whatever value of that certain variable is, in our case
		 * the integer is price, it will only show the digits that we want it to show
		 * For Instance, we said (price % 100) so the value of integer price is 4321, it will
		 * only show last two digits which are 21, a working example is shown in the next line.
		 */
		//System.out.println(price % 100+" cents");
	}
}