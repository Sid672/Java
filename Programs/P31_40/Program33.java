/** Program to calcuate x to the power of y.*/

import java.util.Scanner;

public class test{
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers: ");
        int a = sc.nextInt();
        int n = sc.nextInt();
        int res = 1;

   
        for (int i = 0; i < n; i++)
        {
            res = res * a;
        }

        System.out.println("Ans = " + res);
	}
}

