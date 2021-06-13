// Program to perform Arthmatic operations on two floating number numbers.

import java.util.Scanner;

public class Program4{
	public static void main(String [] agrs)
	{
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
		float a = sc.nextFloat();
        System.out.println("Enter second number");	
		float b = sc.nextFloat();

		System.out.println("\na = " + a);
		// System.out.print(a);
		System.out.println("b = " + b);
        
        System.out.println("\n*******************Method one********************\n");
		System.out.println("Addition of a and b = " + (a + b));
		System.out.println("Subtraction of a and b = " + (a - b));
		System.out.println("Multiplication of a and b = " + (a * b));
		System.out.println("Division of a and b = " + (a / b));

		float add = a + b;
		float mult = a * b;
		float sub = a - b;
		float div = a / b;

        System.out.println("\n*******************Method second********************\n");
		System.out.println("Addition of a and b = " + add);
		System.out.println("Subtraction of a and b = " + sub);
		System.out.println("Multiplication of a and b = " + mult);
		System.out.println("Division of a and b = " + div);
	}
}
