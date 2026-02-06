package oops;

import java.util.Scanner;

public class Rectangle {
	private int length, width;

	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}
	
	int calculateArea()
	{
		return length * width;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length : ");
		r.setLength(sc.nextInt());
		System.out.println("Enter width : ");
		r.setWidth(sc.nextInt());
		
		System.out.println("Length : " + r.getLength() + " Width : "+r.getWidth());
		System.out.println("CalculateArea : " + r.calculateArea());
	}

}
