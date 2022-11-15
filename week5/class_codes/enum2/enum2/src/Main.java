public class Main {
    public static void main(String[] args) {

        CompanyName companyName = CompanyName.APPLE;
        Employee employee1 = new Employee(345, "Berkin");
        Employee employee2 = new Employee(346, "Ahmet");
        Employee employee3 = new Employee(347, "Efsa");
        Employee[] emps = new Employee[]{employee1 , employee2 , employee3};
        Company company = new Company(companyName ,emps);

        System.out.println(company.getCompanyName());
        company.printAllEmployee();
        company.printAllId();
    }
}