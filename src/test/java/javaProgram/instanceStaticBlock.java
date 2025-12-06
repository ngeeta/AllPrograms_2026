package javaProgram;

import org.testng.annotations.Test;

public class instanceStaticBlock {

	{
		System.out.println("instance block");
	}
	
	static {
		System.out.println("static block");
	}
	
	@Test
	public void blk() {
		System.out.println("Method");
	}
}
