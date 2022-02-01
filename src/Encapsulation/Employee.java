package Encapsulation;

public class Employee {

	String name;
	double salary;
	String designation;
	
	Employee()
	{
		
	}
	Employee(String name,double salary,String designation)
	{
		this.name=name;
		this.salary=salary;
		this.designation=designation;
	}
	public String getname()
	{
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void work()
	{
		System.out.println(name+" working as "+designation);
	}

	}


