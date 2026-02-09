package assignment.interface_program;

import java.util.Scanner;

public class Test {
 public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
  // Create suitable data structure 
  //to hold the participant details
  System.out.println("enter no of capacity");
  Person[] participants = new Person[sc.nextInt()];
  boolean exit = false;
  int counter = 0;

  while(!exit) {
      System.out.println("Menu : 1. Register Student 2. Register Faculty 3. Display participant details 10 Exit");
      System.out.println("Choose Option");
      
      switch (sc.nextInt()) {
          case 1: // register student
              if (counter < participants.length) {
                  System.out.println("Enter student details : fn, ln, gradYear, courseName, fees, marks");
                  participants[counter++] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt());
              } else {
                  System.out.println("Event Full!!!!!!!!");
              }
              break;

          case 2: // register faculty
              if (counter < participants.length) {
                  System.out.println("Enter faculty details : fn, ln, exp in yrs sme");
                  participants[counter++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());
              } else {
                  System.out.println("Event Full!!!!!!!!");
              }
              break;

          case 3: // display all participant details
              for (Person p : participants) {
                  if (p != null) {
                      System.out.println(p); // calls p.toString()
                  }
              }
              break;

          case 10:
              exit = true;
              break;
      }
  }
 }

}
