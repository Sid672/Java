// Program to perform Arthmatic operations on two numbers.

import java.util.Scanner;

public class test{
	public static void main(String [] agrs)
	{
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
		int a = sc.nextInt();
        System.out.println("Enter second number");	
		int b = sc.nextInt();

		System.out.println("\na = " + a);
		// System.out.print(a);
		System.out.println("b = " + b);
        
        System.out.println("\n*******************Method one********************\n");
		System.out.println("Addition of a and b = " + (a + b));
		System.out.println("Subtraction of a and b = " + (a - b));
		System.out.println("Multiplication of a and b = " + (a * b));
		System.out.println("Division of a and b = " + (a / b));

		int add = a + b;
		int mult = a * b;
		int sub = a - b;
		int div = a / b;

        System.out.println("\n*******************Method second********************\n");
		System.out.println("Addition of a and b = " + add);
		System.out.println("Subtraction of a and b = " + sub);
		System.out.println("Multiplication of a and b = " + mult);
		System.out.println("Division of a and b = " + div);
	}
}
