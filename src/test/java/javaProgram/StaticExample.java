package javaProgram;

import org.testng.annotations.Test;

public class StaticExample {
static int x=10;

static {
	x++;
}
	public static void main(String[] args) {
		StaticExample s=new StaticExample();
		System.out.println(x);
		System.out.println(s.x);

	}
}
