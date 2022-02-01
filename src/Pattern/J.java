package Pattern;

public class J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=4;
int num=1;
for (int i = 0; i <n; i++) {
	for (int j = 0; j <n; j++) {
		System.out.print(num+" ");
		num++;
		if(num==7)
		{
			num=0;
		}
	}
	
	System.out.println();
}
	}

}
