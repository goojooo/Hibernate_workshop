package opps.constructor;

import java.util.Scanner;

public class Student {
	 int rollNo;
	String name;
	int marks;
	
	public Student(int r , String n , int m){
		this.rollNo = r;
		this.name = n;
		this.marks = m;
	}
	

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Roll No. = ");
		int r = sc.nextInt();
		
		sc.nextLine(); // buffer clean
		
		System.out.println("Enter name = ");
		String n = sc.nextLine();
		
		System.out.println("Enter Marks : ");
		int m = sc.nextInt();
		
		Student s = new Student(r , n , m);
		System.out.println(s);
		

		
		sc.close();
	}

}
