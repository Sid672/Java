/** Program to print pattern
 Diagram is symetric for odd numbers.
 Time Complexity: O(n^2);
 If n = 7 pattern is given below:
 *******
 *     *
 * *** *
 * * * *
 * *** *
 *     *
 *******   */

import java.util.Scanner;

public class test{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i == 0 || i == n - 1)
                {
                    System.out.print("*");
                    continue;
                }

                else if (j == 0 || j == n - 1)
                {
                    System.out.print("*");
                }

                else if (i == n / 2 - n / 4 || i == n / 2 + n / 4)
                {
                   if (j >= n / 2 - n / 4 && j <= n / 2 + n / 4)
                   {
                       System.out.print("*");
                   }

                   else
                   {
                       System.out.print(" ");
                   }
                }

                else if (i > n / 2 - n / 4 && i < n / 2 + n / 4)
                {
                    if (j == n / 2 - n / 4 || j == n / 2  + n / 4 && j != n / 2)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }

                else
                {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
