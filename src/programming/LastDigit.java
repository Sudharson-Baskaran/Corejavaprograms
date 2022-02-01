package programming;

public class LastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=238;
		
		while(num>0)
		{
			System.out.println(num%10);
			num=num/10;
		}

	}

}
