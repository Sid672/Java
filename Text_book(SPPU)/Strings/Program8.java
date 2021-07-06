/*
Program to use Uppercase and Lowercase in string. (Page 3-45)
*/

public class test{
    public static void main(String args[])
    {
        String str = new String("Nesha is Indian");
        System.out.println("Original string is :" + str);

        String s = str.toUpperCase();
        System.out.println("Upper Case string is : " + s);

        String l = str.toLowerCase();
        System.out.println("Lower Case string is : " + l);
        
    }
}
