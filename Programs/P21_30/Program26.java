/** Program to print N even natural numbers in reverse order:*/

import java.util.Scanner;

public class test{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
     
        System.out.println("Enter Number: ");
		int n = sc.nextInt();

		for (int i = 1; i <= 2 * n; i++)
		{
			if (i % 2 == 0)
			{
				System.out.println(i);
			}
		}
	}
}
