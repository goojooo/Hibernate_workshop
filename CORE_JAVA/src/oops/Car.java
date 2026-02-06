package oops;

import java.util.Scanner;

public class Car {
	private String brand;
	private String model;
	private int price;
	
	public void setbrand(String brand)
	{
		this.brand=brand;
	}
	public void setModel(String model)
	{
		this.model=model;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public String getBrand()
	{
		return brand;
	}
	public String getModel()
	{
		return model;
	}
	public int getPrice()
	{
		return price;
	}

	 void displayCarDetails()
	{
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Price : " + price);
//		return brand + model + price;
	}
	public static void main(String[] args) {
	
		Car c = new Car();
		System.out.println("Car details : ");
		Scanner sc = new Scanner(System.in);
		c.setbrand(sc.nextLine());
		c.setModel(sc.nextLine());
		c.setPrice(sc.nextInt());
		
		c.displayCarDetails();

		sc.close();
	}

}
