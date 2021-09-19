/**program to check if a number is greater than or smaller than the other number.
* using conditional statements */

import java.util.Scanner;

public class test{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
/** first number is taken as input from the user.*/
        System.out.println("Enter first number: "); 
        int a = sc.nextInt();
/** second number is taken as input from user.*/
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        if (a > b)
        {
            /** if first number is greater than second number then this block will be executed.*/
            System.out.println(a + " is greater than " + b);
        }

        else if (a == b)
        {
            /** if first number is equal to second number than this block will be executed.*/
            System.out.println(a + " is equal than " + b);   
        }

        else
        {
            /** if both the above conditions are false then this block will be executed.*/
            System.out.println(b + " is greater than " + a);
        }

    }
}
