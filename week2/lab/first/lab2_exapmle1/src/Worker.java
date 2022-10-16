public class Worker {
    String name;
    int socialSecurityNumber;
    float wage;
    int workingHours;

    void displayInfo(){
        System.out.println(name + " " + socialSecurityNumber);
    }

    void dsiplaySalary(){
        float salary = wage* workingHours;
        System.out.println(salary);
    }
}
