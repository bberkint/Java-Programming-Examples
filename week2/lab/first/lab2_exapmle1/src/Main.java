import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Worker worker1 = new Worker();
        worker1.name = "Berkin";
        worker1.socialSecurityNumber = 123456654;
        worker1.wage = 50;
        worker1.workingHours = 10;

        worker1.displayInfo();
        worker1.dsiplaySalary();
        System.out.println("\n");

        Worker worker2 = new Worker();
        Scanner input = new Scanner(System.in);
        System.out.println("Name : \n");
        worker2.name = input.nextLine();
        System.out.println("SSN : \n");
        worker2.socialSecurityNumber = input.nextInt();
        System.out.println("Wade : \n");
        worker2.wage = input.nextFloat();
        System.out.println("Working Hours : \n");
        worker2.workingHours = input.nextInt();

        worker2.displayInfo();
        worker2.dsiplaySalary();
    }
}