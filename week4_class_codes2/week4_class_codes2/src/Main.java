public class Main {
    public static void main(String[] args) {

        try {
            Time1 time1 = new Time1(24,12,26);
            System.out.println(time1.toString());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}