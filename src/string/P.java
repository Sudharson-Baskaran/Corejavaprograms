package string;

public class P {

	public static void main(String[] args) {
		String s="map is map map map";
		int count=0;
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)=='m') {
				if(s.charAt(i+1)=='a') {
					if(s.charAt(i+2)=='p'){
						count++;
					}
				}
			}
		}
		System.out.println(count);

	}

}
