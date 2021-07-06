/*
Program of simple use of class (Page 3-49)
*/

public class test{

    int length;
    int width;

    public void area()
    {
        int a = length * width;
        System.out.println("Area = " + a);
    }

    public static void main(String args[])
    {
        test obj1 = new test();

        obj1.length = 10;
        obj1.width = 20;
        obj1.area();
    }
}
