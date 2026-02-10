package oops.inheritance;
class Vehicle{
	String brand ;
	int maxSpeed;
	
	Vehicle(String brand , int maxSpeed)
	{
		this.brand = brand;
		this.maxSpeed = maxSpeed;
	}
	
	void displayVehical()
	{
		System.out.println("Parent class :-");
		System.out.println("Brand : " + brand);
		System.out.println("Top speed : " + maxSpeed);
	}
}

class Car extends Vehicle{

	String model;
	double price;
	
	Car(String brand, int maxSpeed, String model, double price) {
		super(brand, maxSpeed);
		
		this.model = model;
		this.price = price;
	}
	
	void displayCar()
	{
		System.out.println("Child class :-");
		System.out.println("Model : " + model);
		System.out.println("Price : " + price);
	}
	
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("BMW" , 280, "XM5" , 2500000);
		
		c.displayVehical();
		c.displayCar();

	}

}
