/** 
  * Program to print sum of n natural no. using function.
  * take nothing and return nothing.
  */

import java.util.Scanner;

public class Program56{

	static int n;

	static void cal()
	{
		int sum = n * (n + 1) / 2;
        System.out.println("Sum of " + sum);
        return;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.:");
        n = sc.nextInt();
        cal();
	}
}