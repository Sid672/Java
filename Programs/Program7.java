import java.util.Scanner;

public class test{
	public static void main(String [] args)
	{
        Scanner sc = new Scanner(System.in);
        
        int l, b, h, volume;

        System.out.println("Enter length: ");
        l = sc.nextInt();

        System.out.println("Enter breadth: ");
        b = sc.nextInt();
        
        System.out.println("Enter height: ");
        h = sc.nextInt();
        
        volume = l * b * h;
         
        System.out.println("Volume of box: ");
        System.out.println(volume);
	}
}
