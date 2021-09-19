/** Program to print N odd natural numbers:*/

import java.util.Scanner;

public class test{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
     
        System.out.println("Enter Number: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++)
		{
			int odd = 2 * i - 1;
			System.out.println(odd);
		}
	}
}
