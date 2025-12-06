package javaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class Reverse {

	
	@Test
	public void reverseArrayList() {
		List<String> output=new ArrayList<String>();
List<String> numbers=new ArrayList<String>(Arrays.asList("One","Two","Three","Four","Five"));
System.out.println(numbers);
for(String s:numbers) {
	String rev="";

	for(int i=s.length()-1;i>=0;i--) {
		rev+=s.charAt(i);
		
	}
	output.add(rev);
}

System.out.println(output);


	}
	
	
	@Test
	public void reverseSentence() {
	String sentence="My name is geeta.";
	boolean endsWithDot=sentence.endsWith(".");
	
	if(endsWithDot) {
		sentence=sentence.replace(".","");
		}
	String rev="";
	
	for(String s:sentence.split("\\s+")) {
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);}
			rev+=" ";

		}
		System.out.println(rev);
		
		  rev=rev.toString().trim();
		  
		  if(endsWithDot) { rev+="."; }
		 
		System.out.println(rev);
	}
	
	@Test
	public void reverseSentenceUsingStringBuilder() {
		System.out.println("reverseSentenceUsingStringBuilder");
	String s="My name is geeta.";
	boolean endsWithdot=s.endsWith(".");
	
	if(endsWithdot) {
		s=s.replace(".", "");
	}
	
	StringBuilder sb=new StringBuilder();
	
	for(String x:s.split("\\s+")) {
		sb.append(new StringBuilder(x).reverse());
		sb.append(" ");
	}
	if(endsWithdot) {
		sb.append(".").toString().trim();
	}
	System.out.println(sb);

	}
}
