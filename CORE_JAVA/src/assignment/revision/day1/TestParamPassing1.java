package assignment.revision.day1;

public class TestParamPassing1 {

    public static void main(String[] args) {

        Emp e1 = new Emp(1, "xx", 1111);

        System.out.println("Original sal : " + e1.getSal());

        testMe(e1, 100);

        System.out.println("In main , after updation : " + e1.getSal());
    }

    static void testMe(Emp e, double inc) {
        e.setSal(e.getSal() + (int) inc);
    }
}
