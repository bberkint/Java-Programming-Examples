import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {

            // int a =40/0;
            // System.out.println("done");
            Scanner input = new Scanner(System.in);
            input.nextInt();
        }
        catch (InputMismatchException e ){
            System.out.println("Expected input is int");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Done");
        }



    }
}