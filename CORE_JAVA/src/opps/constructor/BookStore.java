package opps.constructor;

import java.util.Scanner;

public class BookStore {
	int bookId;
	String title;
	double price;
	
	BookStore(int bookId, String title, double price)
	{
		this.bookId = bookId;
		this.title = title;
		this.price = price;
	}
	
	void display()
	{
		System.out.println("Book ID is : " + bookId);
		System.out.println("Book Title is : " + title);
		System.out.println("Book Price is : " + price);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id : ");
		int id = sc.nextInt();
		sc.nextLine(); // buffer clean
		System.out.println("Enter Title : ");
		String title = sc.nextLine();
		System.out.println("Enter Price : ");
		double price = sc.nextDouble();
		
		BookStore b = new BookStore(id , title, price);
//		System.out.print(b);
		b.display();
		
		sc.close();

	}

}
