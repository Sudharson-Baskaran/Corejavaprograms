package programming;

public class PositionalvaluesOfDigits {

	public static void main(String[] args) {
		int num=12345;
		int count=0;
		int ld = 0;
		while (num>0) {
			ld=num%10;
			num=num/10;
			count++;
			if(count==1)
			{
				System.out.println(ld);
			}
			else if (count==2) {
				System.out.println(ld*10);
			}
			else if (count==3) {
				System.out.println(ld*100);

			}
			else if(count==4){
				System.out.println(ld*1000);
			}
			else if(count==5)
			{

				System.out.println(ld*10000);
			}
			else if(count==6)
			{
				System.out.println(ld*100000);
			}
		}

	}

}
