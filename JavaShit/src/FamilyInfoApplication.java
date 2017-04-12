
public class FamilyInfoApplication {

	public static void main(String[] args) {
		Family p1 = new Family();
		p1.setName("Saad");
		p1.setDOB("12-04-1993");
		p1.setSSN("I'm undocumented");
		p1.setAddress("I'm homeless");
		System.out.println(p1.getName()+" "+p1.getDOB()+" "+p1.getSSN()+" "+p1.getAddress());
		
		Family p2 = new Family("Sana", "01-05-1991", "I forgot", "Lives in Michigan");
		System.out.println(p2.getName()+" "+p2.getDOB()+" "+p2.getSSN()+" "+p2.getAddress());

	}

}
