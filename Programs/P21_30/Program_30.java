// Program to print factorial of a number.
// program works for upto 19 only.

import java.util.Scanner;

public class test{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
	    int n = sc.nextInt();
        int fact = 1;

        if (n == 0)
        {
        	System.out.println("Factorial = 1");
        	return;
        }

	    for (int i = 1; i <= n; i++)
	    {
	       fact = fact * i; 
	    }

	    System.out.println("Factorial = " + fact);
	}
}
