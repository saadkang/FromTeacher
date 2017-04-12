package constructor;

public class TestHouse {

	public static void main(String[] args) {
		
		House house = new House();
		//Above is calling Constructor 1
		House myhouse = new House("This is my house");
		//Above is calling Constructor 2
		house.setColor();
		myhouse.setColor();
		
		/*We can not have same object name to call two different Constructor */

	}

}
