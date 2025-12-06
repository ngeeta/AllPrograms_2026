package javaProgram;

import org.testng.annotations.Test;

public class Swap {

	@Test
	public void swapWithTemp() {
		int a=1,b=2,c;
		System.out.println("a - "+a+" b - "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("a - "+a+" b - "+b);
	}
	
	@Test
	public void swapWithoutTemp() {
		int a=100,b=200,c;
		System.out.println("a - "+a+" b - "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a - "+a+" b - "+b);
	}
	
	@Test
	public void swapString() {
		String a="Hello",b="World",c;
		System.out.println("a - "+a+" b - "+b);
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("a - "+a+" b - "+b);


	}
}
