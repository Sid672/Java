//Program to calcualte sum of all digits of a number. 
import java.util.Scanner;

public class test{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a = sc.nextInt();
        int sum = 0;
        
        while (a > 0)
        {
           sum = sum + a % 10;
           a = a / 10;
        }
        
        System.out.println("Sum = " + sum);
    }
}
