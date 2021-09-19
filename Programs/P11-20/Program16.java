/** program to check if a number is even or odd*/
import java.util.Scanner;

public class test{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
   /** a number is taken as input from the user.*/
        System.out.println("Enter number: ");
		int a = sc.nextInt();


		if (a % 2 == 0)
		{
			/** on dividing the number with 2, if the remainder is 0,
			 * then the number is even and the code of this block will be executed.*/
			System.out.println(a + " is Even");
		}
		else
		{
			/** if the number is odd then this blocks code will be executed.*/
			System.out.println(a + " is Odd");
		}
	}
}
