package javaProgram;

import org.testng.annotations.Test;

public class StringCompare {

	String a="Geeta";
	String b="Geeta";
	String c=new String("Geeta");
	String d=new String("Geeta").intern();


	
	@Test
	public void eqlMeth() {
		System.out.println(a.equals(b));//true
		System.out.println(a==b);//true
		
		System.out.println(a.equals(c));//true
		System.out.println(a==c);//false
		
		System.out.println(a.equals(d));//true
		System.out.println(a==d);//true

	}
	
	
}
