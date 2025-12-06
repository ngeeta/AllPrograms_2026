package javaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class PrintContainsNum {

	
	@Test
	public void printStartsWithNos() {
		List<String> output=new ArrayList<String>();

List<String> names=new ArrayList<String>(Arrays.asList("1A","B","2A","C","12C"));
System.out.println("String starts with number :");
for(String n:names) {
	if(Character.isDigit(n.charAt(0))) {
		output.add(n);
	}
}
System.out.println(output);
	}
	
	
	@Test
	public void printWithNos() {
		List<String> output=new ArrayList<String>();

List<String> names=new ArrayList<String>(Arrays.asList("O1n2","Two2","3Three","Four","Fiv5"));
System.out.println("String contains number :");

for(String n:names) {
	
	for(int i=0;i<=n.length()-1;i++) {
		if(Character.isDigit(n.charAt(i))){
			output.add(n);
			break;
		}
	
}
}System.out.println(output);}

@Test
public void printEndsWithNos() {
List<String> names=new ArrayList<String>(Arrays.asList("O1n2","Two2","3Three","Four","Fiv5"));
List<String> output=new ArrayList<String>();
System.out.println("String Ends with number :");
for(String s:names) {
		if(Character.isDigit(s.charAt(s.length()-1))) {
			output.add(s);
		}
	
		
}
System.out.println(output);

}

	
	}
