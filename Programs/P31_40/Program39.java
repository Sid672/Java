//Program to calculate LCM

import java.util.Scanner;

public class test{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = 0;

        if (a > b)
        {
            max = a;
        }
        else
        {
            max = b;
        }
        
        int i = 2;
        int lcm = max;
        while (true)
        {
            if ((lcm % a == 0) && (lcm % b == 0))
            {
                System.out.println("LCM = " + lcm);
                break;
            }
            else
            {
                lcm = max * i;
            }
            i++;
            // System.out.println(lcm);
        }
    }
}
