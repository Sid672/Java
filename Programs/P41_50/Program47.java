//Program to print pattern no. 29
//     A
//    CB
//   FED
//  JIHG
// ONMLK

import java.util.Scanner;

public class test{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Height of triangle: ");
        int n = sc.nextInt();

        char k;
        char l = 64;
        for (int i = 1; i <= n; i++)
        {
            l += i;
            k = l; 
            for (int j = 1; j <= n; j++)
            {
                if (j > n - i)
                {
                    System.out.print(k);
                    k--;
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
