package sgv;

public class C {
	static int i=test1();
	static int j=test1()+test2();
	public static int test1()
	{
		System.out.println("From test1()");
		return 100;
	}
	public static int test2()
	{
		System.out.println("From test2()");
		return 10+test1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("From main()");
		System.out.println(i);
		System.out.println(j);
		

	}

}
