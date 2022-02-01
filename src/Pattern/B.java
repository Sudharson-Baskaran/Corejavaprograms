package Pattern;
//1
//234
//56789
//1234567

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int num=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<(i*2)+1;j++)
			{

				System.out.print(num);
				num++;
				if(num==10)
				{
					num=1;
				}
			}

			System.out.println();
		}

	}
}