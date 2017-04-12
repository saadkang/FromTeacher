package thisIsFullOfNotesToComeBackAndReview;

public class SingleConstructorIntroductionNoUseJustToUnderstand {
	String houseName;
	
	//constructor 1
	public SingleConstructorIntroductionNoUseJustToUnderstand(){
		
	}
	//constructor 2
	public SingleConstructorIntroductionNoUseJustToUnderstand(String houseName){
		this.houseName = houseName;
		System.out.println(this.houseName);
	}
}
