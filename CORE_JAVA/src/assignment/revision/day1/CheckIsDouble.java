package assignment.revision.day1;

import java.util.Scanner;

public class CheckIsDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first double value :");
		
		if(!sc.hasNextDouble()) {
			System.out.println("Error : First input is not double...");
			sc.close();
			return;
		}
		double d1 = sc.nextDouble();
		
		System.out.println("Enter second value : ");
		
		if(!sc.hasNextDouble()) {
			System.out.println("Error : second input is not double...");
			sc.close();
			return;
		}
		double d2 = sc.nextDouble();
		
		System.out.println("Sum : " + (d1+d2));

	}

}
