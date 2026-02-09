package assignment.interface_program;

public class Faculty implements Person {
    private String fn;
    private String ln;
    private int experience;
    private String sme;

    public Faculty(String fn, String ln, int experience, String sme) {
        this.fn = fn;
        this.ln = ln;
        this.experience = experience;
        this.sme = sme;
    }

    @Override
    public String toString() {
        return "Faculty [fn=" + fn + ", ln=" + ln +
               ", experience=" + experience +
               ", sme=" + sme + "]";
    }
}
