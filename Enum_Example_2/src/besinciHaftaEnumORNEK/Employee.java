package besinciHaftaEnumORNEK;

public class Employee {
	
	int id;
	private String name;
	int ssn;
	
	public Employee(int id, String name , int ssn ) {
		
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		
	}
	
	public String getName() {
		
		return name;
	}

}
