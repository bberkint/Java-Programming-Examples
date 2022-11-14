public class Main {
    public static void main(String[] args) {
        Post post = new Post("This is a message ... ","Karabuk PTT","Istanbul PTT");
        PostOffice postOffice1 = new PostOffice("Karabuk PTT");
        PostOffice postOffice2 = new PostOffice("Istanbul PTT");

        postOffice1.receive(post);
    }
}