package LoopingStatements;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num=153; 
  int num1=num;
  int an=0;
  int ld=0;
  while(num>0)
  {
	  ld=num%10;
	  an=an+(ld*ld*ld);
	  num=num/10;
  }
 
  if(num1==an)
  {
	  System.out.println("number is armstrong number");
  }
  else
  {
	  System.out.println("number is not armstrong number");
  }
	}

}
