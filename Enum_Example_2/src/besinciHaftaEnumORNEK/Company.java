package besinciHaftaEnumORNEK;

public class Company {
	
	Employee[] employees;
	CompanyName companyName;
	
	public Company(Employee[] emps ,CompanyName companyName) {
		
		this.employees = emps;
		this.companyName = companyName;
	}
		
	public CompanyName getCompanyName() {
		
		return companyName;
	}
}
