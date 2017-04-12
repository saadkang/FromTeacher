package oop.encapsulation;

public class PersonInfoApplication {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Saad");
		p1.setDOB("12-04-1991");
		p1.setSSN("000-00-0000");
		p1.setAddress("Cary North Carolina");
		System.out.println(p1.getName() + " " + p1.getDOB() + " " + p1.getSSN() + " " + p1.getAddress());
		
		Person p2 = new Person("Ahmed","05-08-1994","090-88-9999","In his room in NC");
		System.out.println(p2.getName()+" "+p2.getDOB()+" "+p2.getSSN()+" "+p2.getAddress());

	}

}
