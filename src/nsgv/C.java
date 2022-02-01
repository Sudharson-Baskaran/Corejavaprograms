package nsgv;

public class C {
	{
		System.out.println("From Non-static block");
	}
	C()
	{
		System.out.println("From c()-1"
				+ "");
	}
	C(int a)
	{
		System.out.println(a);
	}
	public void test()
	{
		System.out.println("From test()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("From main()");
C obj1=new C();
C obj2=new C(10);
obj1.test();



	}

}
