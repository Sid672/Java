 /** Program to print pattern 28
 1
 3*2
 4*5*6
 10*9*8*7
 11*12*13*14*15  */

import java.util.Scanner;

public class test{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = 1, l = 0;

    for (int i = 1; i <= n; i++)
    {
      l = k + i - 1;
      for (int j = 1; j < 2 * i; j++)
      {

          if (j % 2 == 0)
          {
            System.out.print("*");
          }
          else  
          {
            if (i % 2 != 0)
            {
              System.out.print(k);
            }
            else
            {
              System.out.print(l);
              l--;
            }
            k++;
          }
      }
      System.out.println();
    }
  }
}
