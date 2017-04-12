package superman;

public class SmartWatch {
    String straps;
    int b;
	//Constructor
    public SmartWatch(){
    	//System.out.println("Belee is here");
    }
    public SmartWatch(String straps){
    	this.straps = straps;
    	System.out.println(straps);
    }
    /*public SmartWatch(String straps, int b){
		System.out.println("My Smart Watch has "+b+" straps one of which is "+straps);
	}*/
    public void getAnser(){
    	System.out.println("This should print");
    }
}
