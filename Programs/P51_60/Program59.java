/** Program with use of array */

import java.util.Scanner;

public class Program59{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int sume = 0, sumo = 0;
        for (int i = 0; i < 5; i++)
        {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++)
        {
            if (a[i] % 2 == 0)
            {
                sume += a[i];
            }
            else
            {
               sumo += a[i];
            }
        }
        System.out.println("Sum of odd number: " + sumo);
        System.out.println("Sum of even number: " + sume);
    }
}
