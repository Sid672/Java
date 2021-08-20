//Program to print pattern 34;
// 1    
// 62   
// 1073  
// 131184 
// 15141295

import java.util.Scanner;

public class Program52{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of n: ");
		int n = sc.nextInt();
		int k = 1, l = n, nextval = 1, m = 0;
		for (int i = 1; i <= n; i++)
		{   
			for (int j = 1; j <= n; j++)
			{
				if (j <= i)
				{
					System.out.print(k);
					k -= m;
					m++; 
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			nextval += l;
			m = l - 1;
			k = nextval;
			l--; 
		}
	}
}

