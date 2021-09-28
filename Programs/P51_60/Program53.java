/** 
  * Program to calculate factorial
  * of a number using git
  */

import java.util.Scanner;

public class Program53{

	int fact(int n)
	{
	   int res = 1;
       while (n > 1)
       {
       	  res = res * n;
       	  n--;
       }
       return res;
	}

	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        Program53 obj = new Program53();
        int  n = sc.nextInt();
    
        int res = obj.fact(n);
        System.out.println("factorial of " + n + " : " + res);
	}
}