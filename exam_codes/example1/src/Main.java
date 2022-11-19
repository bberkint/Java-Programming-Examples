public class Main {
    public static void main(String[] args)
    {
        /*
        Employee employee1 = new Employee(1, "Ali");
        Employee employee2 = new Employee(2, "Veli");
        Employee employee3 = new Employee(3, "Mehmet");

        Employee[] employees = {employee1 , employee2 , employee3};

        Company company1 = new Company(employees, CompanyName.MICROSOFT);

        for (Employee employee: employees)
        {
            System.out.println(employee.getName() + " " + employee.getId());
        }
        */

        /*
        Student s1 = new Student();
        s1.showData();
        Student s2 = new Student();
        s2.showData();
        s1.showData();
        */

        Student s1 = new Student(101 , "Berkin" , "LA");
        Student s2 = new Student(201, "Batın" , "Gümüşhane");
        System.out.println(s1);
        System.out.println(s2);
        s1.toString();
    }
}