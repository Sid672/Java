//Program to reverse a number
import java.util.Scanner;

public class test{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a = sc.nextInt();
        int sum = 0, term = 0;
        
        while (a > 0)
        {
           term = a % 10;
           a = a / 10;
           sum = sum * 10 + term; //4 * 10 + 3 = 43
        }
        
        System.out.println("Reverse = " + sum);
    }
}
