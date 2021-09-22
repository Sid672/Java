  /** Program to draw pattern no. 26
 A
 BA
 CBA
 DCBA  */

public class test{
  public static void main(String args[])
  {
    char c = 'A';
    char b = 'A';
    for (int i = 0; i < 4; i++)
    {
      c = b;
      for (int j = 0; j <= i; j++)
      {
        System.out.print(c);
        c--;
      }
      System.out.println();
      b++;
    }
  }
}
