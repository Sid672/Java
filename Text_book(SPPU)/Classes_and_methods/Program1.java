/*
Program of simple use of class (Page 3-46)
*/

public class test{

    String name;
    int roll_no;
    double marks;

    public void display(String name, int roll_no, double marks)
    {
        System.out.println("Name : " + name);
        System.out.println("Roll no: " + roll_no);
        System.out.println("Marks : " + marks);
        System.out.println();
    }

    public static void main(String args[])
    {
        test obj1 = new test();
        test obj2 = new test();
        test obj3 = new test();

        obj1.display("Amar", 10, 76.65);
        obj2.display("Akbar", 20, 86.33);
        obj3.display("Anthony", 30, 96.07);
    }
}
