package finalInTermOfVariable;

public class TestDriveWay {

	public static void main(String[] args) {
		
		DriveWay driveWayOfAhmed = new DriveWay();   //Creating the object to call the method 'getDriveWaySize()'
		int sizeOfAhmedDriveWay = driveWayOfAhmed.getDriveWaySize();    //Creating new variable 'sizeOfAhmedDriveWay' store the value
		System.out.println("Ahmed's Drive Way: "+sizeOfAhmedDriveWay);
		
		DriveWay driveWayOfSaad = new DriveWay();  //Creating another object 'driveWaySaad' to call method
		driveWayOfSaad.getDriveWaySize();  //Calling the method 'getDriveWaySize'
		int sizeOfSaadDriveWay = driveWayOfSaad.getDriveWaySize();   //Assigning the variable name 'sizeOfSaadDriveWay' to method
		System.out.println("Saad's Drive Way: "+sizeOfSaadDriveWay);
		
		driveWayOfSaad.setDriveWaySize(8);  //Calling a different method 'setDriveWaySize' which has the capacity to change the value
		int sizeOfSaadDriveWayAfter = driveWayOfSaad.getDriveWaySize();  //Assigning variable to 'sizeOfSaadDriveWayAfter'
		System.out.println("Saad's Drive Way: "+sizeOfSaadDriveWayAfter);
		
		System.out.println("Saad's Drive Way Color: "+driveWayOfSaad.color);
		int sizeOfAhmedDriveWayAfter = driveWayOfAhmed.getDriveWaySize();  //Calling variable again after changing the variable to static
		System.out.println("Ahmed's Drive Way: "+sizeOfAhmedDriveWayAfter);
		
		//Change the 'int driveWaySize' in class 'DriveWay' to see the difference between static and non-static variable

	}

}
