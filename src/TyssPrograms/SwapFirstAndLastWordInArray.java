package TyssPrograms;

public class SwapFirstAndLastWordInArray {

	public static void main(String[] args) {
		String s= "welocme to tyss";
		String[] Sarr = s.split(" ");

		String temp=Sarr[0];
		Sarr[0]=Sarr[Sarr.length-1];
		Sarr[Sarr.length-1]=temp;



		for (int i = 0; i < Sarr.length; i++) {
			System.out.print(Sarr[i]+" ");
		}
	}

}


