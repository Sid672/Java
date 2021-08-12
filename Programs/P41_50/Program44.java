//Program to draw pattern:
// *******
// *     *
// * *** *
// * * * *
// * *** *
// *     *
// *******

public class test{
    public static void main(String agrs[])
    {
        int n = 7;
        for (int i = 0; i < n; i++)
        {
            if ((i == 0 || i == n - 1))
            {
                for (int j = 0; j < n; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
                continue;
            }

            if ((i == n / 2 - 1 || i == n / 2 + 1))
            {
                for (int j = 0; j < n; j++)
                {

                    if (j == n / 2 - 2 || j == n / 2  + 2)
                    {
                        System.out.print(" ");
                        continue;
                    }
                    System.out.print("*");
                }
                System.out.println();
                continue;
            }

            if ((i == n / 2))
            {
                for (int j = 0; j < n; j++)
                {
                    if (j == n / 2 - 2 || j == n / 2  + 2 || j == n / 2)
                    {
                        System.out.print(" ");
                        continue;
                    }
                    System.out.print("*");
                }
                System.out.println();
                continue;
            }

            for (int j = 0; j < n; j++)
            {
                if (j == 0 || j == 6)
                {
                    System.out.print("*");
                    continue;
                }

                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
