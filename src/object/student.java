package object;

public class student {
	int rollno;
	student()
	{
		
	}
	student(int rollno)
	{
		this.rollno=rollno;
	}
	public String toString()
	{
		return "rollno"+rollno;
	}
	public boolean equals(Object obj)
	{
		return this.rollno==((student)obj).rollno;
	}
	public int hashcode() {
		return rollno+4645747;
		
		

	}
	
	
}
