public class Company
{
    private Employee[] employees;
    private CompanyName companyName;

    public Company(Employee[] e, CompanyName c)
    {
        this.employees = e;
        this.companyName = c;
    }
    public Company(CompanyName cName , Employee[] emps)
    {
        this.companyName = cName;
        this.employees = emps;
    }
    public CompanyName getCompanyName()
    {
        return companyName;
    }
}
