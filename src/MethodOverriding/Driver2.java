package MethodOverriding;

public class Driver2 {
	public static void main(String[] args) {
		Animal a1=new Animal();
		a1.talk();
		Dog a2=new Dog();
		a2.talk();
		Lion a3=new Lion();
		a3.talk();
		Animal a4=a2;
		
		
	}

}
