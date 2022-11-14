public class Main {
    public static void main(String[] args) {

        Season s = Season.SUMMER;

        Season[] seasons = Season.values();
        for (Season season: seasons) {
            System.out.println(season);
        }

        Course[] courses = Course.values();
        for (Course course:courses
             ) {
            System.out.println(course +" "+ course.getLecurer());
        }
    }
}