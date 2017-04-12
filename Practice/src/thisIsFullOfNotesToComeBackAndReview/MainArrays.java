package thisIsFullOfNotesToComeBackAndReview;

public class MainArrays {

	public static void main(String[] args) {
		
		String[] myfamily = {"Saleem", "Shehnaz", "Sana", "Saad", "Ayesha", "Ahmed"};
		
		/* This we created is any Array and an array has entries called 'index', index
		 * starts with '0' and goes up, in the above example we have '6' index 
		 * Saleem being the '0' index and Ahmed being the '5' index */
		
		/*String[] testTakers = {}; This will not work read below: */
		
		/* Java arrays actually need to be given a size if values are not
		 * assigned immediately. The declaration should be
		 * 'String[] testTakers = new String[3];' '3' inside the square
		 * brackets tells the java that there will be 3 index in this
		 * array */
		
		String[] testTakers = new String[1];
		
		/* After declaring the Array, we can set the values/index to the array
		 * like the same way we changed the value of any index in myfamily array.*/
		
		testTakers[0] = "Furqan";
		
		myfamily[1] = "Guddi";
		
		/* This way we can change the value of an index and put a new one in */
		
		System.out.println(myfamily[1]);
		System.out.println(testTakers[0]);

	}

}
     /* So Array is used to store multiple values and you can call one at a time, instead
      * of calling or printing all at once, the format above is used to
      * So the question remains how to print multiple entries from the Array? */