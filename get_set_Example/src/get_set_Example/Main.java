package üçüncüHaftaDers2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Account account1 = new Account("Batın Berkin", 24.47);
		Account account2 = new Account("Ahmet Berke",5.00);

		System.out.printf("%s balance : $%.2f%n",account1.getName(),account1.getBalance());
		System.out.printf("%s balance : $%.2f%n",account2.getName(),account2.getBalance());
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter the deposit amount for account1 : ");
		double depositAmount1 = input.nextDouble();
		
		System.out.printf("%nadding %.2f to account1 balance %n%n",depositAmount1);
		account1.deposit(depositAmount1);
		
		System.out.printf("%s balance : $%.2f%n%n",account1.getName(),account1.getBalance());
		System.out.printf("%s balance : $%.2f%n%n",account2.getName(),account2.getBalance());
		
		System.out.printf("Enter the deposit amount for account2 : ");
		double depositAmount2 = input.nextDouble();
		
		System.out.printf("%nadding %.2f to account2 balance %n%n",depositAmount2);
		account2.deposit(depositAmount2);
		
		System.out.printf("%s balance : $%.2f%n", account1.getName(),account1.getBalance());
		System.out.printf("%s balance : $%.2f%n", account2.getName(),account2.getBalance());
		
	}

}
