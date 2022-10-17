import yenipaket.Student;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Berkin", 213 , 56, 25);
        Student student2 = new Student();
        student2.name = "Ahmet";
        student2.midTerm = 58;
        student2.finExam = 88;

        System.out.println(student1.getResult());
        System.out.println(student2.getResult());

        Employee emp = new Employee();



    }
}