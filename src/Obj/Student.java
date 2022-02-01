package Obj;

public class Student {
	String name;
	int sid;
	
	Student()
	{
		
	}
	Student(String name,int sid)
	{
		this.sid=sid;
		this.name=name;
	}
	public String toString()
	{
		return "SID:"+sid;
	}

}
