package besinciHaftaEnumORNEK;

public class Main {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(1, "Ali", 4455);
		Employee employee2 = new Employee(2, "Veli", 4456);
		Employee employee3 = new Employee(3, "Mehmet", 4457);
		
		Employee[] employees = {employee1 , employee2 , employee3};
		
		Company company1 = new Company(employees, CompanyName.MICROSOFT);
		
		for (Employee emp : employees) {
			System.out.println(emp.getName() + " " + emp.id);
		}

	}

}
