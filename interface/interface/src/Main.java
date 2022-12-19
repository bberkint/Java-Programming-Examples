public class Main {
    public static void main(String[] args) {

    //    Customer customer = new Customer();
    //    Student student = new Student();
        IDatabase studentDatabase =new Student();
        IDatabase customerDatabase = new Customer();

        studentDatabase.log();
        customerDatabase.log();

    }
}