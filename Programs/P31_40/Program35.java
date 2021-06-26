// Program to calcuate number of digits in a number.

import java.util.Scanner;

public class test{
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int cnt = 0;

        if (n == 0)
        {
	        System.out.println("Digits = " + 1);
            return;
        }

        while (n > 0)
        {
        	n = n / 10;
            cnt++;
        }
       
        System.out.println("Digits = " + cnt);

	}
}
