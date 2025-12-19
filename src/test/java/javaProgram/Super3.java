package javaProgram;

public class Super3 extends Super2{
	static {
		System.out.println("1. Super Keyword user to call parent class constructor");
	}
	Super3(){
		super(); //call
System.out.println("Super3 Constructor");
	}
	public static void main(String[] args) {
		new Super1();
		
	}
}
