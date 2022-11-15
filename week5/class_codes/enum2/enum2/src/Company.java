public class Company {

    private Employee[] employees;
    private CompanyName companyName;
    Company(CompanyName companyName , Employee[] employees){
        this.companyName = companyName;
        this.employees = employees;
    }

    public CompanyName getCompanyName(){
        return companyName;
    }
    
    public void printAllEmployee(){
        for (Employee employee:
             employees) {
            System.out.println(employee.getName());
        }
    }
    
    public void printAllId(){
        for (Employee employee:
             employees) {
            System.out.println(employee.getId());
        }
    }
}

enum CompanyName{
    APPLE,
    MICRSOFT,
    GOOGLE,
    IBM
}

