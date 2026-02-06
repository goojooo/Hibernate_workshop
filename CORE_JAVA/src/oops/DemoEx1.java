package oops;

import java.util.Scanner;

class StudentEx
{
	public String name;
	public int age;
}


public class DemoEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentEx s = new StudentEx();
		
		System.out.println("Enter name : ");
		s.name = sc.nextLine();
		
		System.out.println("Enter age : ");
		s.age = sc.nextInt();
		
		System.out.println("Students details : ");
		System.out.println("Name : " + s.name);
		System.out.println("Age : " + s.age);
		
	}

}
