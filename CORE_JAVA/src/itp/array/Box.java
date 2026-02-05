package itp.array;

import java.util.Arrays;
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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of boxes : ");
		Box[] b = new Box[sc.nextInt()];
		System.out.println(Arrays.toString(b));
		for(int i = 0 ; i < b.length ; i++)
		{
			System.out.println("Enter width , height depth : ");
			b[i]= new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		}
//		for(Box i : b)
//		{
//			System.out.println(i.calVol());
//		}
		System.out.println("--------------------------------------");
		for(int i = 0 ; i < b.length ; i++)
		{
			System.out.println(b[i].calVol());
		}

	}

}
