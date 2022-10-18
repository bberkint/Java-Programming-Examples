public class Main {
    public static void main(String[] args) {

    Account account1 = new Account("Berkin", 500);
    account1.deposit(50);
    account1.setBalance(500);
    System.out.println(account1.getBalance());


    }
}