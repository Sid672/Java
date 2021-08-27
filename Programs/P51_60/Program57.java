//To take input in array;
import java.util.Scanner;

public class test{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
