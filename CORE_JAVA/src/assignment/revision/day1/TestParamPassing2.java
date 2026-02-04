package assignment.revision.day1;
public class TestParamPassing2 {

    public static void main(String[] args) {

        Empx e1 = new Empx(1, "xx", 1111);

        System.out.println("Original sal : " + e1.getSal());

        testMe(e1, 100);

        System.out.println("After updation : " + e1.getSal());
    }

    static void testMe(Empx e, double inc) {
        e.setSal(e.getSal() + (int) inc);
    }
}

class Empx {

    private int id;
    private String name;
    private int sal;

    public Empx(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}
