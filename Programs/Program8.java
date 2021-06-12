import java.util.Scanner;

public class Main{
  public static void main(String [] agrs)
  {
    Scanner sc = new Scanner(System.in);

    float A, P, r, t;
    
    System.out.println("Enter Initial Principal balance:");
    P = sc.nextFloat();

    System.out.println("Enter annual intrest rate(in %): ");
    r = sc.nextFloat();
    r = r / 100;

    System.out.println("Enter time (in years): ");
    t = sc.nextFloat();

    A = P + P * r * t;
    System.out.println(A);
  }
}
