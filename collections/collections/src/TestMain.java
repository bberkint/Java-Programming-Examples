public class TestMain {
    public static void main(String[] args) {
        Student student1 = new BachelourStudent(10, 50, 90);
        Student student2 = new MasterStudent(10, 50, 90,5);
        Student student3 = new PhDStudent(10, 50, 90,2,1);

        System.out.println(student1.computeBaseScore());




    }
}
