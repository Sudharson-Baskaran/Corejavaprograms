package LoopingStatements;

public class R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=28;
		int sum=0;
		for (int i = 1; i <num; i++) {
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println(num+"It is a prefect number");
		}
		else {
			System.out.println("Not a prefect number");
		}
		}

	}


