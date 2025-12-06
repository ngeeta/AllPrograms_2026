package javaProgram;

import org.testng.annotations.Test;

public class tryCatchfinally {

	@Test
	public void test() {
		try {
			System.out.println("A");
			int c=10/0;
			System.out.println("B");

		}
		catch (ArithmeticException e) {
			System.exit(-2);
			System.out.println("C");
		}
		catch (Exception e) {
			System.out.println("D");
		}
		finally {
			System.out.println("E");

		}
	}
}
