public class PostOffice {
    String name;

    PostOffice(String name){
        this.name = name;
    }
    void send(Post post){
       String data = String.format("content : %s send from %s to %s",post.content
                , post.senderAddress
                , post.receiverAddress);
        System.out.println(data);
    }

    void receive(Post post){
        String data = String.format("content : %s received from %s to %s",post.content
                , post.receiverAddress
                , post.senderAddress);
        System.out.println(data);
    }

}
