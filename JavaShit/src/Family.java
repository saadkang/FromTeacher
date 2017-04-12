
public class Family {
	
	private String name;
	private String DOB;
	private String SSN;
	private String address;
	public Family(){
		
	}
	public Family(String name, String dOB, String sSN, String address) {
		super();
		this.name = name;
		DOB = dOB;
		SSN = sSN;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
