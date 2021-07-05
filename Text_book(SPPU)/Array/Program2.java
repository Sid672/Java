/*
This is a Java program which makes use of 2D array. (Page No. 3-36)
*/


public class test{
	public static void main(String args[])
	{
		int a[][] = new int[3][3];
    int k = 0;

    System.out.println("Storing the numbers in array");

		for (int i = 0; i < 3; i++)
		{
            for (int j = 0; j < 3; j++)
            {
            	a[i][j] = k + 10;
            	k = k + 10;
            }
		}

    System.out.println("You have stored");

    for (int i = 0; i < 3; i++)
		{
            for (int j = 0; j < 3; j++)
            {
            	System.out.print(a[i][j] + " ");
            }
            System.out.println();
		}
	}
}
