package bersinciHaftaPostahaneOdevi;

public class PostOffice {
	
	private String name;	
	
	public PostOffice (String name) {
	
		this.name = name;
		
	}
	
	public String getMessage() {
		return name;
	}
	
	void send(Post post) {
		System.out.printf("SEND : %s from %s to %s by %s\n",post.message,post.sourceAdress,post.targetAdress,this.name);
	}

	void receive(Post post) {
		System.out.printf("RECEİVE : %s from %s to %s by %s",post.message,post.sourceAdress,post.targetAdress,this.name);
	}
	
}
