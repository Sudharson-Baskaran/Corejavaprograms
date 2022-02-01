package LoopingStatements;

public class L {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1468;
		int count=0;
		int ld=0;
		while(num>0)
		{
			ld=num%10;
			if(ld%2==0)
			{
				count++;
			}
			num=num/10;
		}
System.out.println(count);
	}

}
