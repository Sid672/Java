import java.util.Scanner;

public class test{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		float a, b, c, d, e;
		float total;

		System.out.println("Enter maximum marks of Subject: ");
		total = sc.nextFloat();

		System.out.println("Enter marks of Subject 1: ");
		a = sc.nextFloat();

		System.out.println("Enter marks of Subject 2: ");
		b = sc.nextFloat();

		System.out.println("Enter marks of Subject 3: ");
		c = sc.nextFloat();

		System.out.println("Enter marks of Subject 4: ");
		d = sc.nextFloat();

		System.out.println("Enter marks of Subject 5: ");
		e = sc.nextFloat();

	        float sum = (a + b + c + d + e ) / 5;
	        float percentage = (sum / total);
	        percentage = percentage * 100;
		System.out.println("Percentage: ");
		System.out.println(percentage);

	}
}
