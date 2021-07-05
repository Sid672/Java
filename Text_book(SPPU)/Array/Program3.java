/*
Program of addition of two matrices and setting digonal elements to zero. (Page No. 3-37)
*/

public class test{
	public static void main(String args[])
	{
		int a[][] = {
			           {10, 11, 12},
			           {13, 14, 15},
			           {16, 17, 18}
			        };

		int b[][] = {
			          {1, 1, 1},
			          {1, 1, 1},
			          {1, 1, 1}
		            };

    int c[][] = new int[3][3];

    for (int i = 0; i < 3; i++)
    {
      for (int j = 0; j < 3; j++)
      {
        c[i][j] = a[i][j] + b[i][j]; 
      }
    }

    System.out.println("Addition of matrices: ");

    for (int i = 0; i < 3; i++)
    {
      for (int j = 0; j < 3; j++)
      {
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }

    //Now assign digonal elements of array to zero.

    for (int i = 0; i < 3; i++)
    {
      c[i][i] = 0;
    }

    System.out.println("Resultant matrix: ");

    for (int i = 0; i < 3; i++)
    {
      for (int j = 0; j < 3; j++)
      {
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }
	}
}
