package blueprint;

public class BuildHouse {

	public static void main(String[] args) {
		
	House myHouse = new House();
	//myHouse is a reference type variable
	myHouse.sleep();
	myHouse.watchTV();
	myHouse.calculatetask(5, 10);
	int result = myHouse.calculate(5, 10);
	//This was the non-return type
	System.out.println("Result is: "+result);
	
	
	House saadHouse = new House();
	saadHouse.numberOfRooms();
	
	MyRoom myRoom = new MyRoom();
	myRoom.sleepTime();

	}

}
