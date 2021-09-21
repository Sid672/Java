/** Program to calculate HCF */

import java.util.Scanner;

public class test{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = a > b ? b : a; 
        
        for (int i = min; i > 0; i--)
        {
            if ((a % i == 0) && (b % i == 0))
            {
                System.out.println("HCF = " + i);
                break;
            }
        }
    }
}
