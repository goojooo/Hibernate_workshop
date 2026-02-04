package assignment.revision.day2;

import java.util.Scanner;

public class Box {
	private double length;
	private double width;
	private double depth;
	
	public Box(double length, double width, double depth) {
		this.length = length;
		this.width = width;
		this.depth = depth;
	}
	
	public double calVol()
	{
		return width * length * depth;
	}
	public void displayDetails()
	{
		System.out.println("Length : " + length);
		System.out.println("Width : " + width);
		System.out.println("Depth : " + depth);
	}
	
	public static void main(String[] args) {
	
		System.out.println("----------------------------");
		System.out.println("Enter details : ");
		System.out.println("----------------------------");
		Scanner sc = new Scanner(System.in);
		Box box1 = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		box1.displayDetails();
		System.out.println("Volumn of : " + box1.calVol());
	}

}
