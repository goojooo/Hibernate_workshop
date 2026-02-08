package opps.constructor;

import java.util.Scanner;

public class Reactangle {
	int length ,width;
	
	Reactangle(int length , int width)
	{
		System.out.println("Parameterized Called : ");
		this.length = length;
		this.width = width;
	}
	
	void calculateArea()
	{
		int calculateArea = 2 *(length * width);
		System.out.println("Area of reactangle : " + calculateArea);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values : ");
		Reactangle r1 = new Reactangle(sc.nextInt(),sc.nextInt());
		r1.calculateArea();

	}

}
