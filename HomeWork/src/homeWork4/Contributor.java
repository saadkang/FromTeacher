package homeWork4;

public class Contributor {

	private String name;
	private String gender;
	private String DOB;
	private String address;
	
	public Contributor(){
		
	}
	public Contributor(String name, String gender, String dOB, String addr) {
		super();
		this.name = name;
		this.gender = gender;
		DOB = dOB;
		this.address = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
