package TyssPrograms;

public class B {

	public static void main(String[] args) {
		int num=7;
		int i=2;
		while(i<=num) {
			if(num%i==0)
			{
				break;
			}
			i++;
		}
		if(num==i)
		{
			System.out.println("Number is prime number");
		}
		else {
			System.out.println("Number is not a prime number");
		}

	}

}
