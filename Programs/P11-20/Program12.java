public class test{
	public static void main(String[] agrs) 
	{
		int s = 1;
		for (int i = 0; i < agrs.length; i++)   
		{
			s =  s * Integer.parseInt(agrs[i]);

		}

		System.out.println("product = " + s);
	}
}
