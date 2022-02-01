package programming;
//wap to sum the digits present in string
public class Program26 {                                          //char   num
                                                                  //'0'--->48
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="123ywiuw"; int sum=0;
		char[]ch=s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='0'&&ch[i]<='9') {
				sum=sum+(ch[i]-48);
			}
			
		}
		System.out.println(sum);
	}
}