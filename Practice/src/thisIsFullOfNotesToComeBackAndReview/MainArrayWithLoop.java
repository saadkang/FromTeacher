package thisIsFullOfNotesToComeBackAndReview;

public class MainArrayWithLoop {

	public static void main(String[] args) {
		String testTakers[] = {"Saleem", "Shehnaz", "Sana", "Saad", "Ayesha", "Ahmed"};
		/* There are two ways to create the Array, you can either have the loop
		 * next to 'String' or you can have next to the name of the array. So anyways
		 * the Array is created and given values*/
		
		for(int i = 0; i < testTakers.length; i++){
		
		/* First and third parts the of loop is pretty straight forward, but in here
		 * we need to talk about the second part of the loop. Let's say we don't 
		 * know the value of the Array, and we want the loop to run and print everything
		 * in the array, 'testTakers.length' tells us the length of the array and we
		 * can run the loop that many times. */	
			
			System.out.println(testTakers[i]);
		}

	}

}
