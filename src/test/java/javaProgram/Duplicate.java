package javaProgram;

import java.util.*;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Duplicate {
	@Test
public void duplicateChar() {
	String s="My name is geeta";
	String newS=s.replaceAll("\\s+", "").toLowerCase();
	Map<Character,Integer> map=new HashMap<Character, Integer>();
for(char c:newS.toCharArray()) {
	map.put(c, map.getOrDefault(c,0)+1);
}
System.out.println(map);
	for(Entry<Character,Integer> entry:map.entrySet()) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey() + " -> "+entry.getValue());
		}
	}
		
}
	
	@Test
	public void printUniqueString() {
		String a[]= {"A","B","A","C","C"};
List<String> names=new ArrayList<String>(Arrays.asList(a));
List<String> unq=new ArrayList<String>();
for(String s:names){
    if(!unq.contains(s)){
        unq.add(s);
    }
    /*
Iterator<String> itr=names.iterator();
while(itr.hasNext()) {
String word=itr.next();
if(unq.contains(word)) {
	itr.remove();
}
else {
	unq.add(word);
}*/
}
System.out.println(unq);



	}
	@Test
	public void findDupString() {
		String a[]= {"A","B","A","C","C"};
		Map<String,Integer> map=new HashMap<String, Integer>();
		for(String s:a) {
			map.put(s,map.getOrDefault(s,0)+1);
		}
		System.out.println(map);
	}
}
