package üçüncüHaftaLab1;
import java.util.Scanner;


public class Account {
	
	private double balance;
	private String ownerName;
	
	public Account (double balance , String ownerName) {
		this.balance = balance;
		this.ownerName = ownerName;
	}
	
	public double add(double amount) {
		balance += amount;
		return balance;

	}
	
	public void withdraw(double amount) {
		
		int password = 1234;
		int counter = 3;
		while (counter > 0) {
			System.out.println("Lütfen sifrenizi giriniz :");
			Scanner scan = new Scanner(System.in);
			int getPassword = scan.nextInt();
			
			if (getPassword == password) {
				if (this.balance > amount) {
					this.balance -= amount;
					System.out.println(amount + "TL basariyla çekildi , kalan bakiyeniz : " + balance);
					break;
				}
				else {
					System.out.println(balance +" bakiyeniz bulunmaktadır , daha fazla çekemezsiniz !");
				}
			} 
			else {
				counter--;
				System.out.println("Sifre yanlıs , kalan deneme hakkiniz : " + counter);

			}
		}
		
		if (counter == 0 ) {
			
			System.out.println("3 defa hatali giris yaptiniz , daha sonra tekrar deneyiniz!");
		}
		
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setOwnerName (String name) {
		this.ownerName = name;
	}
	
	public String getOwnerName () {
		return ownerName;
	}
	

}
