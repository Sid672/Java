/** 
  * This is a program to calculate
  * area of circle using function
  */

import java.util.Scanner;

public class Program55{
    static void Area(float r)
    {
        float pi = 3.14f;
        float area = pi * r * r;
        System.out.println(area);
    }

    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter radius: ");
         float r = sc.nextFloat();
         Area(r);
    }
}
