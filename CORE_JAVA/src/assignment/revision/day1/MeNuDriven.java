package assignment.revision.day1;

import java.util.Scanner;

public class MeNuDriven {
	
	static int[] takeInput(Scanner sc) {
		System.out.println("Enter value of x and y : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		return new int[] {x,y};
	}
	
	static void add(int x, int y) {
		System.out.println("Addition : " + (x+y));
	}
	static void sub(int x, int y) {
		System.out.println("Substration : "+ (x-y));
	}
	static void multi(int x, int y) {
		System.out.println("Multiplication : " +(x*y));
	}
	static void div(int x , int y) {
		if(y == 0) {
			System.out.println("Division by zero is not possible : ");
			return;
		}
		System.out.println("Division : " +(x/y));
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("-----MENU------");
			System.out.println("Enter choice : ");
			System.out.println("1 : Addition :");
			System.out.println("2 : Substraction :");
			System.out.println("3 : Multiplication :");
			System.out.println("4 : Division :");
			System.out.println("5 : EXIT :");
			
			choice = sc.nextInt();
			if(choice >= 1 && choice <=4) {
				int[] values = takeInput(sc);
				int x = values[0];
				int y = values[1];
			
			switch(choice) {
			
			case 1 -> add(x,y);

			case 2 -> sub(x,y);
	
			case 3 -> multi(x,y);
		
			case 4 -> div(x,y);
			}
			}
			
			
		}while(choice!=5);
	System.out.println("Exited ! Thank you !");
	sc.close();

	}

}
