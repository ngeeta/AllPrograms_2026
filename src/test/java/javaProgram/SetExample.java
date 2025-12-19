package javaProgram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SetExample {

	@Test
	public void testSet() {
		Set<String> hashSet=new HashSet<String>();
		Set<String> linkedHashSet=new LinkedHashSet();
		Set<String> treeSet=new TreeSet<String>();

		System.out.println("------HashSet-------");
		hashSet.addAll(treeSet);
		hashSet.add("A");
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add("e");
		hashSet.add("f");
		hashSet.add("a");
		hashSet.add("Y");
		hashSet.add("X");

		hashSet.remove("f");
System.out.println(hashSet);	
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
