package Methods;

public class A {
	public static void print(int a)
	{
		if(a%2==0)
		{
			System.out.println(a);
		}
		if(a==101)
		{
			return;
		}

		a++;

		print(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(1);
	}

}
