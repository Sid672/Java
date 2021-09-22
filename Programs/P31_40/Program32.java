/** Program to print sum of first n odd number.*/

import java.util.Scanner;

public class test{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
	    int n = sc.nextInt();
        int sum = 0;

	    for (int i = 1; i <= n; i++)
	    {
	        sum += 2 * i - 1;
	    }

	    System.out.println("Sum = " + sum);
	}
}
