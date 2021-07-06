/*
Program of simple use of constructor in class  (Page 3-56)
*/

class complex{

    private double real, img;

    complex(int r, int i)
    {
        this.real = r;
        this.img = i;
    }
    
    complex (complex c)
    {
        System.out.println("Copy Constructor");
        real = c.real;
        img = c.img;
    }

    public void display()
    {
        System.out.println(real + " + " + img + "i");
    }

}

public class test{

    public static void main(String args[])
    {
        complex obj1 = new complex(10, 20);
        complex obj2 = new complex(obj1);
        complex obj3 = obj2;

        obj3.display();
    }
}
