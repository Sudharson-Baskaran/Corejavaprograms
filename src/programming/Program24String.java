package programming;

public class Program24String {
//wap to display count of uppercase letters lowercase letters vowels consonants digits spaces and special characters present in a string?

public static void main(String[] args) {
	
String s= "hQBGeO1 5*";
char[] a = s.toCharArray();
int countnum=0;
int countlower=0;
int countupper=0;
int countvowels=0;
int countspace=0;
int countconsonants=0;
int specialchar=0;


for (int i = 0; i < a.length; i++) {
	if(a[i]>='0'&&a[i]<='9')
	{
		countnum++;
	}
	
	else if(a[i]>='a'&&a[i]<='z')
	{
		countlower++;
		if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
		{
		countvowels++;	

		}
		else
		{
			countconsonants++;
		}
	}
 else if(a[i]>='A'&&a[i]<='Z')
{
	
countupper++;
if(a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
{
countvowels++;	

}
else {
	countconsonants++;
}
}

 else if(a[i]==' ')
{
 countspace++;
}
 else {
	 specialchar++;
 }
}
System.out.println("Number of digits presents in a given string is : "+countnum);
System.out.println("Number of lowercase alphabets presents in a given string is : "+countlower);
System.out.println("Number of uppercase alphabets presents in a given string is : "+countupper);
System.out.println("Number of vowels presents in a given string is : "+countvowels);
System.out.println("Number of consonants presents in a given string is : "+countconsonants);
System.out.println("Number of space presents in a given string is : "+countspace);
System.out.println("Number of special characters present in a given string is : "+specialchar);


}	
	
	
}
