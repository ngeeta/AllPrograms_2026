package javaProgram;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateUsingJsonNode {
	
	//@Test
    public void empJson() throws JsonProcessingException, IOException {
    	ObjectMapper mapper=new ObjectMapper();
    	File f=new File("D:\\Edrive\\Study\\Geeta_Workspace\\com.PracticeAllProgram\\Configuration\\emp.json");
    	JsonNode root=mapper.readTree(f);
    	System.out.println(root.toString());
    	// Iterate over array
        for (JsonNode emp : root) {
            validateEmployee(emp);
        }}
	
	@Test
    public void empJsonPrint() throws JsonProcessingException, IOException {
		ObjectMapper mapper=new ObjectMapper();
    	File f=new File("D:\\Edrive\\Study\\Geeta_Workspace\\com.PracticeAllProgram\\Configuration\\emp.json");
    	JsonNode root=mapper.readTree(f);
    	System.out.println(root.toString());
    	for (JsonNode emp : root) {
    		System.out.println("ID: " + emp.get("id").asText());
            System.out.println("Name: " + emp.get("firstName").asText() + " " + emp.get("lastName").asText());
            System.out.println("Email: " + emp.get("email").asText());
            System.out.println("Position: " + emp.get("position").asText());
            System.out.println("Department: " + emp.get("department").asText());
            System.out.println("Active: " + emp.get("isActive").asBoolean());
            // Iterate skills array
            System.out.print("Skills: ");
            for (JsonNode skill : emp.get("skills")) {
                System.out.print(skill.asText() + " ");
            }

    	}
    	
    	
	}
	
	
	
        private static void validateEmployee(JsonNode emp) {
        	 // Required fields
            if (!emp.hasNonNull("id")) {
                System.out.println("Missing id");
            }
            if (!emp.hasNonNull("firstName") || !emp.hasNonNull("lastName")) {
                System.out.println("Missing name for employee " + emp.get("id"));
            }
            if (!emp.hasNonNull("email") || !emp.get("email").asText().contains("@")) {
                System.out.println("Invalid email for employee " + emp.get("id"));
            }
            if (!emp.has("skills") || !emp.get("skills").isArray()) {
                System.out.println("Skills must be an array for employee " + emp.get("id"));
            }
            if (!emp.has("address") || !emp.get("address").hasNonNull("city")) {
                System.out.println("Address missing city for employee " + emp.get("id"));
            }

            // Example: print valid employee
            System.out.println("Validated employee: " + emp.get("id").asText());
       
    	
    	
    }

}
