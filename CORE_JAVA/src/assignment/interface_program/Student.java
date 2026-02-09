package assignment.interface_program;

public class Student implements Person {
    private String fn;
    private String ln;
    private int gradYear;
    private String courseName;
    private double fees;
    private int marks;

    public Student(String fn, String ln, int gradYear,
                   String courseName, double fees, int marks) {
        this.fn = fn;
        this.ln = ln;
        this.gradYear = gradYear;
        this.courseName = courseName;
        this.fees = fees;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [fn=" + fn + ", ln=" + ln +
               ", gradYear=" + gradYear +
               ", courseName=" + courseName +
               ", fees=" + fees +
               ", marks=" + marks + "]";
    }
}
