package javaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.testng.annotations.Test;

public class ListExample {
	List<String> actual=new ArrayList<String>(Arrays.asList("Swapnil","Geeta","Krishiv"));

	@Test
	public void iteratorEx() {
	System.out.println("Actual "+actual); //Maintain insertion Order
	System.out.println("----- Iterator -----");
	Iterator<String> itr=actual.iterator();
	while (itr.hasNext()) {
        System.out.print(itr.next() + " "); // Output: A B C
        
    }
	}
	@Test
	public void listIteratorEx() {
	System.out.println("Actual "+actual); //Maintain insertion Order
	System.out.println("----- ListIterator -----");
	ListIterator<String> itr=actual.listIterator();
	System.out.println("\nForward:");

	while (itr.hasNext()) {
        System.out.print(itr.next() + " "); // Output: A B C
    }
	System.out.println("\nBackWord :");
	while (itr.hasPrevious()) {
        System.out.print(itr.previous() + " "); // Output: A B C
    }
	}
}
