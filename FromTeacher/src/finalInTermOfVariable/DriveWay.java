package finalInTermOfVariable;

public class DriveWay {
	static int driveWaySize = 5;  //This 'int' can be changed to 'static' and 'non-static' to see the difference
	final String color = "White";
	
	public void setDriveWaySize(int driveWaySize){
		this.driveWaySize = driveWaySize;
	}
	
	public int getDriveWaySize(){
		return driveWaySize;
	}

}
