/** program to check if a year is a leap year */
import java.util.Scanner;

public class test{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter year: ");
        int a = sc.nextInt();

        if (a % 400 == 0)
        {
            System.out.println("Leap Year");
        }

        else if (a % 4 == 0 && a % 100 != 0)
        {
            System.out.println("Leap Year");
        }

        else
        {
            System.out.println("Not a Leap Year");
        }
    }
}
