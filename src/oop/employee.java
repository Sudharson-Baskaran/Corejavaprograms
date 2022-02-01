package oop;

public class employee {
	private String name;
	private int eid;
	private double salary;
	
	employee()
	{
		
	}
	employee(String name,int eid,double salary)
	{
		this.name=name;
		this.eid=eid;
		this.salary=salary;
		}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public int geteid()
	{
		return eid;
	}
	public void seteid(int eid)
	{
		this.eid=eid;
	}
	public double getsalary()
	{
		return salary;
	}
	public void setsalary(double salary)
	{
		this.salary=salary;
	}
	public void work()
	{
		System.out.println(name+ "salary is:" +salary);
	}

}
