/** Program to print prime number in a range.*/

import java.util.Scanner;

public class test{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a range: ");
		int l = sc.nextInt();
		int r = sc.nextInt();
		int n;

		if (l == 1)
		{
			l = 2;
		}

		for (int j = l; j <= r; j++)
		{
        boolean a = true;
        n = j;
        for (int i = 2; i * i <= n; i++)
        {
          if (n % i == 0)
          {
              a = false;
              break;	
          }
        }

        if (a)
        {
          System.out.print(n + " ");
        }
	   }
     System.out.println();
	}
}
