package exception;

public class TestMath {

	public static void main(String[] args) {
		Math math = new Math();
		int result;
		try {
			result = math.division(10, 0);
			System.out.println(result);  //We put this line to see the result
		} catch (Exception ex) {
			System.out.println("You are dividing by zero");
			ex.printStackTrace();
		} finally {
			System.out.println("Let's clean up the resources");
		}

	}
}
