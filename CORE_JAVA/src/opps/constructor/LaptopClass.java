package opps.constructor;

public class LaptopClass {
	String brand ;
	int ram;
	double price;
	
	LaptopClass()
	{
		brand = "Unknown";
		ram = 0;
		price = 0;
		System.out.println("Default constructor called : ");
	}
	
	LaptopClass(String brand , int ram , double price)
	{
		this.brand = brand;
		this.ram= ram;
		this.price = price;
		System.out.println("Paramaterized constructor : ");
	}
	
	void display()
	{
		System.out.println("Brand : " + brand + "| Ram : " + ram + "| Price : " + price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LaptopClass l1 = new LaptopClass();
		l1.display();
		
		LaptopClass l2 = new LaptopClass("MSI" , 8 , 50000.0);
		l2.display();
	}

}
