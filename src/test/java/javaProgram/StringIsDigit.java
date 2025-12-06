package javaProgram;

import org.testng.annotations.Test;

public class StringIsDigit {

	@Test
	public void test() {
		 String name = "Gee92ta8";

	        // Extract digits grouped as numbers
	        String temp = "";
	        int sum = 0;

	        for (int i = 0; i < name.length(); i++) {
	           // char ch = name.charAt(i);
	            if (Character.isDigit(name.charAt(i))) {
	                temp += name.charAt(i); // build the number
	                System.out.println("Temp "+temp);
	            } else {
	                if (!temp.isEmpty()) {
	                    sum += Integer.parseInt(temp);
		                System.out.println("Temp1 "+temp);
	                    temp = "";
	                }
	            }
	        }

	        // Add last number if any
	        if (!temp.isEmpty()) {
	            sum += Integer.parseInt(temp);
	        }

	        System.out.println("Output: of "+name+" :: " + sum); // Output: 100
 // Output: 100

	}
	
	@Test
	public void usingIsDigit() {
		String num="11abc12pqr2";
		int sum=0;
		for(int i=0;i<num.length();i++) {
			if(Character.isDigit(num.charAt(i))) {
				sum+=Integer.parseInt(String.valueOf(num.charAt(i)));
			}
		}
		System.out.println("Output: of "+num+" :: " + sum);
	}
	
	@Test
	public void testNumerals() {
		String num="11abc12pqr2";
		int sum=0;
		String temp="";
		for(int i=0;i<num.length();i++) {
			if(Character.isDigit(num.charAt(i))) {
				temp+=num.charAt(i);
			}
			else {
				if(!temp.isEmpty()) {
					sum+=Integer.parseInt(temp);
					temp="";
				}
			}
		}
		if(!temp.isEmpty()) {
			sum+=Integer.parseInt(temp);
		}
		System.out.println("Output: of "+num+" :: " + sum);
	}
}
