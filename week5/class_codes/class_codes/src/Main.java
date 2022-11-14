public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle(5);
        Circle c2 = new Circle(5);
        Circle[] circles = {c1, c2};

        for (Circle c : circles) {
            System.out.println(c.commputeArea() );
        }


    }
}