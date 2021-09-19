/** program to check if a number is even or odd */
import java.util.Scanner;

public class test{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
   
        System.out.println("Enter number: ");
		int a = sc.nextInt();


		if (a % 2 == 0)
		{
			System.out.println(a + " is Even");
		}
		else
		{
			System.out.println(a + " is Odd");
		}
	}
}
