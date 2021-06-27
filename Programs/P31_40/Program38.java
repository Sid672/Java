//Program to find Armstrong number upto 1000;

public class test{
    public static void main(String args[])
    {
        System.out.println("Armstrong Numbers are: ");

        int sum = 0, term = 0, c = 0;
        
        for (int i = 1; i <= 1000; i++)
        {
            int a = i;
            sum = 0;
            while (a > 0)
            {
               c = a % 10;
               term = c * c * c; 
               sum = sum + term;
               a = a / 10;
            }

            if (sum == i)
            {
                System.out.println(i);
            }
        }
    }
}
