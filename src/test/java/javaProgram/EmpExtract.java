package javaProgram;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;


import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

public class EmpExtract {
File file=new File("D:\\Edrive\\Study\\Geeta_Workspace\\com.PracticeAllProgram\\Configuration\\emp.json");

@Test
public void readEmp() throws IOException {
	ObjectMapper obj=new ObjectMapper();
	List<Map<String,Object>> all=obj.readValue(file, List.class);
	//address is Map

	for(Map<String,Object> x :all) {
		Map<String,Object> add =(Map<String,Object>)x.get("address");
		for(Map.Entry<String,Object> entry:add.entrySet()) {
			System.out.println(entry.getKey() +" : "+entry.getValue());
		}
		System.out.println("---------");
	}
	
	//Skill is list
	for(Map<String,Object> x :all) {
		System.out.println("Employee: " + x.get("firstName") + " " + x.get("lastName"));

		List<String> skill=(List<String>) x.get("skills");
		System.out.println("Skills: " + skill);

	}
}
}


