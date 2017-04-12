package homeWork4;

public class Production {

	public static void main(String[] args) {
		
		Generation3 g3 = new Generation3();
		g3.size();
		g3.color();
		g3.straps();
		g3.bluetooth();
		g3.camera();
		g3.batteryLife();
		
		Contributor nice = new Contributor();
		nice.setName("Saad");
		nice.setGender("Male");
		nice.setDOB("00-00-0000");
		nice.setAddress("Saad lives in North Carolina");
		System.out.println(nice.getName()+" "+nice.getGender()+" "+nice.getDOB()+" "+nice.getAddress());
		
		Contributor verynice = new Contributor("Ahmed", "Male", "11-11-1111", "Ahmed lives in North Carolina");
		System.out.println(verynice.getName()+" "+verynice.getGender()+" "+verynice.getDOB()+" "+verynice.getAddress());

	}

}
