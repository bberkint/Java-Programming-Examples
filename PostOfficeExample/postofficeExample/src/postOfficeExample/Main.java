package bersinciHaftaPostahaneOdevi;

public class Main {

	public static void main(String[] args) {
		
		Post post = new Post("My Message", "from İstanbul", "to Ankara");
		
	   	PostOffice pOffice1 = new PostOffice("Istanbul PTT");
		PostOffice pOffice2 = new PostOffice("Ankara PTT");

		pOffice1.send(post);
		pOffice2.receive(post);
		
	}

}
