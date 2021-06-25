// Program to print table of user's choice 

import java.util.Scanner;

public class test{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter table number: ");
	    int n = sc.nextInt();
  
	    for (int i = 1; i <= 10; i++)
	    {
	    	System.out.println(n + " X " + i + " = " + n * i);
	    }
	}
}
