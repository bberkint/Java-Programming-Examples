import java.util.Scanner;

public class Student
{
    /*
    int a;
    static  int b;

    Student()
    {
        b++;
    }

    public void showData()
    {
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);

    }
    */

    int rollno;
    String name;

    String city;

    Student(int rollno, String name, String city)
    {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    public String toString()
    {
        return rollno + " " + name + " " + city;
    }

}
