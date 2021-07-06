/*
Program of simple use of constructor in class  (Page 3-52)
*/

class rectangle{
    int length;
    int width;

    rectangle()
    {
        System.out.println("Simple Constructor");
        length = 10;
        width = 20;
    }

    rectangle(int l, int w)
    {
        System.out.println("Parameterised Constructor");
        length = l;
        width = w;
    }

    void area()
    {
        int res = length * width;
        System.out.println("Area = " + res);
    }
}

public class test{

    public static void main(String args[])
    {
        rectangle obj1 = new rectangle();
        obj1.area();
        rectangle obj2 = new rectangle(11, 20);
        obj2.area();
    }
}
