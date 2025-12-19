package javaProgram;

import org.testng.annotations.Test;

public class StringProg {

	@Test
	public void stringObj() {
		String s="Geeta";
		Object obj="Geeta";//run time it will be String literal
		
		System.out.println(s.equals(obj));//true
		System.out.println(s==obj);//true
		String n = new String("Krishiv");
		Object obj1 = "Krishiv";

		System.out.println(n.equals(obj1)); // true (same content)
		System.out.println(n == obj1);      // false (different references)

	}
}
