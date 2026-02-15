package itp.inheritance;


public class Faculty extends Person {

    private int experience;
    private String subject;

    public Faculty(String firstName, String lastName,
                   int experience, String subject) {

        super(firstName, lastName);
        this.experience = experience;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nRole : Faculty" +
                "\nExperience : " + experience + " years" +
                "\nSubject : " + subject +
                "\n----------------------";
    }
}

