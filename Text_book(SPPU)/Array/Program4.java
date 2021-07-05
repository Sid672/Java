/*
Program of addition of sum of each row and column. (Page No. 3-38)
*/

import java.util.Scanner;

public class test{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int a[][] = new int[3][3];
 
    System.out.println("Enter elements of 2-D array");
    for (int i = 0; i < 3; i++)
    {
      for (int j = 0; j < 3; j++)
      {
           a[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < 3; i++)
    {
      int sum = 0;
      for (int j = 0; j < 3; j++)
      {
        sum += a[i][j];
      }
      System.out.println("Sum of " + (i + 1) + " row is " + sum);
    }

    System.out.println("-----------------------------------");

    for (int i = 0; i < 3; i++)
    {
      int sum = 0;
      for (int j = 0; j < 3; j++)
      {
        sum += a[j][i];
      }
      System.out.println("Sum of " + (i + 1) + " column is " + sum);
    } 
	}
}
