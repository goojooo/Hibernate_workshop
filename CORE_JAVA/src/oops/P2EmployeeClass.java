package oops;

class Employee
{
	private int id;
	private String name;
	private double sal;
	
	Employee()
	{
		 id = 101;
		name = "ccc";
		sal = 9999.00;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	double calculateAnnualSalary()
	{
		return sal * 12;
	}
	
	
}

public class P2EmployeeClass {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		System.out.println(e);
		System.out.println(e.calculateAnnualSalary());
	}

}
