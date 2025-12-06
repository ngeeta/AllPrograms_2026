package javaProgram;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SetExample {

	@Test
	public void testSet() {
		Set<String> set=new HashSet<String>();
		System.out.println("------HashSet-------");
		set.add("A");
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("e");
		set.add("f");
		set.add("a");
		set.add("Y");
		set.add("X");

		set.remove("f");
System.out.println(set);	
	}
	
	@Test
	public void testTreeSet() {
		Set<String> set=new TreeSet<String>();
		System.out.println("------TreeSet-------");

		set.add("A");
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("e");
		set.add("f");
		set.add("a");
		set.add("Y");
		set.add("X");
		set.remove("f");

		System.out.println(set);	

	}
}
