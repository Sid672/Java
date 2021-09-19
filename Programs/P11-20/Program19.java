/** a program to compare three numbers, which of them is greater.*/
import java.util.Scanner;

public class test{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
   /** three numbers are taken as input from the user.*/
        System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c)
		{
			/** if a is greater than b and a is greater than c then this block will be executed*/
			System.out.println(a + " is greater");
		}
		else if (b > a && b > c)
		{
			/** if b is greater than a and b is greater than c then this block will be executed.*/
			System.out.println(b + " is greater");
		}
		else
		{
			/** if both of the above conditions are false then it is obvious
			 * that c is greater among all the three numbers.
			hence this block will be executed.*/
			System.out.println(c + " is greater");
		}
	}
}
