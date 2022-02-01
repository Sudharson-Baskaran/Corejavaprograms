package programming;
//wap to convert lowecase to upper case


public class Program28 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Abcdef";

char[]ch=s.toCharArray();
for (int i = 0; i < ch.length; i++) {
	if(ch[i]>='a'&&ch[i]<='z')
	{
		ch[i]=(char)(ch[i]-32);
	}
	else if(ch[i]>='A'&&ch[i]<='Z')
	{
		ch[i]=(char)(ch[i]+32);
	}
	
	}
s=new String(ch);
System.out.println(s);

}
	
}





