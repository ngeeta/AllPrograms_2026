package javaProgram;

import java.util.*;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class MapDemo {

	@Test
	public void iterateMap() {
		Map<String, Integer> scores = new HashMap<>();
		scores.put("Geeta", 95);
		scores.put("Rahul", 88);
		scores.put("Sneha", 95); // duplicate value allowed
		scores.put("Geeta", 99); // overwrites previous value
		System.out.println(scores.keySet() + " :: " + scores.values());

		System.out.println("-----map can iteratre------");
		for (String i : scores.keySet()) {
			System.out.println(i + " -> " + scores.get(i));
		}
		System.out.println("-----------");

		System.out.println(scores); // {Rahul=88, Sneha=95, Geeta=99}
		for (Entry<String, Integer> entry : scores.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		Map<String, Integer> newScores = new LinkedHashMap<>();
		newScores.put("Geeta", 95);
		newScores.put("Rahul", 88);
		newScores.put("Sneha", 95); // duplicate value allowed
		newScores.put("Geeta", 99); // overwrites previous value

		for (Entry<String, Integer> set : newScores.entrySet()) {
			System.out.println(set.getKey() + " -> " + set.getValue());
		}

		Iterator<Entry<String, Integer>> itr = scores.entrySet().iterator();
		System.out.println("Using ite");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	@Test
	public void sortMap() {
		Map<String, Integer> scores = new HashMap<>();
		scores.put("Geeta", 95);
		scores.put("Rahul", 88);
		scores.put("Sneha", 95); // duplicate value allowed
		scores.put("Geeta", 99); // overwrites previous value
		System.out.println("HashMap " + scores); // HashMap {Rahul=88, Geeta=99, Sneha=95}

		// Tree Map Naturally Sort By keys
		Map<String, Integer> sortedScores = new TreeMap<>(scores);
		System.out.println("TreeMap " + sortedScores); // {Geeta=99, Rahul=88, Sneha=95}

		Map<Integer, String> Emp = new HashMap<>();
		Emp.put(6, "Six");
		Emp.put(1, "One");
		Emp.put(3, "Three");
		Emp.put(7, "Seven");
		Emp.put(4, "Four");
		Emp.put(42, "FortyTwo");
		Emp.put(10, "Ten");

		Emp.put(99, "NinetyNine");

		Emp.put(2, "Two");

		// HashMap doesnot guarantee of sorting
		System.out.println("Emp HashMap " + Emp); // HashMap {Rahul=88, Geeta=99, Sneha=95}
		// Tree Map Naturally Sort By keys
		Map<Integer, String> sortedEmp = new TreeMap<>(Emp);
		System.out.println("Emp TreeMap " + sortedEmp); // {Geeta=99, Rahul=88, Sneha=95}

	}

}
