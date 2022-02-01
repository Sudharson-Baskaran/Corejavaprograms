package Obj;

public class A {
	String name="Sudharson";
	int rollno=1;
	A()
	{

	}

	A(int rollno)
	{
		this.rollno=rollno;
	}
	public String toString()
	{
		return name;
	}
	public boolean equals(Object obj)
	{
		return this.rollno==((A)obj).rollno;
	}
	public int hashCode()
	{
		return rollno+366712642;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj1=new A(1);
		A obj2=new A(1);
		System.out.println(obj1);
		System.out.println(obj1.equals(obj2));
		
		
		System.out.println(obj1.hashCode());
System.out.println(obj2.hashCode());
	}

}
