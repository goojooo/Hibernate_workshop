package oops;

import java.util.Scanner;

class StudentEx1
{
	private String name ;
	private int age;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}
public class DemoEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentEx1 s = new StudentEx1();
		System.out.println("Enter name : ");
		s.setName(sc.nextLine());
		
		System.out.println("Enter age : ");
		s.setAge(sc.nextInt());
		
		System.out.println("Student details : ");
		System.out.println("Name : " + s.getName());
		System.out.println("Age : " + s.getAge());
		

	}

}
