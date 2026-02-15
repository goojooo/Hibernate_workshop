package itp.inheritance.assignment;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Person[] people = new Person[2];

        // -------- Student Input --------
        System.out.println("Enter Student Details");

        System.out.print("First Name: ");
        String sfname = sc.next();

        System.out.print("Last Name: ");
        String slname = sc.next();

        System.out.print("Year: ");
        int year = sc.nextInt();

        System.out.print("Course: ");
        String course = sc.next();

        System.out.print("Roll No: ");
        int roll = sc.nextInt();

        System.out.print("Marks: ");
        int marks = sc.nextInt();

        people[0] = new Student(sfname, slname, year, course, roll, marks);


        // -------- Faculty Input --------
        System.out.println("\nEnter Faculty Details");

        System.out.print("First Name: ");
        String ffname = sc.next();

        System.out.print("Last Name: ");
        String flname = sc.next();

        System.out.print("Experience (years): ");
        int exp = sc.nextInt();

        System.out.print("Subject: ");
        String subject = sc.next();

        people[1] = new Faculty(ffname, flname, exp, subject);


        // -------- Display Data --------
        System.out.println("\n===== Displaying Details =====");

        for (Person p : people) {
            System.out.println(p);
        }

        sc.close();
    }
}

