package oops.inheritance;

class Personx {
	String name ;
	int age  ;
	
	Personx(String name , int age)
	{
		this.name = name;
		this.age=age;
	}
	
	void displayPerson()
	{
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
	

}
class Employee extends Personx{
	int empId;
	double sal ;
	
	Employee(String name , int age ,int empId, double sal)
	{
		super(name, age); // calling parent constructor
		
		this.empId = empId;
		this.sal = sal;
	}
	
	void displayEmployee()
	{
		System.out.println("In Emp class");
		System.out.println("Emp Id : " + empId);
		System.out.println("Salary : " + sal);
	}
}
public class Person{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee p = new Employee("Nayan" , 23, 102,77987.0);
		
		p.displayPerson();
		p.displayEmployee();
		
		
	}

}
