/*
Program to compare strings (Page 3-43)
*/

public class test{
    public static void main(String args[])
    {
        String str1 = new String("INDIA");

        String str2 = new String("india");

        if (str1.equals(str2))
        {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }
    }
}
