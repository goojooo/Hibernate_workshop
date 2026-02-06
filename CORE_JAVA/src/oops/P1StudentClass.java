package oops;

import java.util.Scanner;

class Student
{
		private int rollNo;
		private  String Name;
		private  int marks;
		
		public Student()
		{
			System.out.println("Details : ");
			rollNo = 101;
			Name = "Object";
			marks = 90;
		}
		@Override
		public String toString()
		{
			System.out.println("In toString of Student : ");
			return "Roll No. = " + rollNo +" Name = " + Name+ " Marks = " + marks;
		}
	
//	Student(int rollNo, String Name, int marks)
//	{
//		this.rollNo = rollNo;
//		this.Name = Name;
//		this.marks = marks;
//	}
}

public class P1StudentClass {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Student details = new Student(sc.nextInt(),sc.nextLine(),sc.nextInt()); 
//		System.out.println(details);
		Student d = new Student();
		System.out.println(d);

	}

}
