package constructor;

public class House {
	String houseName;
	
	//This is a Constructor 1 (line below)
	public House(){
		System.out.println("This is White House");
	}
	
	//Second Constructor
	//Constructors can't have same name to differentiate you can add parameters
	public House(String houseName){
		this.houseName = houseName;
		System.out.println(houseName);
	}
	
	public void setColor(){
		System.out.println("Color is White");
		
	}

}
