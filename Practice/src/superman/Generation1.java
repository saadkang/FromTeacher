package superman;

public class Generation1 extends SmartWatch{

	//Constructor
	public Generation1(){
		System.out.println("I'm learning");
	}
		
    //Constructor
	public Generation1(String straps, int b) {
		super.straps = "leather";
		super.b = 2;
		System.out.println(straps+" "+b);
		
	}
}
