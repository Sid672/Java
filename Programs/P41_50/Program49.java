//This is a program file to print pattern 31
//    1   
//   A B  
//  1 2 3 
// A B C D

//This program work better for odd number than even no.
/* Problem is n is even then i become odd, 
because of this an extra line will be printed 
that makes pattern unsymmetric.
*/

import java.util.Scanner;

public class Program49{
   public static void main(String args[])
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int  n = sc.nextInt(); 
        int l = 1;
        char a = 65;
        for (int i = 1; i <= n / 2 + 1; i++)
        {
            l = 1;
            a = 65;
            for (int j = 1; j <= n; j++)
            {
               if(i % 2 == 0)
               {
                    if (j % 2 == 0)
                    {
                         System.out.print(" ");
                    }
                    else if (j > n / 2 - i && j <= n / 2 + i)
                    {
                         System.out.print(a);
                         a++;
                    }
                    else 
                    {
                         System.out.print(" ");
                    } 
               }
               else 
               {
                    if (j % 2 != 0)
                    {
                         System.out.print(" ");
                    }
                    else if (j > n / 2 - i && j <= n / 2 + i)
                    {
                         System.out.print(l);
                         l++;
                    }
                    else
                    {
                         System.out.print(" ");
                    }
               }
            }
            System.out.println();
        }
   }
}


