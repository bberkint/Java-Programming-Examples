public class Main {
    public static void main(String[] args) {

        student student1 = new student();
        student1.name = "Batın Berkin";
        student1.surame = "Topaloğlu";
        student1.mid = 60;
        student1.fin = 70;


        student1.displayNameAndScore(student1);

        System.out.println("Average of Grades : " + student1.getScore(60,70));

    }
}