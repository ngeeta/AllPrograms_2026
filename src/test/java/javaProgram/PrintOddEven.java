package javaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class PrintOddEven {
	List<Integer> actual=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	List<Integer> odd=new ArrayList<Integer>();
	List<Integer> even=new ArrayList<Integer>();
int evenCount,oddCount=0;
	
	@Test
	public void iteratorEx() {
		for(int m:actual) {
			if(m%2==0) {
				evenCount++;
				even.add(m);
				
			}
			else {
				oddCount++;
				odd.add(m);
			}
		}
		System.out.println("Odd : "+odd +" oddCount "+oddCount);
		System.out.println("Even : "+even +" evenCount "+evenCount);

	
	}
}
