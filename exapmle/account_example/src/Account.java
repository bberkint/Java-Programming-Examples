import java.util.Scanner;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
    }

    public double getBalance() {
        String passw = "1234";
        System.out.println("Please enter your password to get your balance");
        Scanner userLogIn = new Scanner(System.in);

        if (passw.equals(userLogIn.next())) {
            return balance;
        }else
            return 0;
    }

        public void setBalance ( double amount){
            String passw = "1234";
            System.out.println("Please enter your password to make process");
            Scanner userLogIn = new Scanner(System.in);

            if (passw.equals(userLogIn.next())) {
                if (amount <= this.balance) {
                    this.balance -= amount;
                }
            }
        }
        public void setName (String name){
            System.out.println(name);
        }
    }
