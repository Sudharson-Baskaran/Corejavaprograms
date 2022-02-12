package TyssPrograms;

public class PrintNames {
	static String name="Sudharson";
	static int count=1;
	public static void print()
	{
		if(count<101) {
			System.out.println(count+")"+name);
			count++;
			print();

		}


	}

	public static void main(String[] args) {


		print();
		System.out.println();

	}

}
