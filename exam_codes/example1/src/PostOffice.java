public class PostOffice
{
    String name;

    PostOffice(String name){
        this.name = name;
    }


    public void send(Post post){
        System.out.println(" "+ post.message + " From "+post.sourceAddress+ " to " + post.targetAddress);
    }

    public void receive(Post post){
        System.out.println(" "+ post.message + " To "+post.sourceAddress+ " from " + post.targetAddress);
    }
}
