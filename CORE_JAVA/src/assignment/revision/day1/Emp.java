package assignment.revision.day1;

public class Emp {

    private int id;
    private String name;
    private int sal;

    public Emp(int id, String name, int sal) {
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
