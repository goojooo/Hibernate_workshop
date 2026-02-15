package itp.inheritance;


public class Student extends Person {

    private int year;
    private String course;
    private int marks;
    private int rollNo;

    public Student(String firstName, String lastName, int year,
                   String course, int rollNo, int marks) {

        super(firstName, lastName);
        this.year = year;
        this.course = course;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nRole : Student" +
                "\nYear : " + year +
                "\nCourse : " + course +
                "\nRoll No : " + rollNo +
                "\nMarks : " + marks +
                "\n----------------------";
    }
}

