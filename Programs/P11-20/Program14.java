public class test{
	public static void main(String []args)
	{
		int sum = 0; 
		int fact = 1;

		for (int i = 1; i <= 10; i++)
		{
			sum = sum + i;
		}

		for (int i = 1; i <= 5; i++)
		{
			fact = fact * i;
		}

		System.out.println("Sum = " + sum);
		System.out.println("factorial = " + fact);

	}
}
