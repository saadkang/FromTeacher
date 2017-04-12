package blueprint;

public class House {
	
	int floor;
	double size;
	//we can declare a variable like above two
	int address = 32;
	//All these are primitive type variables
	char letter = 'A';
	boolean color = true;
	String houseName = "99 Peoplentech";
	//We can have numbers and space in String type variable
	//we can also declare and initialize variable like above three
	
	public int numberOfRooms(){
		//This is how you create a method
		int rooms = 3;
		System.out.println("Rooms: "+rooms);
		return rooms;
		//Since this method is a return type you have to return
	}
	
	public void watchTV(){
		floor = 32;
		System.out.println("Watch Game of Thrones");
		//This is not a return type method
	}
	
	public void sleep(){
		size = 976.0;
		System.out.println("Sleep in the Bedroom");
	}
	public int calculate(int val1, int val2){
		int total = val1 + val2;
		return total;
		//This method is a return type
	}
	public void calculatetask(int val1, int val2){
		int total = val1 + val2;
		System.out.println("This is non-return type: "+total);
	}
	
}
