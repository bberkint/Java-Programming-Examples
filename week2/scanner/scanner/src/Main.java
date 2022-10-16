import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number : ");
        int numberOne = input.nextInt();

        System.out.println("Please enter second number : ");
        int numberTwo = input.nextInt();

        int result = numberOne + numberTwo;
        System.out.println("The resul of sum is "+ result);

    }
}