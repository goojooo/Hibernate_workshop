package itp.inheritance;

class A {
    private int x;
    private int y;

    public A() {
        System.out.println("In default of A class");
        x = 10;
        y = 20;
    }

    public A(int x, int y) {
        System.out.println("In para of A class");
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        System.out.println("In toString of A");
        return "x = " + x + ", y = " + y;
    }
}

class B extends A {
    private int p, q;

    public B() {
        super(); // calls A's default constructor
        System.out.println("In default of B class");
        p = 30;
        q = 40;
    }

    @Override
    public String toString() {
        return super.toString() + ", p = " + p + ", q = " + q;
    }
}

public class Test {


    public static void main(String[] args) {

//        Test t = new Test();

//        A refA = new A();
//        System.out.println(refA);

        System.out.println("------------------------------+");

        B refB = new B();
        System.out.println(refB);
        
        System.out.println("------------------------------+");
    }
}
