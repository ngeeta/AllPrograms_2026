package javaProgram;

import org.testng.annotations.Test;

public class Maths {

	
	@Test
	public void factorial() {
		int c=5;
		
		int fact=1;
		
		for(int i=1;i<=c;i++) {
			fact*=i;
		}
		System.out.println(fact);
	}
	
	
	@Test
	public void fibonacci() {
	int a=1,b=2;
	System.out.print(a+","+b+",");
	for(int i=2;i<10;i++) {
		int c=a+b;
		System.out.print(c+",");
		a=b;
		b=c;
	}
	}
	
	@Test
	public void sum() {
		int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for(int a:arr) {
        	sum+=a;
        }

System.out.println("Sum :: "+sum);
	}
}
