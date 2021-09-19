/**
* Programs taking input using args array 
* finding product of array
*/
public class test{
	public static void main(String[] args)
	{
		int s = 1;
		for (int i = 0; i < args.length; i++)
		{
			s =  s * Integer.parseInt(args[i]);
		}
		System.out.println("product = " + s);
	}
}
