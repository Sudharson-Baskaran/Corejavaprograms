package LoopingStatements;

public class O {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=21;
		int num1=30;
		while(num<=num1)
		{
			if(num==23||num==27)
			{
				num++;
				continue;
			}
			System.out.println(num);
			num++;
		}

	}

}