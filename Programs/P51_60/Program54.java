/** 
  * Program to print pattern no. 36;
  * 0 
  * 0 1 
  * 0 2 4 
  * 0 3 6 9 
  * 0 4 8 12 16
  */

public class Program54{
	public static void main(String args[])
	{
		int n = 5, k = 0;
		for (int i = 1; i <= n; i++)
		{
			k = 0;
            for (int j = 1; j <= i; j++)
            {
                System.out.print(k + " ");
                k += i - 1;
            }
            System.out.println();
		}
	}
}