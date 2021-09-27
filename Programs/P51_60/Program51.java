/** 
  * Program to print pattern no. 33
  * ABCDEFG
  * ABC EFG
  * AB   FG
  * A     G
  */

import java.util.Scanner;

public class Program51{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		char a = 65;
		for (int i = 1; i <= n / 2 + 1; i++)
		{
			a = 65;
			for (int j = 1; j <= n; j++)
			{
				if (j <= (n / 2 + 2) - i || j >= n / 2 + i)
				{
					System.out.print(a);
				}
				else
				{
					System.out.print(" ");
				}
				a++;
			}
			System.out.println();
		}
	}
}
