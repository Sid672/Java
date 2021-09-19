/** program to print sum and factorial of numbers*/
public class test{
	public static void main(String []args)
	{
		/** intialization of variables.*/
		int sum = 0; 
		int fact = 1;
         /** loop to print sum of integers from 1 to 10;*/
		for (int i = 1; i <= 10; i++)
		{
			sum = sum + i;
		}
        /** run a loop to print factorial of 5*/
		for (int i = 1; i <= 5; i++)
		{
			/** after every iteration variable fact will have new value, and i will be incremented */
			fact = fact * i;
		}
/** sum is printed followed by factorial.*/
		System.out.println("Sum = " + sum);
		System.out.println("factorial = " + fact);

	}
}
