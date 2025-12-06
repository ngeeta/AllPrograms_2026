package javaProgram;

import org.testng.annotations.Test;

public class countWords {
@Test
public void c() {
	String n="My name is geeta";
	
	String newS[]=n.split("\\s+");
	System.out.println("No of words "+newS.length);
	String rev="";
	
	for(String s:newS) {
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
			
		}
		rev+=" ";
		
	}
	System.out.println(rev);
}
}
