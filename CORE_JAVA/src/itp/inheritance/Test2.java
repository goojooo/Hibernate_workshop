package itp.inheritance;


public class Test2 {

    public static void main(String args[]) {

        int[] ref = {1, 2, 3, 4, 5};

        Person[] people = {
                new Student("Rama", "Singh", 2020, "eDAC", 12345, 78),
                new Faculty("Amit", "Kulkarni", 10, "Java .Net REST")
        };

        // Looping through Person array
        for (Person p : people) {
            System.out.println(p);
        }

        // Reference Example
        people[0] = new Student("Rama", "Singh", 2020, "eDAC", 12345, 7);
        System.out.println(people[0]);
    }
}

