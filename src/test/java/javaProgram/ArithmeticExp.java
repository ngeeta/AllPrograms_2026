package javaProgram;

import org.testng.annotations.Test;

public class ArithmeticExp {

	@Test
	public void negativeWeightUsingThrows() throws CustomExceptionNegativeValue{
		int a = 0,b = 0,c;
		try {
			
			 c=a/b;
		}
		catch (ArithmeticException e) {
			throw new CustomExceptionNegativeValue();
}
	}
	
	@Test
	public void negativeWeightUsingThrow() throws CustomExceptionNegativeValue {
		int a = 0,b = 0,c;
		try {
			
			 c=a/b;
		}
		catch (ArithmeticException e) {
throw new CustomExceptionNegativeValue("Value can not be "+b);
}
	}
}
