// Addition of Strings
import java.util.Scanner;

public class Program5{

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first word:");
		String a = sc.next();

		System.out.println("\nEnter second word:");
		String b = sc.next();

	        String add = a + b;
		System.out.println("\nOutput string:");
	        System.out.println(add);

	}
}
