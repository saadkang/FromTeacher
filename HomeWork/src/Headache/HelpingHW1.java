package Headache;

public class HelpingHW1 {
	String workNam;
	String liveIn;
	String myName;
	
	public HelpingHW1(){
		System.out.println("My name is Saad Kang. ");
	
	}
	public HelpingHW1(String workNam){
		this.workNam = workNam;
		System.out.println("I currently work in the "+workNam+" Pharmacy");		
	
	}
	public void myDrugs(){
		String drugs = "Effexor, Elavil, Evista, Flexeril, Flomax";
		System.out.println("I take: "+drugs);
	
	}
	public void userName(){
		String name = "I live in North Carolina. ";
		System.out.println(name);
	}
	public static void placeInNC(){
		System.out.println("I live in a 5 bedroom house");
	}
}