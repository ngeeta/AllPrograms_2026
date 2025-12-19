package javaProgram;

import org.testng.annotations.Test;

public class countWords {
@Test
public void c() {
	String n="My name is geeta";
	
	String newS[]=n.split("\\s+");
	System.out.println("No of words "+newS.length);
	String rev="";
	for(int i=0;i<newS.length;i++) {
		for(int j=newS[i].length()-1;j>=0;j--) {
			rev+=newS[i].charAt(j);
		}
		rev+=" ";
	}
	System.out.println(rev);
	
String s="My name is Sheetal";
	
	String newn[]=s.split("\\s+");
	System.out.println("No of words "+newn.length);
	String rev1="";
	for(String x:newn) {
		for(int j=x.length()-1;j>=0;j--) {
			rev1+=x.charAt(j);
		}rev1+=" ";
	}
	System.out.println(rev1);
}


@Test
public void countOddEven() {
	int Oddcount=0;
	int Evencount=0;

	for(int i=1;i<=99;i++) {
		if((i%2==1)) {
			Oddcount++;
		}
		else {
			Evencount++;
		}
}
	System.out.println("Oddcount "+Oddcount +" Evencount "+Evencount);
}
}
