package programming;

public class DisplayNthDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=23578;
		int n=3;
		int count=0;
		while(num>0)
		{
			count++;
			if(count==n)
			{
				break;
			}
			num=num/10;
        }
		int ld=num%10;
		System.out.println(ld);
}

}
